
package com.manuel.boletin19;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Boletin19 {

    
    public static void main(String[] args) {
        JFrame marco= new JFrame("Boletin 19");
        JPanel panel=new JPanel();
               panel.setLayout(null);

        JLabel etiqueta1=new JLabel("NOME");
        JTextField textfield1=new JTextField(40);
          JLabel etiqueta2=new JLabel("PASSWORD");
        JPasswordField passwordfield=new JPasswordField(40);
        JTextArea textarea=new JTextArea("Area de texto .");
        
        JButton boton1=new JButton("PREMER");
         JButton boton2=new JButton("LIMPAR");
       marco.setSize(750, 700);
      boton2.setBounds(500,550,100,50);
        boton1.setBounds(200,550,100,50);
        textfield1.setBounds(350,63,200,25);
        textarea.setBounds(150,200,500,300);
        etiqueta1.setBounds(200,50,100,50);
        passwordfield.setBounds(350,110,200,25);
        etiqueta2.setBounds(200,100,100,50);
        
      
      panel.add(etiqueta1);
     panel.add(textfield1);
   
     panel.add(etiqueta2);
     panel.add(passwordfield);
     panel.add(textarea);
     panel.add(boton1);
     panel.add(boton2);
        marco.add(panel); 
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         marco.setVisible(true);
    }
    
}
