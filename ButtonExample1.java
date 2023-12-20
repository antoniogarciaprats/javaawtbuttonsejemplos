package com.antoniogarciaprats.buttonexample1;

import java.awt.*;

public class ButtonExample1 extends Frame {
    
    ButtonExample1() {
        
        Button b = new Button ("Click Me");
        b.setBounds(50,100,80,30);
        
        this.add(b);
        this.setSize(300,200);
        this.setLayout(null);
        this.setLayout(null);
        this.setVisible(true);
        
    }

    public static void main(String[] args) {
        ButtonExample1 b = new ButtonExample1();
    }
}
