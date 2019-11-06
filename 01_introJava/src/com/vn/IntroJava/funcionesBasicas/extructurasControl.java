/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.IntroJava.funcionesBasicas;

/**
 *
 * @author Equipo 1
 */
public class extructurasControl {
    
    public static void ejecutarBucles() {
        String untexto = "texto";
        char arrayChar[] = {'a', 'B', '8', '*'};

        for (int i = 0; i < arrayChar.length; i++) {
            System.out.println(arrayChar[i]);
        }
        System.out.println("");
        for (/*inicializacion*/int i = 0;/*condicion*/ i < untexto.length();/*incremento*/ i++) {
            System.out.println(untexto.charAt(i));
        }
        System.out.println("");
        int index = 0;
        while (index < arrayChar.length) {
            System.out.println("Index = " + index + ", char " + arrayChar[index]);
            index++; //index+=1; index=index+1;
        }
        for (index = 0; index < arrayChar.length; index++) {
            System.out.println("Index = " + index + ", char " + arrayChar[index]);
        }
        System.out.println("Mayusculas: " + untexto.toUpperCase().concat(" añadido"));
        index = 0;
        do {
            System.out.println("Index = " + index + ", char " + arrayChar[index]);
            index++;
        } while (index < arrayChar.length);
        for (char caracter : arrayChar) {
            System.out.println("char = " + caracter);
        }

    }

    public static void ejecutarCondiciones() {
        if ("Palabra".length() > 5) { //condicional simple
            System.out.println("palabra larga");
        }
        //condicional compuesta
        if ("texto".length() > 5) //por aqui no pasa
        {
            System.out.println("//por aqui no pasa");
        } else {
            System.out.println("palabra corta");
        }
        if ("en un lugar de la mancha".contains("lugar")) {
            System.out.println("contiene LUGAR");
        } else if ("en un lugar de la mancha".contains("MANCHA")) {
            System.out.println("contiene MANCHA");
        } else if ("en un lugar de la mancha".contains("OTRO")) {
            System.out.println("contiene OTRO");
        } else {
            System.out.println("no tiene ninguno por que estan en mayusculas");
        }
        int numeroPeq = 0;
        switch (numeroPeq + 5 - 5) {
            case 0:
                System.out.println("numeroPeq es igual a cero");
                break;
            case 1:
                System.out.println("numeroPeq es igual a uno");
                break;
            case 2:
                System.out.println("numeroPeq es igual a dos");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("numeroPeq es igual a tres, cuatro o cinco");
                break;
            default:
                System.out.println("es otro numero");
        }
    }
    
}
