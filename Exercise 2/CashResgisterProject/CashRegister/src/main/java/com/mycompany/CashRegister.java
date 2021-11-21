/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Set;
//import java.util.*;
/**
 *
 * @author aryan
 */
public class CashRegister {
    private String UPCcode;
//    private Display display;
    public CashRegister(){
        JFrame cFrame = new JFrame("Cash Register");
        cFrame.setMinimumSize(new Dimension(500,500));
        JPanel cashPannel = new JPanel();
        cashPannel.setLayout(new GridLayout(3, 2));
        JLabel lblTitle = new JLabel("Scan Items");
        JTextField bar_code_field;
        JButton scanProduct = new JButton("Scan a product");
        
        scanProduct.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            new Scanner();
            cFrame.setVisible(false);
        }  
        
    });
        cashPannel.add(lblTitle);
        cashPannel.add(scanProduct);
        cFrame.add(cashPannel, BorderLayout.PAGE_START);
        cFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cFrame.pack();
        cFrame.setVisible(true);
        
    }

    public void setCurrentProductUPC(int UPCCode){
       this.UPCcode = Integer.toString(UPCCode);
    }
    public String getCurrentProductUPC(){
       return this.UPCcode;
    }

    
    public static void main(String[] args) {
        new CashRegister();
    }
}
