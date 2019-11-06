/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.IntroJava;

/**
 *
 * @author Equipo 1
 */
public class datosBasicos {

    public static void mostrarTiposDatos() {
        System.out.println("Tipos de datos");
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
    }

    public static void probarOperadores() {
        //operadores unarios
        System.out.println("Negacion: " + !true);
        System.out.println("Negativo: " + -(10 + 5));
        int contador;
        contador = 10;
        System.out.println("Incremento: " + contador++);
        System.out.println("Incremento: " + ++contador);
        //conversion explicita
        System.out.println("Casting: " + (float) 3.343434343434);
        //operadores binarios: dos operandos
        System.out.println("Suma y mult " + (5 + 5) * 2);
        System.out.println("division " + (6 + 5) / 3); //3.666... muestra 3
        System.out.println("division " + (6 + 5) / (float) 3);
        System.out.println("resto " + 11 % 3);
        //conversion implicita
        System.out.println("division " + (6 + 5) / 3F);
        //booleanos
        System.out.println("Es cierto: " + (true && true));
        System.out.println("Es cierto: " + (true || false));
        //igualdad y similares
        System.out.println("Es cierto: " + ((5 == 5) || 5 > 9));
        System.out.println("Es cierto: " + (5 != 5 && 5 <= 9));
        //operadores bit a bit
        //00010101 = 21
        //00000111 = 7
        //00000101 = 5    AND
        //00010111 = 23   OR
        //00010010 = 18   XOR
        System.out.println("binario 21 and 7 = " + (21 & 7));
        System.out.println("binario 21 or 7 = " + (21 | 7));
        System.out.println("binario 21 xor 7 = " + (21 ^ 7));

    }
}
