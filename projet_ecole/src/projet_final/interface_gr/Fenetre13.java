/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final.interface_gr;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author nizar
 */
public class Fenetre13 extends JPanel implements MouseListener {
    
     private JLabel button50;
    private JComboBox button51;
    private JButton bouton52;
    private JButton bouton53;
     private JButton butbu;

    public Fenetre13() {
        //construct preComponents
        String[] button51Items = {};

        //construct components
        button50 = new JLabel ("Physique (coef 6) : ");
        button51 = new JComboBox (button51Items);
        bouton52 = new JButton ("Ajout note");
        bouton53 = new JButton ("Suppression note");
         butbu = new JButton ("Retour page 2 ");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        bouton52.addMouseListener(this) ; 
        bouton53.addMouseListener(this) ; 
        butbu.addMouseListener(this) ; 
        add (button50);
        add (button51);
        add (bouton52);
        add (bouton53);
         add (butbu);

        //set component bounds (only needed by Absolute Positioning)
        button50.setBounds (425, 125, 118, 25);
        button51.setBounds (425, 165, 100, 25);
        bouton52.setBounds (340, 240, 100, 25);
        bouton53.setBounds (500, 240, 142, 25);
         butbu.setBounds (410, 310, 126, 25);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        Object source = me.getSource();
        
        if(source==bouton52)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre17());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==bouton53) 
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre18());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==butbu)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre2());
        frame.pack();
        frame.setVisible (true);
        
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
         int i = 0 ;
    }

    @Override
    public void mouseReleased(MouseEvent me) {
         int i = 0 ;
    }

    @Override
    public void mouseEntered(MouseEvent me) {
         int i = 0 ;
    }

    @Override
    public void mouseExited(MouseEvent me) {
       int i = 0 ;
    }


    
}
