/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.concurrencia;

import java.util.ArrayList;


/**
 *
 * @author Equipo 1
 */
public class HilosConcurrencia 
{
    static long contCompartido = 0;
    Thread[] hilosEstatico= new Thread[30];
    Thread[] hilosEstatico2= new Thread[30];
    Hilos[] hilosHilos;
    Hilos2[] hilosHilos2;

    public HilosConcurrencia()
    {
        hilosHilos = new Hilos[30];
        hilosHilos2 = new Hilos2[30];
    }

    class Hilos implements Runnable
    {
        @Override
        public void run() 
        {
            for (int v = 0; v < 200; v++) 
            {
                contCompartido++;
                System.out.println("Instruccion: "+v+" Contador: "+contCompartido);
            }
        }
    }
    
    class Hilos2 implements Runnable
    {
        @Override
        public void run() 
        {
            for (int v = 0; v < 200; v++) 
            {
                contCompartido++;
                System.out.println("Instruccion2: "+v+" Contador: "+contCompartido);
            }
        }
    }
    
    public void ejecutarHilosStart()
    {   
        System.out.println("\n***** THREAD - START *****\n");
        for (int i = 0; i < hilosEstatico.length; i++) 
        {
            hilosHilos[i] = new Hilos();
            hilosHilos2[i] = new Hilos2();
            
            
            hilosEstatico[i] = new Thread(hilosHilos[i]);
            hilosEstatico2[i] = new Thread(hilosHilos2[i]);
        }
        for (Thread hilosEst : hilosEstatico) 
        {
            hilosEst.start();
        }
        for (int x = 0; x < hilosEstatico.length; x++) 
        {
            while(hilosEstatico[x].isAlive());
            while(hilosEstatico2[x].isAlive());
        }
        System.out.println("\n***** end - START *****\n");
    } 
    
    public void ejecutarHilosRun()
    {
        System.out.println("\n***** THREAD - RUN *****\n");
        for (int i = 0; i < hilosEstatico.length; i++) 
        {
            hilosHilos[i] = new Hilos();
            hilosHilos2[i] = new Hilos2();
            hilosEstatico[i] = new Thread(hilosHilos[i]);
            hilosEstatico2[i] = new Thread(hilosHilos2[i]);
        }
//        for (Thread hilosEst : hilosEstatico) 
//        {
//            hilosEst.run();
//        }
        for (int y = 0; y < hilosEstatico.length; y++) {
            hilosEstatico[y].run();
            hilosEstatico2[y].run();
        }
        System.out.println("\n***** end - RUN *****\n");
    }
    
}
