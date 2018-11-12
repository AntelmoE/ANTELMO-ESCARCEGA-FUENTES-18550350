/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_metodos_estaticos;

/**
 *
 * @author ANTELMO ESCARCEGA FUENTES 18550350
 */
public class EVA2_4_METODOS_ESTATICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Aloha" + Operaciones.iValor);
        System.out.println(Math.cos(50));
    }
    
}

class Operaciones {
    static int iValor = 10;
    public static int suma(int iVal1, int iVal2){
        return iVal1+iVal2;
    }
    
    public static String suma(String sVal1, String sVal2){
        return sVal1 + sVal2;  
//Concatenamos
    }
    
    public static boolean suma(boolean bVal1, boolean bVal2){
        return bVal1 && bVal2; 
//And
    }
}

    
