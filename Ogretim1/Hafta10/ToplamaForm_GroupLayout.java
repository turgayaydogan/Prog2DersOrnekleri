/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vizesonrasi_2;

/**
 *
 * @author TA
 */
public class ToplamaForm_GroupLayout extends javax.swing.JFrame {

    private javax.swing.JLabel lblSayi1;
    private javax.swing.JLabel lblSayi2;
    private javax.swing.JLabel lblSonuc;
    private javax.swing.JTextField txtSayi1;
    private javax.swing.JTextField txtSayi2;
    private javax.swing.JButton btnTopla;

    public ToplamaForm_GroupLayout() {

        initComponents();
    }

    private void initComponents() {

        lblSayi1 = new javax.swing.JLabel("1. Sayı:");
        lblSayi2 = new javax.swing.JLabel("2. Sayı:");
        lblSonuc = new javax.swing.JLabel("Sonuç:");

        txtSayi1 = new javax.swing.JTextField(8);
        txtSayi2 = new javax.swing.JTextField(8);

        btnTopla = new javax.swing.JButton("Topla");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        // HORIZONTAL - yatay konum (HorizontalGroup) – X Ekseni
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSayi1)
                                .addComponent(txtSayi1))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSayi2)
                                .addComponent(txtSayi2))
                        .addComponent(btnTopla)
                        .addComponent(lblSonuc)
        );

        // VERTICAL - dikey konum (VerticalGroup) - Y Ekseni
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup()
                                .addComponent(lblSayi1)
                                .addComponent(txtSayi1))
                        .addGroup(layout.createParallelGroup()
                                .addComponent(lblSayi2)
                                .addComponent(txtSayi2))
                        .addComponent(btnTopla)
                        .addComponent(lblSonuc)
        );
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        //setLocationRelativeTo(null); // ekran ortası
        //ALTTI DENEYİNİZ
        //setSize(400, 300);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new ToplamaForm_GroupLayout().setVisible(true);
        });
    }

}
