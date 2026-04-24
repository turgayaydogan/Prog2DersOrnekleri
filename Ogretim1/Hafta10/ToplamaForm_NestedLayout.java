/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vizesonrasi_2;

/**
 *
 * @author TA
 */
public class ToplamaForm_NestedLayout extends javax.swing.JFrame {

    private javax.swing.JPanel pnlForm;
    private javax.swing.JPanel pnlButton;

    private javax.swing.JLabel lblSayi1;
    private javax.swing.JLabel lblSayi2;
    private javax.swing.JLabel lblSonuc;
    private javax.swing.JTextField txtSayi1;
    private javax.swing.JTextField txtSayi2;
    private javax.swing.JButton btnTopla;

    public ToplamaForm_NestedLayout() {

        initComponents();
    }

    private void initComponents() {

        // FRAME
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // JFrame ana yerleşim düzeni BorderLayout yapıldı
        // Böylece farklı paneller farklı bölgelere yerleşebilir
        setLayout(new java.awt.BorderLayout());

        // FORM PANEL OLUŞTURMA
        pnlForm = new javax.swing.JPanel();

        // pnlForm paneli içine GridLayout verildi
        // 3 satır 2 sütun → label + textbox düzeni
        pnlForm.setLayout(new java.awt.GridLayout(3, 2, 5, 5));

        // COMPONENT OLUŞTURMA
        lblSayi1 = new javax.swing.JLabel("1. Sayı:");
        lblSayi2 = new javax.swing.JLabel("2. Sayı:");
        lblSonuc = new javax.swing.JLabel("Sonuç:");

        txtSayi1 = new javax.swing.JTextField();
        txtSayi2 = new javax.swing.JTextField();

        // COMPONENTLERİ FORM PANEL'E EKLEME
        // ÖNEMLİ: Componentler JFrame'e değil pnlForm paneline ekleniyor
        pnlForm.add(lblSayi1);
        pnlForm.add(txtSayi1);

        pnlForm.add(lblSayi2);
        pnlForm.add(txtSayi2);

        pnlForm.add(lblSonuc);

        // boş hücre bırakmak için boş label eklendi
        pnlForm.add(new javax.swing.JLabel(""));

        // BUTTON PANEL OLUŞTURMA
        pnlButton = new javax.swing.JPanel();

        // Buton paneli ortalı hizalama ile FlowLayout kullanır
        pnlButton.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER));

        btnTopla = new javax.swing.JButton("Topla");

        // Buton pnlButton paneline eklenir
        pnlButton.add(btnTopla);

        // PANELLERİ FRAME'E EKLEME
        // pnlForm merkeze yerleşir
        add(pnlForm, java.awt.BorderLayout.CENTER);

        // pnlButton alt bölgeye yerleşir
        add(pnlButton, java.awt.BorderLayout.SOUTH);

        // FRAME BOYUTLANDIRMA
        // Componentlerin ideal boyutuna göre pencereyi ayarlar
        pack();

        // Form ekran ortasında açılır
        setLocationRelativeTo(null);
        /*
        DİKKAT:
        Her panel farklı layout kullanabilir
            Frame → BorderLayout
            Form panel → GridLayout
            Button panel → FlowLayout
         */
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new ToplamaForm_NestedLayout().setVisible(true);
        });
    }

}
