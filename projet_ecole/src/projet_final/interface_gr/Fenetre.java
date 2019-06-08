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
public class Fenetre extends JPanel implements MouseListener
{
     private JTextField blop;
    private JPasswordField bloop;
    private JButton bipbi;
    private JLabel bo;
    private JLabel boo;
    private JFrame frame;
      
     public Fenetre(JFrame frame) {
        //construct components
         blop = new JTextField (5);
        bloop = new JPasswordField (5);
        bipbi = new JButton ("Ok");
        bo = new JLabel ("Connexion :");
        boo = new JLabel ("Password : ");
        this.frame = frame;
        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);


        //add components
        bipbi.addMouseListener(this);
         add (blop);
        add (bloop);
        add (bipbi);
        add (bo);
        add (boo);

        
         //set component bounds (only needed by Absolute Positioning)
        blop.setBounds (205, 225, 100, 25);
        bloop.setBounds (205, 260, 100, 25);
        bipbi.setBounds (335, 245, 100, 25);
        bo.setBounds (90, 225, 100, 25);
        boo.setBounds (90, 260, 100, 25);
        
        
    }
     
     
    
     public void mouseClicked(MouseEvent me)
     { 
        //JFrame frame = new JFrame ("MyPanel");
        // frame.getContentPane().setLayout(null);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre2(frame));
        frame.pack();
        frame.setVisible (true);
        //frame.repaint();
     
     }

    @Override
    public void mousePressed(MouseEvent me) 
    {
        int i = 0 ;
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        int i = 0 ; 
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        int i = 0 ; 
         //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        int i = 0 ;
    }

    
    
}
