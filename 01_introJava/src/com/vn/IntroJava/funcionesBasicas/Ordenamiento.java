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
public class Ordenamiento {

    public static int[] ordenarArray(int[] enterosArray) {
        //declarar array de enteros y ordenarlos
//        int[] enterosArray = {34, 2, 15, 23, 0, -1};
        try {
            int orden = 0;
            do {
                for (int i = orden; i < enterosArray.length; i++) {
                    boolean peq = true;
                    for (int j = orden; j < enterosArray.length; j++) {
                        if (enterosArray[i] > enterosArray[j]) {
                            peq = false;
                        }
                    }
                    if (peq) {
                        int num = enterosArray[orden];
                        enterosArray[orden] = enterosArray[i];
                        enterosArray[i] = num;
                        System.out.print(enterosArray[orden] + " ");
                        orden++;
                    }
                }
            } while (orden < enterosArray.length);
            return enterosArray;
        } catch (Exception e) {
            return null;
        }

//        int enterosArray2[] = {34, 2, 15, 23, 0, -1, 6, 6, 300};
//        boolean nosalir = true;
//        for (int j = 0; j < enterosArray2.length && nosalir; j++) {
//            nosalir = false;
//            for (int i = 0; i < enterosArray2.length - 1; i++) {
//                if (enterosArray2[i] > enterosArray2[i + 1]) {
//                    int cambiar1 = enterosArray2[i];
//                    enterosArray2[i] = enterosArray2[i + 1];
//                    enterosArray2[i + 1] = cambiar1;
//                    nosalir = true;
//                }
//            }
//        }
//        System.out.println("");
//        for (int i : enterosArray2) {
//            System.out.print(i + " ");
//        }
//
//        int[] array = {4, 2, 3, 1};
//        int[] arrOrd = new int[array.length];
//        //Integer.MAX_VALUE
//        int menor = array[0];
//        int inicio =0;
//        do {
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] < menor) {
//                    menor = array[i];
//                }
//            }
//            arrOrd[0] = menor;
//            inicio++;
//            menor= array[inicio];
//        } while (inicio<array.length);
//
//        System.out.println("Menor: " + menor);
    }
}
