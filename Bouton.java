package exajava;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;


public class Bouton extends JButton {
    private String buttonName;
        
    public Bouton(String str, Color bgColor, Color fgColor, Font bFont){
        
        // Appel du constructeur de la super classe
        super(str);
        
        this.buttonName = str;
        
        this.setBackground(bgColor);
        this.setForeground(fgColor);
        
        this.setFont(bFont);
    }
}
