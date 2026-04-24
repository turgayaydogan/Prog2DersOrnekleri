/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vizesonrasi_2;

/**
 *
 * @author TA
 */
public class ListenerOrnek_3_Absolute extends javax.swing.JFrame {

    // COMPONENTLER
    private javax.swing.JTextField txtSayi1;
    private javax.swing.JTextField txtSayi2;
    private javax.swing.JButton btnTopla;
    private javax.swing.JLabel lblSonuc;
    private javax.swing.JLabel lblDurum;
    private javax.swing.JLabel lblSayi1;
    private javax.swing.JLabel lblSayi2;

    public ListenerOrnek_3_Absolute() {
        initComponents();
        eventleriEkle();
    }

    private void initComponents() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // ABSOLUTE LAYOUT (MANUEL KONUMLANDIRMA)
        setLayout(null);

        // COMPONENTLER
        lblSayi1 = new javax.swing.JLabel("1. Sayı:");
        lblSayi2 = new javax.swing.JLabel("2. Sayı:");
        lblSonuc = new javax.swing.JLabel("Sonuç:");
        lblDurum = new javax.swing.JLabel("Durum:");

        txtSayi1 = new javax.swing.JTextField();
        txtSayi2 = new javax.swing.JTextField();

        btnTopla = new javax.swing.JButton("Topla");

        // BOYUT + KONUM (x, y, width, height)
        // Sol üstten başlatıyoruz (padding mantığı manuel yapılır)
        lblSayi1.setBounds(30, 30, 80, 25);
        txtSayi1.setBounds(120, 30, 120, 25);

        lblSayi2.setBounds(30, 70, 80, 25);
        txtSayi2.setBounds(120, 70, 120, 25);

        btnTopla.setBounds(120, 110, 120, 30);

        lblSonuc.setBounds(30, 160, 200, 25);
        lblDurum.setBounds(30, 200, 200, 25);

        // FRAME'E EKLE
        add(lblSayi1);
        add(txtSayi1);

        add(lblSayi2);
        add(txtSayi2);

        add(btnTopla);
        add(lblSonuc);        
        add(lblDurum);


        // FORM BOYUTU
        setSize(300, 300);

        setLocationRelativeTo(null);
    }

    // EVENT KISMI
    private void eventleriEkle() {

        // ACTIONLISTENER (TOPLAMA)
        btnTopla.addActionListener(e -> {

            try {
                int s1 = Integer.parseInt(txtSayi1.getText());
                int s2 = Integer.parseInt(txtSayi2.getText());

                int toplam = s1 + s2;

                lblSonuc.setText("Sonuç: " + toplam);
                lblDurum.setText("ActionListener: Toplama yapıldı");

            } catch (NumberFormatException ex) {
                lblDurum.setText("Hata: Sayı giriniz");
            }
        });

        // MOUSELISTENER (BUTON FEEDBACK)
        btnTopla.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                lblDurum.setText("Mouse: Buton üzerine gelindi");
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                lblDurum.setText("Mouse: Butondan çıkıldı");
            }
        });

        // KEYLISTENER (ANLIK KONTROL)
        txtSayi1.addKeyListener(new java.awt.event.KeyAdapter() {

            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                lblDurum.setText("Key: 1. input yazılıyor");
            }
        });

        txtSayi2.addKeyListener(new java.awt.event.KeyAdapter() {

            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                lblDurum.setText("Key: 2. input yazılıyor");
            }
        });
    }

    // MAIN (EDT)
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {
            new ListenerOrnek_3_Absolute().setVisible(true);
        });
    }
}
