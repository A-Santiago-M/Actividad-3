/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Santiago
 */
public class VentanaCubo extends JFrame implements 
    ActionListener {
    private Container contenedor;
    private JLabel lado, volumen, superficie;
    private JTextField campoLado;
    private JButton calcular;

    public VentanaCubo() {
        inicio();
        setTitle("Cubo"); 
        setSize(280,240);
        setLocationRelativeTo(null);
        setResizable(false); 
    }
    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null); 
      
        lado = new JLabel();
        lado.setText("lado (cms):");
        lado.setBounds(20, 80, 135, 23);
        campoLado = new JTextField();
        campoLado.setBounds(120, 80, 135, 23);
        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(120, 110, 135, 23);
        calcular.addActionListener(this);
        volumen = new JLabel();
        volumen.setText("Volumen (cm3):");
        volumen.setBounds(20, 140, 135, 23);
        superficie = new JLabel();
        superficie.setText("Superficie (cm2):");
        superficie.setBounds(20, 170, 135, 23);
       
        contenedor.add(lado);
        contenedor.add(campoLado);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        Cubo Cubo;
        boolean error = false;
        double lado = 0;
        try {
            lado = Double.parseDouble(campoLado.getText());
            Cubo = new Cubo(lado);
            volumen.setText("Volumen (cm3): " + String.format("%.2f", 
            Cubo.calcularVolumen()));
            superficie.setText("Superficie (cm2): " + String.format("%.2f",
            Cubo.calcularSuperficie()));
            } catch (Exception e) {
            error = true;
            } finally {
            if (error) {
            JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número",
            "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
