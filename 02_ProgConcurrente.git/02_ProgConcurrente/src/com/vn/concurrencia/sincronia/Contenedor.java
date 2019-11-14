package com.vn.concurrencia.sincronia;
/**
 * tiene que gestionar el recurso compartido
 * @author Equipo 1
 */
public class Contenedor {
    // Normalmente será un array, lista, bb.dd., 
    // mapa, fichero, DAO, servicio web, cualquier recurso compartido...
    int dato;
    //semaforo: false no se puede usar el recurso
    //          true si se puede usar
    boolean haydato = false;
    
    public synchronized int get() {
        while(!haydato){
            try{
                this.wait();
            }catch(InterruptedException e){}
        }
        System.out.println("Consumidor. GET: " + dato);
        haydato=false; //marcamos para bloquear
        this.notifyAll();
        return dato;
    }
    public synchronized void put(int valor) {
        dato = valor;  //marcamos para liberar el recurso
        while(haydato){
            try{
                this.wait();
            }catch(InterruptedException e){
            }
        }
        System.out.println("Productor. PUT: " + dato);
        this.notifyAll();
        haydato=true;
    }
}
