package com.company.entities;

public class Silla  extends Mueble{
    boolean ruedas;

    public Silla(int altura, int anchura, int profundidad, Material materiales,Boolean ruedas) {
        super(altura, anchura, profundidad, materiales);
    }
}
