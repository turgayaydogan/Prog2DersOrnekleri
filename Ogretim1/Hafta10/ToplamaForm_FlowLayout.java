/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vizesonrasi_2;

/**
 *
 * @author TA
 */
public class ToplamaForm_FlowLayout extends javax.swing.JFrame {

    private javax.swing.JLabel lblSayi1;
    private javax.swing.JLabel lblSayi2;
    private javax.swing.JLabel lblSonuc;
    private javax.swing.JTextField txtSayi1;
    private javax.swing.JTextField txtSayi2;
    private javax.swing.JButton btnTopla;

    public ToplamaForm_FlowLayout() {
        initComponents();

    }

    private void initComponents() {

        lblSayi1 = new javax.swing.JLabel();
        lblSayi2 = new javax.swing.JLabel();
        lblSonuc = new javax.swing.JLabel();

        txtSayi1 = new javax.swing.JTextField();
        txtSayi2 = new javax.swing.JTextField();

        btnTopla = new javax.swing.JButton();

        // Label textleri
        lblSayi1.setText("1. Sayı:");
        lblSayi2.setText("2. Sayı:");
        lblSonuc.setText("Sonuç:");

        btnTopla.setText("Topla");

        this.setLayout(new java.awt.FlowLayout());

        add(lblSayi1);
        add(txtSayi1);

        add(lblSayi2);
        add(txtSayi2);

        add(btnTopla);

        add(lblSonuc);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();//açıklama satırını yap/iptal et DENE
        //setSize(400,400);//2 satırı aç/kapa kombinasyonlarına bak

    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {
            ToplamaForm_FlowLayout form = new ToplamaForm_FlowLayout();
            form.setVisible(true);
        });
        //DİKKAT DİKKAT: TAVSİYE EDİLMEZ
        //new ToplamaForm_FlowLayout().setVisible(true);
    }

}
