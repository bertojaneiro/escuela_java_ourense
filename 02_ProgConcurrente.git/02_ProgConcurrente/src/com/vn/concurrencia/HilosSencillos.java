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
public class HilosSencillos 
{
    static int contCompartido = 0;
    
    HiloA hiloA1;
    HiloB hiloB1;
    HiloA hiloA2;
    HiloB hiloB2;

    public HilosSencillos() 
    {
        hiloA1 = new HiloA();
        hiloB1 = new HiloB();
        hiloA2 = new HiloA();
        hiloB2 = new HiloB();
    }
    
    class HiloA implements Runnable
    {
        @Override
        public void run() 
        {
            for (int i = 0; i < 500000; i++) 
            {
                contCompartido++;
                if (i%100==0) 
                {
                    System.out.println("Instruccion A:    "+i+" contador"+contCompartido);
                }
                
            }
        }
    }
    
    class HiloB implements Runnable
    {
        @Override
        public void run() 
        {//el contador principal j en variable local
            for (int j = 0; j < 800000; j++) 
            {
                contCompartido++;
                if (j%100==0) 
                {
                    System.out.println("->Ins B:"+j+"-contador:"+contCompartido);
                }
            }
        }
    }
    
    public void ejecutarHilosStartAB()
    {   
        System.out.println("\n***** THREAD - START *****\n");
        Thread threadHiloA1 = new Thread(hiloA1);
        Thread threadHiloB1 = new Thread(hiloB1);
        Thread threadHiloA2 = new Thread(hiloA2);
        Thread threadHiloB2 = new Thread(hiloB2);
        
        threadHiloA1.start();
        threadHiloB1.start();
        threadHiloA2.start();
        threadHiloB2.start();
        
        while(threadHiloA1.isAlive() || threadHiloB1.isAlive() || threadHiloA2.isAlive() || threadHiloB2.isAlive());
        System.out.println("\n***** end - START *****\n");
    }    
    public void ejecutarHilosRunAB()
    {
        System.out.println("\n***** THREAD - RUN *****\n");
        

        hiloA1.run();
        hiloB1.run();
        hiloA2.run();
        hiloB2.run();
        
        System.out.println("\n***** end - RUN *****\n");
    }
}
