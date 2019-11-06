
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.IntroJava;

import com.vn.IntroJava.funcionesBasicas.datosBasicos;
import com.vn.IntroJava.funcionesBasicas.extructurasControl;

/**
 * Clase principal del proyecto Ejemplos java
 *
 * @author Equipo 1
 */
public class Main {

    /**
     * Funcion que se ejecuta al arrancar el programa
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*System.out.println("Tipos de datos");
        byte unByte = 127;
        int unEntero = 2000000000; //4bytes
        long unLong = 200000000000000000L; // 8 bytes
        System.out.println("Byte: " + unByte);
        System.out.println("Entero: " + unEntero);
        System.out.println("Entero largo: " + unLong);
        float unDecimal = 1.23456789f; // 4 bytes 3 de mancisa uno de exponente
        System.out.println("Decimal: " + unDecimal);
        float otroDecimal = 1234567890123456f; // 4 bytes
        System.out.println("Decimal: " + otroDecimal);
        double decimalDoblePrec = 1.2345678901234567890;
        System.out.println("Decimal doble: " + decimalDoblePrec); // 8 bytes
        boolean condicion = true; // 1 byte
        char unCaracter = 'A'; // 2 bytes por el unicode
        System.out.println("Caracter en char: " + unCaracter);
        char unCharEntero = 97;
        System.out.println("Caracter en nº: " + unCharEntero);
        String untexto = "texto";
        System.out.println("String" + untexto);
        char arrayChar[] = {'a', 'B', '8', '*'};
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.println(arrayChar[i]);
        }
        System.out.println("");
        for (int i = 0; i < untexto.length();i++) {
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
         */
        datosBasicos.mostrarTiposDatos();
        extructurasControl.ejecutarBucles();
        extructurasControl.ejecutarCondiciones();
        datosBasicos.probarOperadores();
        int[] nuevoarray = {7, 6, 77, 24};
        arrayMil();
    }

    public static void insercion(int[] a) {
        int n = a.length;
        for (int i = 1; i <= n - 1; i++) {
            int x = a[i];
            int j = i - 1;
            while (j >= 0 && x < a[j]) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = x;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
    
    public static void arrayMil() {
        int x = (int) Math.round(Math.random()*1000);
        int[] otroarray = new int[x];
        for (int i = 0; i < otroarray.length; i++) {
            otroarray[i]=(int)Math.floor(Math.random()*1000);
        }
        insercion(otroarray);
    }
}
