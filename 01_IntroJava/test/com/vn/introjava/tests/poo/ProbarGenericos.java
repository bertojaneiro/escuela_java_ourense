/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.vehiculos.Coche;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 1
 */
public class ProbarGenericos {
    
    @Test
    public void testearClaseAnidada(){
        ProbarClaseGenericaYAnidada.ClasePequePos c;
        c = new ProbarClaseGenericaYAnidada.ClasePequePos(3f, 5f);
    }
    
    @Test
    public void testearMetodosGenericos(){
        ArrayList<Integer> listIn= new ArrayList<>();
        int tres = 3, cinco = 5;
        
        //insertarIntegerDuplicado(listIn, tres);
        //insertarIntegerDuplicado(listIn, cinco);
        insertarDuplicado(listIn, tres);
        insertarDuplicado(listIn, cinco);
        System.out.println("Tres sigue siendo "+ tres);
        for (Integer integer : listIn) {
            System.out.println(" -"+ integer);
        }
        ArrayList<String> lisStr = new ArrayList<>();
        insertarDuplicado(lisStr, "tres");
        insertarDuplicado(lisStr, "cinco");
        for (String unString : lisStr) {
            System.out.println(" -"+ unString);
        }
        ArrayList<Coche> listCoche = new ArrayList<>();
        Coche pontiac = new Coche("pontiac");
        Coche masserati = new Coche("masserati");
        insertarDuplicado(listCoche, pontiac);
        insertarDuplicado(listCoche, masserati);
        for (Coche coch : listCoche) {
            System.out.println(" -"+ coch);
        }
        ArrayList<Coche> listCo = new ArrayList<>();
        listCo.add(pontiac);
        listCo.add(masserati);
        System.out.println("Ultimo elemento "+insertarTipos(listCo));
        
        Integer ultInt = insertarTipos(listIn);
        String ultStr = insertarTipos(lisStr);
        Coche ultCoche = insertarTipos(listCo);
        assertEquals(ultInt, (Integer)5);
        assertEquals(ultStr, "cinco");
        assertEquals(ultCoche, masserati);
        
    }
    /* Metodos no genericos
    static void insertarIntegerDuplicado(ArrayList<Integer> listaGenerica, int i){
        listaGenerica.add(i);
        listaGenerica.add(i);
        System.out.println(i+" añadido dos veces");
        i = i + 10;
        listaGenerica= null;//solo "borramos" la referencia
    }
    
    static void insertarIntegerDuplicado(ArrayList<String> listaString, String str){
        listaString.add(str);
        listaString.add(str);
        System.out.println(str+" añadido dos veces");
        str = str + "10";
        listaString= null;//solo "borramos" la referencia
    }*/
    
    //entre menor que y mayor que ponemos el nombre del tipo generico
    //esto convierte el metodo en un  metodo generico
    static  <Tipo>  void insertarDuplicado(ArrayList<Tipo> listaGenerica, Tipo objeto){
        listaGenerica.add(objeto);
        listaGenerica.add(objeto);
        System.out.println(objeto+" añadido dos veces");
        if (objeto instanceof Integer) {
            Integer i = (Integer) objeto;
            i=i+2;
        }
        listaGenerica= null;//solo "borramos" la referencia
    }
    //metodo generico que reciba un arraylist de un tipo que lo muestre y que devuelva el ultimo
    
    static  <Tipo> Tipo insertarTipos(ArrayList<Tipo> listaGenerica){
        System.out.println("---------------------");
        for (Tipo tip : listaGenerica) {
            System.out.println(tip);
        }
        if (listaGenerica.size()<0) {
            return null;
        }else return listaGenerica.get(listaGenerica.size()-1);
    }
    
}
