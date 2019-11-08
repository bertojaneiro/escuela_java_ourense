/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo.sisdesplaz;

import com.vn.introjava.poo.interfaces.Desplazable;
import com.vn.introjava.poo.interfaces.Electrico;

/**
 *
 * @author Equipo 1
 */
public class BiciElectrica implements Desplazable, Electrico{

    @Override
    public void mover(float metros) {
        System.out.println("monopatin rueda "+ metros);
    }

    @Override
    public void cargarBateria(double voltios) {
        System.out.println("Cargamos "+voltios);
    }
    
}
