/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo.sisdesplaz;

import com.vn.introjava.poo.interfaces.Desplazable;

/**
 *
 * @author Equipo 1
 */
public class Monopatin implements Desplazable {

    @Override
    public void mover(float metros) {
        System.out.println("monopatin rueda "+ metros);
    }
    
    
}
