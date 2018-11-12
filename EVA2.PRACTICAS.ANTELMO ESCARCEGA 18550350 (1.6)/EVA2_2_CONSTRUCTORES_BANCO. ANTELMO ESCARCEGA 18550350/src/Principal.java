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
        Banco bMiCuenta = new Banco();
        System.out.println("Nombre del cliente:" + bMiCuenta.getNombreCliente());
        System.out.println("Saldo del cliente:" + bMiCuenta.getSaldo());
        Banco bMiCuenta2 = new Banco("Camaron Gomez", 1200);
        System.out.println("Nombre del cliente: " + bMiCuenta2.getNombreCliente());
        System.out.println("Saldo del cliente: " + bMiCuenta2.getSaldo());
        //Impresion de nuestra cuenta de banco
    }
    
}
//nuestro constructor Banco
class Banco{
    private String nombreCliente;
    private double saldo;

    public Banco() {
        nombreCliente = "Antelmo Escarcega Fuentes";
        saldo = 1000000;
    }

    public Banco(String nombreCliente, double saldo) {
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }
    
    //metodos get y set de lo declarado dontro de banco

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}