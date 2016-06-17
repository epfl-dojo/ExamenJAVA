package exajava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame {
    //radiobuttons
    private JRadioButton CHFRad = new JRadioButton("CHF=>€");
    private JRadioButton EurosRad = new JRadioButton("€=>CHF");
    
    //textfields
    private JTextField CHFField = new JTextField();
    private JTextField EuroField = new JTextField();
    
    //labels
    private JLabel CHFLabel = new JLabel("CHF");
    private JLabel EuroLabel = new JLabel("EURO");
    
    //Boutons
    private Bouton calculer = new Bouton("CALCULER",Color.BLUE, Color.WHITE, new Font("Verdana",Font.BOLD,10));
    private Bouton effacer = new Bouton("EFFACER",Color.BLACK, Color.WHITE, new Font("Verdana",Font.BOLD,10));
    
    // Conteneur des objets de la fenêtre
    private JPanel container = new JPanel();
    
    // PopUp
    JOptionPane popup= new JOptionPane();
    
    //grid boutons
    JPanel grid = new JPanel(new GridLayout(1,2));
    
    public Fenetre(){
        //Paramètres de la fenêtre
        this.setTitle("Convertisseur de monnaie");
        this.setSize(450, 100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        //container
        this.setContentPane(container);
        container.setLayout(new BorderLayout());
        
        //Ligne du haut
        Box bHaut = Box.createHorizontalBox();
        bHaut.add(CHFLabel);
        bHaut.add(CHFField);
        bHaut.add(CHFRad);
        bHaut.add(EurosRad);
        bHaut.add(EuroField);
        bHaut.add(EuroLabel);
        
        //Ligne du bas
        /*Box bBas = Box.createHorizontalBox();
        bBas.add(calculer);
        bBas.add(effacer);*/
        grid.add(calculer);
        grid.add(effacer);
        calculer.addActionListener(new CalculListener());
        effacer.addActionListener(new ResetListener());
        
        //radio group
        ButtonGroup group = new ButtonGroup();
        group.add(CHFRad);
        group.add(EurosRad);
        CHFRad.setSelected(true);
        EurosRad.setSelected(false);
        EuroField.setEditable(false);
        CHFRad.addActionListener(new CHFListener());
        EurosRad.addActionListener(new EurosListener());
        
        //ajouts éléments au container
        container.add(bHaut, BorderLayout.NORTH);
        container.add(grid, BorderLayout.SOUTH);
       
        this.setVisible(true);
    }

    class CHFListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            EuroField.setEditable(false);
            CHFField.setEditable(true);
        }
    }

    class EurosListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            CHFField.setEditable(false);
            EuroField.setEditable(true);
        }
    }
    class CalculListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            double CHF = Double.parseDouble(CHFField.getText());
            double Euros = Double.parseDouble(EuroField.getText());
            
            if (CHFRad.isSelected()==true){
                
            }else{
                
            }
        }
    }
    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            CHFField.setEditable(true);
            EuroField.setEditable(false);
            CHFRad.setSelected(true);
            EurosRad.setSelected(false);
            CHFField.setText("");
            EuroField.setText("");
        }
    }
   
}
