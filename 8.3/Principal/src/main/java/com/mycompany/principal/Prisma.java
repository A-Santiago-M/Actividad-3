/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Santiago
 */
public class Prisma extends FiguraGeométrica{
    private double base; 
    private double altura;
    private double lado;
    public Prisma(double base,double altura,double lado){
        this.base=base;
        this.altura=altura;
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
