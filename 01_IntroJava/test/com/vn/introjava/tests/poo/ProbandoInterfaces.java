/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.interfaces.Desplazable;
import com.vn.introjava.poo.interfaces.Electrico;
import com.vn.introjava.poo.sisdesplaz.Avion;
import com.vn.introjava.poo.sisdesplaz.BiciElectrica;
import com.vn.introjava.poo.sisdesplaz.Monopatin;
import com.vn.introjava.poo.sisdesplaz.MonopatinElectrico;
import com.vn.introjava.poo.vehiculos.Coche;
import com.vn.introjava.poo.vehiculos.CocheElectrico;
import com.vn.introjava.poo.vehiculos.CocheRally;
import com.vn.introjava.poo.vehiculos.Vehiculo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 1
 */
public class ProbandoInterfaces {
    
    @Test
    public void creandoDesplazables(){
        Avion miAvionDeLosLunes = new Avion();
        miAvionDeLosLunes.mover(50.1f);
        
        Desplazable d1 = new Avion();
        d1.mover(0);
        Avion aviond1 = (Avion)d1;
        aviond1.volar(20f);
        
        
        Monopatin miLongboard = new Monopatin();
        miLongboard.mover(10f);
        Desplazable d2 = new Monopatin();
        d2.mover(32f);
        assertTrue(d1 instanceof Avion);
        
    }
    
    @Test
    public void moviendoVehiculosDesplazables(){
        CocheRally cocheRally = new CocheRally("COCHE RALLY PROPIO 3D");
        Coche cocheR = cocheRally;
        Vehiculo vehiculoR = cocheRally;
        Desplazable desplazR = cocheRally;
        cocheR.arrancar();
        vehiculoR.mostrarEstado();
        desplazR.mover(0);
        
        if (desplazR instanceof CocheRally) {
            
            ((CocheRally) desplazR).setRozamiento(10f);
            assertEquals(((CocheRally) desplazR).getRozamiento(), 10f, 0);
        }
    }
    
    @Test
    public void arrayInterfaces(){
        Electrico[] cosasElectricas = new Electrico[]{
            new MonopatinElectrico(),
            new BiciElectrica()
        };
        cosasElectricas[0].cargarBateria(3d);
        cosasElectricas[1].cargarBateria(67d);
        if (cosasElectricas.length !=2) {
            fail("No tiene 2 elementos");
        }
    }

    // public void hello() {}
}
