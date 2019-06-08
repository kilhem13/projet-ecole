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
public class Fenetre17 extends JPanel implements MouseListener {
    
     private JLabel button64;
    private JTextField button65;
    private JButton button67;
    private JTextField button66;

    public Fenetre17() 
    {
        //construct components
        button64 = new JLabel ("Ajout note : ");
        button65 = new JTextField (5);
        button67 = new JButton ("Ok");
        button66 = new JTextField (5);

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        button67.addMouseListener(this);
        add (button64);
        add (button65);
        add (button67);
        add (button66);

        //set component bounds (only needed by Absolute Positioning)
        button64.setBounds (415, 170, 100, 25);
        button65.setBounds (345, 220, 100, 25);
        button67.setBounds (405, 275, 100, 25);
        button66.setBounds (470, 220, 100, 25);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre16());
        frame.pack();
        frame.setVisible (true);
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
