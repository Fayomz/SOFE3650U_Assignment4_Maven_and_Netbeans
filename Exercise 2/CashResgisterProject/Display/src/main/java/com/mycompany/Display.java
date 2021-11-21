/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author aryan
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Display {

    JFrame dFrame;
    JPanel displayPanel;
    JLabel displayName, displayPrice;
    JTextField bar_code_field;
    JButton submit, back;

    public Display(String UPCCode) {
        dFrame = new JFrame("Display");
        dFrame.setMinimumSize(new Dimension(500,500));
        displayPanel = new JPanel();
        displayName = new JLabel("Name: Invalid");
        displayPrice = new JLabel("Price: Invalid");
        displayText(UPCCode);
        displayPanel.add(displayName);
        displayPanel.add(displayPrice);
        dFrame.add(displayPanel, BorderLayout.PAGE_START);
        dFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dFrame.pack();
        dFrame.setVisible(true);
    }

    public void displayText(String text) {
        String name = "";
        int price = 0;
        System.out.println(text);
        if (text.equals("10000001")) {
            name = "apples";
            price = 4;
        } else if (text.equals("10000010")) {
            name = "Grapes";
            price = 6;
        } else if (text.equals("10000011")) {
            name = "Oranges";
            price = 100;
        }
        
        if (name != "" && price !=0){
            displayName.setText("Name: " + name);
            displayPrice.setText("Price: " + price );
        }
    }
}
