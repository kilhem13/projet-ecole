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
public class Fenetre12 extends JPanel implements MouseListener {
    
     private JLabel button46;
    private JComboBox button47;
    private JButton bouton48;
    private JButton bouton49;
    private JButton butbut;

    public Fenetre12() {
        //construct preComponents
        String[] button47Items = {};

        //construct components
        button46 = new JLabel ("Maths (coef 5 ) : ");
        button47 = new JComboBox (button47Items);
        bouton48 = new JButton ("Ajout note");
        bouton49 = new JButton ("Supprimer note");
        butbut = new JButton ("Retour page 2 ");
        

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        bouton48.addMouseListener(this) ; 
        bouton49.addMouseListener(this) ; 
        butbut.addMouseListener(this) ; 
        
        add (button46);
        add (button47);
        add (bouton48);
        add (bouton49);
         add (butbut);

        //set component bounds (only needed by Absolute Positioning)
        button46.setBounds (425, 125, 100, 25);
        button47.setBounds (420, 175, 100, 25);
        bouton48.setBounds (335, 245, 100, 25);
        bouton49.setBounds (475, 245, 125, 25);
         butbut.setBounds (410, 310, 126, 25);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        Object source = me.getSource();
        
         if(source==bouton48)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre17());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==bouton49) 
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre18());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==butbut)
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
