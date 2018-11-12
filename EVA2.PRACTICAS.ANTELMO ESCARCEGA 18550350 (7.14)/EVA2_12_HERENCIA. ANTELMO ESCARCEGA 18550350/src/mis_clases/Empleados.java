/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mis_clases;

/**
 *
 * @author ANTELMO ESCARCEGA FUENTES 18550350
 */
public class Empleados extends Persona {//la clase Empleados se extiende a la clase Persona.
    private double salario;
//metodos get y set
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
