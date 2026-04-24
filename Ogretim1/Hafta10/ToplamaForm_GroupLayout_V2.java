/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vizesonrasi_2;

/**
 *
 * @author TA
 */
public class ToplamaForm_GroupLayout_V2 extends javax.swing.JFrame {

    private javax.swing.JLabel lblSayi1;
    private javax.swing.JLabel lblSayi2;
    private javax.swing.JLabel lblSonuc;
    private javax.swing.JTextField txtSayi1;
    private javax.swing.JTextField txtSayi2;
    private javax.swing.JButton btnTopla;

    public ToplamaForm_GroupLayout_V2() {

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
                                .addContainerGap() // sol boşluk

                                .addGroup(layout.createParallelGroup()
                                        .addComponent(lblSayi1)
                                        .addComponent(lblSayi2)
                                        .addComponent(btnTopla)
                                        .addComponent(lblSonuc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(txtSayi1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSayi2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        )
        );

        // VERTICAL - dikey konum (VerticalGroup) - Y Ekseni
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addContainerGap() // üst boşluk

                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSayi1)
                                .addComponent(txtSayi1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSayi2)
                                .addComponent(txtSayi2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTopla)
                        .addGap(10) // özel boşluk

                        .addComponent(lblSonuc)
                        .addContainerGap() // alt boşluk
        );

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        //setLocationRelativeTo(null); // ekran ortası
        //ALTTI DENEYİNİZ
        //setSize(400, 300);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new ToplamaForm_GroupLayout_V2().setVisible(true);
        });
    }

}
