/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Santiago
 */
public class Cubo extends FiguraGeométrica{
    private double lado;
    public Cubo(double lado){
        this.lado=lado;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
    public double calcularVolumen() {
        double volumen = Math.pow(lado, 3.0);
        return volumen;
    }
    public double calcularSuperficie() {
        double superficie = Math.pow(lado, 2.0)*6;
        return superficie;
    }
}
