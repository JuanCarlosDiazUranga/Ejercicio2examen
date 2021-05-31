package com.company.entities;

public  abstract  class Mueble {
   
    private int altura;
    private  int anchura;
    private int profundidad;
    Material material;
 ;




    public Mueble(int altura,int anchura,int profundidad,Material materiales) {
        this.altura=altura;
        this.anchura=anchura;
        this.profundidad=profundidad;
        this.material=materiales;
       
       
    }

    @Override
    public String toString() {
        return "Mueble{" +
                "altura=" + altura +
                ", anchura=" + anchura +
                ", profundidad=" + profundidad +
                ", material=" + material +
                '}';
    }
}



