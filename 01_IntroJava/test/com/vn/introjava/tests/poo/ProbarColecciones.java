/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.vehiculos.Coche;
import com.vn.introjava.poo.vehiculos.CocheRally;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 1
 */
public class ProbarColecciones {
    
    public ProbarColecciones() {
    }
    @Test
    public void testArrayListNoGenerica() {
        ArrayList lista = new ArrayList();
        // permita mezclar cosas
        // eso es malo
        lista.add(new Object());
        lista.add(new Coche("Coche"));
        lista.add("texto");
        lista.add(100);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elem ("+i+") ="+ lista.get(i).toString());
        }
    }
    
    @Test
    public void testArrayListGenericoON(){
        ArrayList<CocheRally> misCoches = new ArrayList<>();
        
        misCoches.add(new CocheRally("Subaru lunes"));
        misCoches.add(new CocheRally("Toyota martes"));
        misCoches.add(new CocheRally("Hammer FInde"));
        
        
        misCoches.get(2).arrancar("encender");
        misCoches.get(2).mostrarEstado();
        
        for (CocheRally miCoche : misCoches) {
            miCoche.avanzar();
        }
    }
    
    
    public void testColecciones(){
        HashMap<String, Coche> cochicos = new HashMap<>();
        
        cochicos.put("Lunes", new Coche("ford"));
        cochicos.put("Martes", new Coche("fiat"));
        cochicos.put("Miercoles", new Coche("renault"));
        cochicos.put("Jueves", new Coche("seat"));
        cochicos.put("Viernes", new Coche("bmw"));
        cochicos.put("Sabado", new Coche("masserati"));
        cochicos.put("Domingo", new Coche("pontiac"));
        System.out.println(cochicos.get("Lunes"));
        System.out.println(cochicos.get("Martes"));
        System.out.println(cochicos.get("Miercoles"));
    }
    
}
