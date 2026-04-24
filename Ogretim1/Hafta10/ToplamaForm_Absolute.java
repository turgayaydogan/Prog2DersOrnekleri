/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vizesonrasi_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author TA
 */
public class ToplamaForm_Absolute extends javax.swing.JFrame {

    class ToplaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("Butona basildi");

        }
    }

    private javax.swing.JLabel lblSayi1;
    private javax.swing.JLabel lblSayi2;
    private javax.swing.JLabel lblSonuc;
    private javax.swing.JTextField txtSayi1;
    private javax.swing.JTextField txtSayi2;
    private javax.swing.JButton btnTopla;

    public ToplamaForm_Absolute() {

        initComponents();
    }

    private void initComponents() {

        setLayout(null); // ABSOLUTE LAYOUT

        lblSayi1 = new javax.swing.JLabel("1. Sayı:");
        lblSayi2 = new javax.swing.JLabel("2. Sayı:");
        lblSonuc = new javax.swing.JLabel("Sonuç:");

        txtSayi1 = new javax.swing.JTextField();
        txtSayi2 = new javax.swing.JTextField();

        btnTopla = new javax.swing.JButton("Topla");

        // SABİT PİKSEL YERLEŞİM (PROBLEM BURADA BAŞLIYOR)
        lblSayi1.setBounds(30, 30, 80, 25);
        txtSayi1.setBounds(120, 30, 100, 25);

        lblSayi2.setBounds(30, 70, 80, 25);
        txtSayi2.setBounds(120, 70, 100, 25);

        btnTopla.setBounds(120, 110, 100, 30);

        lblSonuc.setBounds(30, 160, 200, 25);

        add(lblSayi1);
        add(txtSayi1);
        add(lblSayi2);
        add(txtSayi2);
        add(btnTopla);
        add(lblSonuc);

        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        txtSayi1.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Tuş basıldı");
            }
        });

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new ToplamaForm_Absolute().setVisible(true);
        });
    }

}
