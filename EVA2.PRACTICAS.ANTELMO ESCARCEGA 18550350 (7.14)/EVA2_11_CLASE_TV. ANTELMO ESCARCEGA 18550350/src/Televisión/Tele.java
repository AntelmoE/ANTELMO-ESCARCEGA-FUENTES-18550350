/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Televisión;

import java.util.Scanner;

/**
 *
 * @author ANTELMO ESCARCEGA FUENTES 18550350
 */
public class Tele {
     // Agregamos metodos
    private boolean Encendido;
    private int chanel; 
    private int volumen;

    public Tele() {
    Encendido= false;
    volumen= 0;
    chanel = 1;

} 
    public Tele(boolean Encendido, int chanel, int volumen) {
        Encendido = false;
        chanel = 1;
        volumen = 0;
    }
    
    
    
    public void prender(){
        Encendido = true;
    }
    
    public void apagar(){
        Encendido = false;
    }
    
    
    public void cambiarcanal (){
    chanel = chanel+1;
    }
    public void sumarvolumen(){
    volumen = volumen+1;
    }

    
    
    public boolean isEncendido() {
        return Encendido;
    }

    public void setEncendido(boolean encendido) {
        this.Encendido = encendido;
    }

    public int getCanal() {
        return chanel;
    }

    public void setCanal(int canal) {
        this.chanel = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    
    
    //Cambio de canal
    public int  cambiarcanal (int canal ){
        System.out.println("Deseas cambiar de canal? 1 = si 2 = no");
        if(canal!=1){
        cambiarcanal();
    
    
}
    return canal;
}
}
