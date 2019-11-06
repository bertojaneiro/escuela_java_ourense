/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introJava.funcionesbasicas.POO.test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.vn.IntroJava.POO.Coche;

/**
 *
 * @author Equipo 1
 */
public class OperacionesBasicasObjetos {

    @Test
    public void creandoObjetos() {
        Coche miCoche = null;
        miCoche = new Coche();
        System.out.println("Texto de Coches: " + miCoche.toString());
        Coche miCocheFindes = new Coche();
        
        assertNotNull(miCoche);
        assertNotNull(miCocheFindes);
        assertNotEquals(miCoche, miCocheFindes);
        miCocheFindes=miCoche;
        miCoche.setMarca("Kia");
        miCocheFindes.setMarca("Hammer");
        miCoche.setMarca("Hammer Limusina");
        System.out.println("miCoche.marca       ="+miCoche.getMarca());
        System.out.println("miCocheFindes.marca ="+miCocheFindes.getMarca());
        
        
        assertEquals(miCoche, miCocheFindes);
        
        //Intro Polimorfismo
        Object refAmiCoche = miCoche; 
        //no podemos por que no tiene la forma de coche
        //si podemos invocar al metodo toString() o equals() que tienen todos
        assertTrue(refAmiCoche.equals(miCoche));
        
        Object ncoche = miCoche;
        
        
        System.gc();
//recolector de basura
        
        
        
        
    }

    public OperacionesBasicasObjetos() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @Before
    public void setUp() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
