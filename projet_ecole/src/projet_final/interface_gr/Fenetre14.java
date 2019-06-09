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
public class Fenetre14 extends JPanel implements MouseListener {
    
     private JLabel button54;
    private JComboBox button55;
    private JButton bouton55;
    private JButton bouton56;
     private JButton butb;

    public Fenetre14() {
        //construct preComponents
        String[] button55Items = {};

        //construct components
        button54 = new JLabel ("Elec (coef 3) : ");
        button55 = new JComboBox (button55Items);
        bouton55 = new JButton ("Ajout note");
        bouton56 = new JButton ("Suppression note");
        butb = new JButton ("Retour page 2 ");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        bouton55.addMouseListener(this) ; 
        bouton56.addMouseListener(this) ; 
        butb.addMouseListener(this) ; 
        add (button54);
        add (button55);
        add (bouton55);
        add (bouton56);
          add (butb);

        //set component bounds (only needed by Absolute Positioning)
        button54.setBounds (425, 130, 100, 25);
        button55.setBounds (420, 180, 100, 25);
        bouton55.setBounds (350, 260, 100, 25);
        bouton56.setBounds (495, 260, 141, 25);
        butb.setBounds (410, 310, 126, 25);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        Object source = me.getSource();
        
        if(source==bouton55)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre17());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==bouton56) 
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre18());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==butb)
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
