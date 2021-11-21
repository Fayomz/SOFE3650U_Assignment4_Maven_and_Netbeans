/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BoxLayout;


/**
 *
 * @author aryan
 */
public class Scanner {
    
    private int UPCCode;
    JFrame frame;
    JPanel buttonPane, fieldsPanel;
    JLabel UPC_Code;
    JTextField bar_code_field;
    JButton submit, back;
    public void ScannedUPCCode(int UPCCode){
        this.UPCCode = UPCCode;
    }
    public int GetScannedUPCCode(){
        int Code = this.UPCCode;
        this.UPCCode = -1;
        return Code;
    }
    public Scanner(){
        
        frame = new JFrame("Scanner");
        frame.setMinimumSize(new Dimension(500,500));
        buttonPane = new JPanel();
        fieldsPanel = new JPanel();
        fieldsPanel.setLayout(new BoxLayout(fieldsPanel, BoxLayout.Y_AXIS));
        UPC_Code = new JLabel("Enter Barcode");
        bar_code_field = new JTextField("");
        submit = new JButton("Submit");
        back = new JButton("Cancel");
        fieldsPanel.add(UPC_Code);
        fieldsPanel.add(bar_code_field);
        fieldsPanel.add(submit);
        fieldsPanel.add(back);
        
        submit.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            String bar_code = bar_code_field.getText();
            if(bar_code.equals("")){
                new Display("");
            }
            else{
                ScannedUPCCode(Integer.parseInt(bar_code));
                new Display(Integer.toString(GetScannedUPCCode()));
            }            
            
            frame.setVisible(false);
        }  
        
    });
     back.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            new CashRegister();
            frame.setVisible(false);
        }
    });
        frame.add(fieldsPanel, BorderLayout.PAGE_START);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
   }
}
