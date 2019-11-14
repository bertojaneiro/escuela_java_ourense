package com.vn.concurrencia.sincronia;

public class Consumidor extends Thread {

    private Contenedor contenedor;

    public Consumidor(Contenedor c) {
        contenedor = c;
    }
    
    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            int value = 0;
           
            value = contenedor.get();

            
        }
        
    }
}
