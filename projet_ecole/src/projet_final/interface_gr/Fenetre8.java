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
public class Fenetre8 extends JPanel implements MouseListener {
     private JComboBox button33;
    private JLabel button32;
    private JButton bouton34;
     private JButton butti;

    public Fenetre8() {
        //construct preComponents
        String[] button33Items = {};

        //construct components
        button33 = new JComboBox (button33Items);
        button32 = new JLabel ("Année scolaire : ");
        bouton34 = new JButton ("Ajout année");
        butti = new JButton ("Page suivante :");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        bouton34.addMouseListener(this) ;
        butti.addMouseListener(this) ;
        add (button33);
        add (button32);
        add (bouton34);
        add (butti);

        //set component bounds (only needed by Absolute Positioning)
        button33.setBounds (425, 265, 100, 25);
        button32.setBounds (425, 190, 100, 25);
        bouton34.setBounds (425, 345, 111, 25);
        butti.setBounds (425, 405, 122, 25);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        Object source = me.getSource();
        
        if(source==bouton34)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre9());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==butti) 
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre10());
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
