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
public class Fenetre11 extends JPanel implements MouseListener
{
    
     private JButton button41;
    private JButton button42;
    private JButton button43;
    private JButton button44;
    private JTextArea button45;
    

    public Fenetre11() {
        //construct components
        button41 = new JButton ("Maths : ");
        button42 = new JButton ("Physique :");
        button43 = new JButton ("Info : ");
        button44 = new JButton ("Elec : ");
        button45 = new JTextArea (10, 10);

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        button41.addMouseListener(this) ;
        button42.addMouseListener(this) ;
        button43.addMouseListener(this) ;
        button44.addMouseListener(this) ;
           
        add (button41);
        add (button42);
        add (button43);
        add (button44);
        add (button45);

        //set component bounds (only needed by Absolute Positioning)
        button41.setBounds (425, 90, 100, 25);
        button42.setBounds (425, 135, 100, 25);
        button43.setBounds (425, 180, 100, 25);
        button44.setBounds (425, 225, 100, 25);
        button45.setBounds (305, 325, 380, 150);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        Object source = me.getSource();
        
        if(source==button41)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre12());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==button42) 
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre13());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==button43)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre14());
        frame.pack();
        frame.setVisible (true);
        
        }
         else if(source==button44)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre15());
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
