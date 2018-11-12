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
        Operaciones oObj = new Operaciones();
        System.out.println("La suma de 5+7 = " + oObj.suma(5, 7));
        System.out.println("La suma de juan peres es: " + oObj.suma("Juan", "Perez"));
        System.out.println("True and false es " + oObj.suma(true, true));
                
        
    }
    
}

class Operaciones{
    public int suma(int iVal1, int iVal2){
        return iVal1 + iVal2;
    }
    public String suma(String sVal1, String sVal2){
        return sVal1 + sVal2;
    }
    public boolean suma(boolean bVal1, boolean bVal2){
        return bVal1 && bVal2;
    }
}
/*
En esta practica manejamos la sobrecarga en las clase Operaciones creamos 3 metodos uno de tipo de entero
otro String y el ultimo boolean. 
1. int suma contiene dos variables iVal1 e iVal2 este metodo nos recgresara la suma
de estas dos variables en este caso numeros enteros.
2. el segundo es String suma entonces esto significa que nos regresara valores de texto
3. boolean suma nos regresaria un valor con de verdadero o falso

  Operaciones oObj = new Operaciones();
        System.out.println("La suma de 5+7 = " + oObj.suma(5, 7));
        System.out.println("La suma de juan peres es: " + oObj.suma("Juan", "Perez"));
        System.out.println("True and false es " + oObj.suma(true, true));

creamos el objeto oObj e imprimimos los tres tipos de metodos suma.
*/
