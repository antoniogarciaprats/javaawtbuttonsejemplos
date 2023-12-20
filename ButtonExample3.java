package com.antoniogarciaprats.buttonexample3;

import java.awt.*;
import java.awt.event.*;

public class ButtonExample3 extends Frame {
    
    ButtonExample3() {
        
        super();
        
        Button b = new Button("pulsame");
        b.setBounds(50, 100, 60, 30);
        final TextField tf = new TextField();
        tf.setBounds(50,50,150,50);
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e) {
                tf.setText("Bienvenido a Java AWT");
            }
        });
       
       this.add(tf);
       this.add(b);
       
       this.setSize(250, 250);
       this.setTitle("Ejemplo Button 3");
       this.setLayout(null);
       this.setVisible(true);
        
    }

    public static void main(String[] args) {
        ButtonExample3 f = new ButtonExample3();
    }
}
