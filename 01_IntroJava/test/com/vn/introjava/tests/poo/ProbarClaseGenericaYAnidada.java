/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;



import com.vn.introjava.poo.vehiculos.Coche;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 1
 */
public class ProbarClaseGenericaYAnidada {
    
    public static class ClasePequePos<T>{
        T x, y;
        public ClasePequePos(T x, T y){
            this.x=x;
            this.y=y;
        }
        @Override
        public String toString(){
            return "(x= " + x + ", y=" +y+")";
        }
    }
    
    @Test
    public void probarCLaseAnidada(){
        ClasePequePos unPunto2D= new ClasePequePos(3f, 5f);
        System.out.println("Punto2D "+ unPunto2D.toString());
        
    }
    
    @Test
    public void probarCLaseGenerica(){
        ClasePequePos unPunto2D= new ClasePequePos(3f, 5f);
        System.out.println("Punto2D "+ unPunto2D.toString());
        //aqui indicamos explicitamente el tipo
        ClasePequePos<String> unPunto2dstr = new ClasePequePos<>("tres", "cinco");
        System.out.println("Punto 2d str: "+ unPunto2dstr.toString());
    }
    
    
    
}
