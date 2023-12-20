package com.antoniogarciaprats.buttonexample2;

import java.awt.*;

public class ButtonExample2 extends Frame {
    
    ButtonExample2 () {
        
        super ();
        
        Button b1 = new Button();
        Button b2 = new Button("pulsame");
        
        
        Button b3 = new Button();
        b3.setLabel ("boton 3");
        
        this.add(b3);
        this.add(b1);
        this.add(b2);
        
        this.setLayout(new FlowLayout());
        this.setTitle("Ejemplo Boton");
        this.setSize(300,350);
        this.setVisible(true);             
        
    }

    public static void main(String[] args) {
        ButtonExample2 f = new ButtonExample2();
    }
}
