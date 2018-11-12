/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANTELMO ESCARCEGA FUENTES 18550350
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal pObjPpal = new Principal();
        Prueba pObjPrue = new Prueba();
        System.out.println(pObjPrue.X);
    }
    
}

class Prueba{
    int X;
    public Prueba() {
        X = 100;
    }
    
}
/*La primer practica de la segunda evaluación consiste en la utilicacion de los constructores
e imprimiento lo que se encuentra dentro del constructor mediante un objeto.

*/