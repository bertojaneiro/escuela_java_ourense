/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.concurrencia;

/**
 *
 * @author Equipo 1
 */
public class Main 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        HilosSencillos hs = new HilosSencillos();
        
        Long timeIni = System.currentTimeMillis();
        hs.ejecutarHilosRunAB();
        String m1 = mostrarTiempo(timeIni, "RUN en serie ha tardado: ");
        
        timeIni=System.currentTimeMillis();
        hs.ejecutarHilosStartAB();
        mostrarTiempo(timeIni, "START en serie ha tardado: ");
        System.out.println(m1);
        
        HilosConcurrencia hc = new HilosConcurrencia();
        long timeIni2 = System.currentTimeMillis();
        hc.ejecutarHilosRun();
        String m2 = mostrarTiempo(timeIni2, "RUN en serie ha tardado: ");
        
        timeIni2=System.currentTimeMillis();
        hc.ejecutarHilosStart();
        mostrarTiempo(timeIni2, "START en serie ha tardado: ");
        System.out.println(m2);
    }
    
    static String mostrarTiempo(long timeInicial, String mensaje)
    {
        double tiempoTotal = (double)(System.currentTimeMillis() - timeInicial)/1000.0;
        String mensajeRet = mensaje+tiempoTotal;
        System.out.println(mensaje+tiempoTotal);
        return mensajeRet;
    }
}
