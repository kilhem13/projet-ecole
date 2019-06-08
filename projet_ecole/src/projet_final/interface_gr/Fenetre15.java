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
public class Fenetre15 extends JPanel implements MouseListener {
    
     private JLabel button57;
    private JComboBox button58;
    private JButton bouton59;
    private JButton bouton60;
     private JButton butbutt;

    public Fenetre15() {
        //construct preComponents
        String[] button58Items = {};

        //construct components
        button57 = new JLabel ("Info (coef 3) :");
        button58 = new JComboBox (button58Items);
        bouton59 = new JButton ("Ajout note ");
        bouton60 = new JButton ("Suppression note");
        butbutt = new JButton ("Retour page 2 ");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        bouton59.addMouseListener(this) ;
        bouton60.addMouseListener(this) ;
        butbutt.addMouseListener(this) ;
        add (button57);
        add (button58);
        add (bouton59);
        add (bouton60);
        add (butbutt);

        //set component bounds (only needed by Absolute Positioning)
        button57.setBounds (425, 130, 100, 25);
        button58.setBounds (415, 175, 100, 25);
        bouton59.setBounds (365, 235, 100, 25);
        bouton60.setBounds (510, 235, 135, 25);
        butbutt.setBounds (410, 310, 126, 25);
    }

    @Override
    public void mouseClicked(MouseEvent me) 
    {
        Object source = me.getSource();
        
        if(source==bouton59)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre17());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==bouton60) 
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre18());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==butbutt)
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
