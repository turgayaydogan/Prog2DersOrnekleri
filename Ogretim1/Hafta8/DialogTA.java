/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vizesonrasi_1;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author TA
 */
public class DialogTA extends JDialog {

    private String sonuc;  // <- veri taşıma alanı

    public DialogTA(JFrame parent) {
        
        super(parent, true);
        /*
        üst sınıf (JDialog) constructor’ını çağırır
        parent pencereyi bağlar
        dialog’u modal yapar
        JDialog dialog = new JDialog(parent, true);
        */

        this.setLayout(new FlowLayout());
        
        JTextField textField = new JTextField(15);
        JButton btnOk = new JButton("OK");
        
        this.add(textField);
        this.add(btnOk);

        btnOk.addActionListener(e -> {

            sonuc = textField.getText(); // frame’e veri yazıldı
            dispose();

        });
        
        setSize(300, 150);
        setLocationRelativeTo(parent);
    }

    public String getSonuc() {
        return sonuc;
    }
}
