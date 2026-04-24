/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vizesonrasi_2;

/**
 *
 * @author TA
 */
public class ListenerOrnek_2 extends javax.swing.JFrame {

    // COMPONENTLER
    private javax.swing.JTextField txtSayi1;
    private javax.swing.JTextField txtSayi2;
    private javax.swing.JButton btnTopla;
    private javax.swing.JLabel lblSonuc;
    private javax.swing.JLabel lblDurum;

    public ListenerOrnek_2() {
        initComponents();
        eventleriEkle();
    }

    private void initComponents() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // GROUPLAYOUT (daha düzenli görünüm)
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        // COMPONENTLER
        txtSayi1 = new javax.swing.JTextField();
        txtSayi2 = new javax.swing.JTextField();
        btnTopla = new javax.swing.JButton("Topla");
        lblSonuc = new javax.swing.JLabel("Sonuç:");
        lblDurum = new javax.swing.JLabel("Durum:");

        txtSayi1.setColumns(10);
        txtSayi2.setColumns(10);

        // HORIZONTAL GROUP
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGap(20)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSayi1)
                                .addComponent(txtSayi2))
                        .addComponent(btnTopla)
                        .addComponent(lblSonuc)
                        .addComponent(lblDurum)
        );

        // VERTICAL GROUP
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup()
                                .addComponent(txtSayi1)
                                .addComponent(txtSayi2))
                        .addComponent(btnTopla)
                        .addComponent(lblSonuc)
                        .addComponent(lblDurum)
        );

        pack();
        setLocationRelativeTo(null);
        setSize(400, 200);
        getRootPane().setBorder(
                javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15)
        );
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
            new ListenerOrnek_2().setVisible(true);
        });
    }
}
