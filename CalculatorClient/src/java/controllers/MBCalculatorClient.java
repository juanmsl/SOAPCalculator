/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named(value = "mBCalculatorClient")
@ManagedBean
@ViewScoped
public class MBCalculatorClient implements Serializable {

    private int a;
    private int b;
    private int suma;
    
    public MBCalculatorClient() {}

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }
    
    public void doOperation() {
        int suma = (int) add(this.getA(), this.getB());
        this.setSuma(suma);
    }

    private double add(double a, double b) {
        integration.calculator.WSCalculator_Service service = new integration.calculator.WSCalculator_Service();
        integration.calculator.WSCalculator port = service.getWSCalculatorPort();
        return port.add(a, b);
    }
}
