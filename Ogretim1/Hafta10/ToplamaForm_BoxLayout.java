/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vizesonrasi_2;

/**
 *
 * @author TA
 */
public class ToplamaForm_BoxLayout extends javax.swing.JFrame {

    // PANEL TANIMLARI
    // Form alanlarını tutacak ana panel
    private javax.swing.JPanel pnlForm;

    // Her satır için ayrı panel oluşturulur
    // Çünkü BoxLayout tek eksende çalışır
    private javax.swing.JPanel pnlSatir1;
    private javax.swing.JPanel pnlSatir2;
    private javax.swing.JPanel pnlSatir3;

    // Buton paneli
    private javax.swing.JPanel pnlButton;

    // COMPONENT TANIMLARI
    private javax.swing.JLabel lblSayi1;
    private javax.swing.JLabel lblSayi2;
    private javax.swing.JLabel lblSonuc;

    private javax.swing.JTextField txtSayi1;
    private javax.swing.JTextField txtSayi2;

    private javax.swing.JButton btnTopla;

    public ToplamaForm_BoxLayout() {

        initComponents();
    }

    private void initComponents() {

        // FRAME AYARLARI
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // JFrame'e BorderLayout veriyoruz
        // Çünkü farklı panelleri farklı bölgelere yerleştirmek istiyoruz
        setLayout(new java.awt.BorderLayout());
        //getContentPane().setLayout(new java.awt.BorderLayout());
        // FORM PANEL OLUŞTUR
        pnlForm = new javax.swing.JPanel();

        // pnlForm paneline BoxLayout veriliyor
        // Y_AXIS → componentler yukarıdan aşağı sıralanır
        pnlForm.setLayout(
                new javax.swing.BoxLayout(
                        pnlForm,
                        javax.swing.BoxLayout.Y_AXIS
                )
        );

        // SATIR 1 PANELİ
        // Her satır için ayrı panel oluşturulur
        // Çünkü label ve textbox yan yana durmalıdır
        pnlSatir1 = new javax.swing.JPanel();

        // Satır paneline X_AXIS verilir
        // Böylece componentler soldan sağa dizilir
        pnlSatir1.setLayout(
                new javax.swing.BoxLayout(
                        pnlSatir1,
                        javax.swing.BoxLayout.X_AXIS
                )
        );

        lblSayi1 = new javax.swing.JLabel("1. Sayı:");
        txtSayi1 = new javax.swing.JTextField(10);

        // Componentler SATIR paneline eklenir
        pnlSatir1.add(lblSayi1);

        // Componentler arasına sabit boşluk eklenir
        pnlSatir1.add(javax.swing.Box.createHorizontalStrut(10));

        pnlSatir1.add(txtSayi1);

        // SATIR 2 PANELİ
        pnlSatir2 = new javax.swing.JPanel();

        pnlSatir2.setLayout(
                new javax.swing.BoxLayout(
                        pnlSatir2,
                        javax.swing.BoxLayout.X_AXIS
                )
        );

        lblSayi2 = new javax.swing.JLabel("2. Sayı:");
        txtSayi2 = new javax.swing.JTextField(10);

        pnlSatir2.add(lblSayi2);
        // Componentler arasına sabit boşluk eklenir
        pnlSatir2.add(javax.swing.Box.createHorizontalStrut(10));
        pnlSatir2.add(txtSayi2);

        // SATIR 3 PANELİ
        pnlSatir3 = new javax.swing.JPanel();

        pnlSatir3.setLayout(
                new javax.swing.BoxLayout(
                        pnlSatir3,
                        javax.swing.BoxLayout.X_AXIS
                )
        );

        lblSonuc = new javax.swing.JLabel("Sonuç:");
        pnlSatir3.add(lblSonuc);

        // SATIRLARI ANA FORM PANELİNE EKLE
        // pnlForm Y_AXIS olduğu için
        // satırlar yukarıdan aşağı dizilir
        //Lütfen 2 ve 3 yazan yerin altını açıp deneyiniz
        //2
        //pnlForm.add(javax.swing.Box.createVerticalStrut(15));
        pnlForm.add(pnlSatir1);

        //3
        /*
        pnlForm.setBorder(
                javax.swing.BorderFactory.createEmptyBorder(15, 10, 10, 10)
        );
        */
        //üst, sol, alt, sağ boşluk

        // Satırlar arası boşluk eklenir
        pnlForm.add(javax.swing.Box.createVerticalStrut(10));
        pnlForm.add(pnlSatir2);
        pnlForm.add(javax.swing.Box.createVerticalStrut(10));
        pnlForm.add(pnlSatir3);

        // BUTTON PANELİ
        pnlButton = new javax.swing.JPanel();

        // Buton ortada dursun diye FlowLayout kullanılır
        pnlButton.setLayout(
                new java.awt.FlowLayout(
                        java.awt.FlowLayout.CENTER
                )
        );

        btnTopla = new javax.swing.JButton("Topla");
        pnlButton.add(btnTopla);

        // PANELLERİ FRAME’E EKLE
        // BorderLayout CENTER alanına form paneli yerleşir
        add(pnlForm, java.awt.BorderLayout.CENTER);

        // BorderLayout SOUTH alanına buton paneli yerleşir
        add(pnlButton, java.awt.BorderLayout.SOUTH);

        // FRAME BOYUTLANDIR
        // Componentlerin ideal boyutuna göre pencereyi ayarlar
        pack();

        // Form ekran ortasında açılır
        setLocationRelativeTo(null);

        /*
        BoxLayout karmaşık form tasarımında 
        tek başına kullanılmaz; 
        satır panelleri oluşturularak 
        nested yapı ile birlikte kullanılır.
        
        Frame → BorderLayout
        Form Panel → BoxLayout(Y_AXIS)
        Satır Panel → BoxLayout(X_AXIS)
        Button Panel → FlowLayout
         */
        
        /*
        component arası boşluk için: strut
        panel kenarı boşluk için: border
        */
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new ToplamaForm_BoxLayout().setVisible(true);
        });
    }

}
