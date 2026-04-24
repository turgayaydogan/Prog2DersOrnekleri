/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vizesonrasi_2;

/**
 *
 * @author TA
 */
public class ListenerOrnek_4_MultiListener extends javax.swing.JFrame {

    private javax.swing.JButton btnTest;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;

    public ListenerOrnek_4_MultiListener() {
        initComponents();
        eventleriEkle();
    }

    private void initComponents() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new java.awt.FlowLayout());

        btnTest = new javax.swing.JButton("Tıkla");

        lbl1 = new javax.swing.JLabel("Listener 1:");
        lbl2 = new javax.swing.JLabel("Listener 2:");

        add(btnTest);
        add(lbl1);
        add(lbl2);

        pack();
        setLocationRelativeTo(null);
        setSize(300, 300);
    }

    private void eventleriEkle() {

        // LISTENER 1
        btnTest.addActionListener(e -> {
            lbl1.setText("Listener 1 çalıştı");
        });

        // LISTENER 2
        btnTest.addActionListener(e -> {
            lbl2.setText("Listener 2 çalıştı");
        });
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {
            new ListenerOrnek_4_MultiListener().setVisible(true);
        });
    }
}
