/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vizesonrasi_2;

/**
 *
 * @author TA
 */
public class ToplamaForm_GridLayout extends javax.swing.JFrame {

    public ToplamaForm_GridLayout() {

        initComponents();
    }

    private void initComponents() {
        //getContentPane().setLayout(new java.awt.GridLayout(4, 2));
        setLayout(new java.awt.GridLayout(4, 2));
        //ALTI DENEYİNİZ
        //setLayout(new java.awt.GridLayout(8, 1));
        add(new javax.swing.JLabel("1. Sayı"));
        add(new javax.swing.JTextField());

        add(new javax.swing.JLabel("2. Sayı"));
        add(new javax.swing.JTextField());

        add(new javax.swing.JButton("Topla"));
        add(new javax.swing.JLabel(""));

        add(new javax.swing.JLabel("Sonuç"));
        add(new javax.swing.JLabel(""));

        //sıranın aşağıdaki gibi olması tavsiye edilir
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new ToplamaForm_GridLayout().setVisible(true);
        });
    }

}
