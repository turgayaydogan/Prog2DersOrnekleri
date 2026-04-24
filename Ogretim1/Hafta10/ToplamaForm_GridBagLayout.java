/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vizesonrasi_2;

/**
 *
 * @author TA
 */
public class ToplamaForm_GridBagLayout extends javax.swing.JFrame {

    private javax.swing.JLabel lblSayi1;
    private javax.swing.JLabel lblSayi2;
    private javax.swing.JLabel lblSonuc;
    private javax.swing.JTextField txtSayi1;
    private javax.swing.JTextField txtSayi2;
    private javax.swing.JButton btnTopla;

    public ToplamaForm_GridBagLayout() {

        initComponents();
    }

    private void initComponents() {

        // FRAME AYARLARI
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // GridBagLayout: en esnek ama en karmaşık layout
        // Her component bir "constraint"(senin kuralların) ile yerleştirilir
        // Constraint = componentin yerleşim kuralı
        getContentPane().setLayout(new java.awt.GridBagLayout());

        java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();

        // 1. SATIR - LABEL 1
        lblSayi1 = new javax.swing.JLabel("1. Sayı:");

        // Componentin yatayda hangi sütunda olacağını belirler
        // 0 = en sol sütun
        gbc.gridx = 0;   // sütun
        
        // Componentin dikeyde hangi satırda olacağını belirler
        // 1 ise bu ikinci satır (0’dan başlar)
        gbc.gridy = 0;   // satır
        gbc.insets = new java.awt.Insets(5, 5, 5, 5); // boşluk

        getContentPane().add(lblSayi1, gbc);

        // TEXTFIELD 1
        txtSayi1 = new javax.swing.JTextField(10);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = java.awt.GridBagConstraints.HORIZONTAL; // yatay genişle
        // fill: büyüme davranışı
        // Componentin hücreyi nasıl dolduracağını belirler
        // NONE = boyutunu değiştirme, doğal boyutunda kal
        // NONE: büyüme yok
        // HORIZONTAL: yatayda genişler
        // VERTICAL: dikeyde genişler
        // BOTH: her yönde genişler
        getContentPane().add(txtSayi1, gbc);

        // 2. SATIR - LABEL 2
        lblSayi2 = new javax.swing.JLabel("2. Sayı:");

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = java.awt.GridBagConstraints.NONE;

        getContentPane().add(lblSayi2, gbc);

        // TEXTFIELD 2
        txtSayi2 = new javax.swing.JTextField(10);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;

        getContentPane().add(txtSayi2, gbc);

        // 3. SATIR - BUTON
        btnTopla = new javax.swing.JButton("Topla");

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2; // 2 sütunu kapla
        gbc.fill = java.awt.GridBagConstraints.NONE;

        getContentPane().add(btnTopla, gbc);

        // 4. SATIR - SONUÇ
        lblSonuc = new javax.swing.JLabel("Sonuç:");

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;

        getContentPane().add(lblSonuc, gbc);
        
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new ToplamaForm_GridBagLayout().setVisible(true);
        });
    }

}
