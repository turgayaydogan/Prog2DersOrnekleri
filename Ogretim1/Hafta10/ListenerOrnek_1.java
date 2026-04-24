/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vizesonrasi_2;

/**
 *
 * @author TA
 */
public class ListenerOrnek_1 extends javax.swing.JFrame {

    // COMPONENTLER
    private javax.swing.JButton btnTest;
    private javax.swing.JTextField txtInput;
    private javax.swing.JLabel lblDurum;

    public ListenerOrnek_1() {
        initComponents();
        eventleriEkle();
    }

    private void initComponents() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new java.awt.FlowLayout());

        // COMPONENTLER
        btnTest = new javax.swing.JButton("Buton");
        txtInput = new javax.swing.JTextField(10);
        lblDurum = new javax.swing.JLabel("Durum:");

        add(btnTest);
        add(txtInput);
        add(lblDurum);

        pack();
        setLocationRelativeTo(null);
        setSize(400, 300);
    }

    // EVENT (LISTENER) KISMI
    private void eventleriEkle() {

        // ️ACTIONLISTENER (BUTON)
        btnTest.addActionListener(e -> {
            lblDurum.setText("ActionListener: Butona basıldı");
        });

        // MOUSELISTENER (BUTON ÜZERİ)
        btnTest.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                lblDurum.setText("MouseListener: Buton üzerine gelindi");
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                lblDurum.setText("MouseListener: Butondan çıkıldı");
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                lblDurum.setText("MouseListener: Tıklandı");
            }
        });

        // KEYLISTENER (TEXTFIELD)
        txtInput.addKeyListener(new java.awt.event.KeyAdapter() {

            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                lblDurum.setText("KeyListener: Tuş basıldı → " + e.getKeyChar());
            }
        });
    }

    // MAIN (EDT ÜZERİNDE ÇALIŞTIR)
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {
            new ListenerOrnek_1().setVisible(true);
        });
    }
}
