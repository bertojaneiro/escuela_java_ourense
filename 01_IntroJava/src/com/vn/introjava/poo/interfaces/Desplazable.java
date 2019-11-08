/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo.interfaces;

/** la forma en la que se comunican las clases que la implementen
 * es como una clase abstracta con solo metodos abstractos
 *
 * @author Equipo 1
 */
public interface Desplazable {
    //No deben usar variables miembro en interfaces
    //int propiedadNoApropiada=4;
    
    //unicamente declaracion de métodos abstractos
    public void mover(float metros);
    
    //public void mover(int metros);
    
    //public void detener();
}
