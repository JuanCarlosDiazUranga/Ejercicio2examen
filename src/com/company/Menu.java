package com.company;

import com.company.entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void menutarea(){

        while(true) {
        System.out.print("1) Lista de muebles\nOpción: ");
        Scanner scanner = new Scanner(System.in);
        int opcion = Integer.parseInt(scanner.nextLine());
        if (opcion == 1) {
            List<Mueble> muebles= new ArrayList<>();

            Mueble armario= new Armario(1,2,3, Material.MADERA,4);
            Mueble armario1= new Armario(1,2,3,Material.METAL,4);
            Mueble armario2= new Armario(1,2,3,Material.PLASTICO,4);
            Mueble cajonera= new Cajonera(1,2,3,Material.MADERA,8);
            Mueble cajonera1= new Cajonera(1,2,3,Material.METAL,6);
            Mueble cajonera2= new Cajonera(1,2,3,Material.PLASTICO,4);
            Mueble silla= new Silla(1,1,2,Material.METAL,Boolean.TRUE);
            Mueble silla1= new Silla(2,1,2,Material.METAL,Boolean.FALSE);
            Mueble silla2= new Silla(3,1,2,Material.METAL,Boolean.TRUE);
            Mueble silla3= new Silla(4,1,2,Material.METAL,Boolean.FALSE);

            muebles.add(armario);
            muebles.add(armario1);
            muebles.add(armario2);
            muebles.add(cajonera);
            muebles.add(cajonera1);
            muebles.add(cajonera2);
            muebles.add(silla);
            muebles.add(silla1);
            muebles.add(silla2);
            muebles.add(silla3);
System.out.println(muebles);

        }else if (opcion == 2) {
        }
        else if(opcion == 0){

        }
    }
}
}
