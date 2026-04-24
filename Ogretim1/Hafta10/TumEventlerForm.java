/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vizesonrasi_2;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author TA
 */
public class TumEventlerForm extends javax.swing.JFrame {

    private javax.swing.JLabel lblMesaj;

    public TumEventlerForm() {
        initComponents();
    }

    private void initComponents() {

        setTitle("Swing Event Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new java.awt.GridLayout(0, 2, 10, 10));

        lblMesaj = new javax.swing.JLabel("Event mesajları burada görünür");

        // COMPONENTLER
        javax.swing.JToggleButton toggleBtn = new javax.swing.JToggleButton("Toggle");
        javax.swing.JCheckBox chk = new javax.swing.JCheckBox("Check");
        javax.swing.JRadioButton radio = new javax.swing.JRadioButton("Radio");

        javax.swing.JButton btn = new javax.swing.JButton("Button");

        javax.swing.JSlider slider = new javax.swing.JSlider();

        javax.swing.JProgressBar progress = new javax.swing.JProgressBar();
        progress.setValue(50);

        javax.swing.JSpinner spinner = new javax.swing.JSpinner();

        DefaultComboBoxModel<String> comboModel
                = new DefaultComboBoxModel<>();

        comboModel.addElement("Java");
        comboModel.addElement("C#");
        comboModel.addElement("Python");

        javax.swing.JComboBox<String> combo
                = new javax.swing.JComboBox<>(comboModel);

        DefaultListModel<String> listModel
                = new DefaultListModel<>();

        listModel.addElement("Java");
        listModel.addElement("C#");
        listModel.addElement("Python");

        javax.swing.JList<String> list
                = new javax.swing.JList<>(listModel);
        // EVENTLER
        toggleBtn.addItemListener(e
                -> lblMesaj.setText("JToggleButton ItemStateChanged")
        );

        chk.addItemListener(e
                -> lblMesaj.setText("JCheckBox ItemStateChanged")
        );

        radio.addItemListener(e
                -> lblMesaj.setText("JRadioButton ItemStateChanged")
        );

        btn.addActionListener(e
                -> lblMesaj.setText("JButton ActionPerformed")
        );

        btn.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent e) {
                lblMesaj.setText("Mouse Entered");
            }

            public void mouseExited(java.awt.event.MouseEvent e) {
                lblMesaj.setText("Mouse Exited");
            }
        });

        slider.addChangeListener(e
                -> lblMesaj.setText("JSlider StateChanged")
        );

        progress.addChangeListener(e
                -> lblMesaj.setText("JProgressBar StateChanged")
        );

        spinner.addChangeListener(e
                -> lblMesaj.setText("JSpinner StateChanged")
        );

        combo.addItemListener(e
                -> lblMesaj.setText("JComboBox ItemStateChanged")
        );

        list.addListSelectionListener(e
                -> lblMesaj.setText("JList ValueChanged")
        );

        // FRAME'E EKLE
        add(toggleBtn);
        add(chk);

        add(radio);
        add(btn);

        add(slider);
        add(progress);

        add(spinner);
        add(combo);

        add(new javax.swing.JScrollPane(list));
        add(lblMesaj);

        setSize(500, 500);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(()
                -> new TumEventlerForm().setVisible(true)
        );
    }
}
