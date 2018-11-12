
import Televisión.Tele;
import java.util.Scanner;

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
        
        Scanner sc = new Scanner (System.in); 
       Tele vc = new Tele ();
       vc.isEncendido();
        // Verificar si la tele esta prendida
            if(!vc.isEncendido()){
            vc.prender();//se ejecuta
                System.out.println("Esta encendido");
    }
            vc.cambiarcanal();
            System.out.println("Tu canal es " + vc.getCanal());
    }
    
}
