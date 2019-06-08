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
public class Fenetre4 extends JPanel implements MouseListener {
    
    private JLabel button9;
    private JTextField button10;
    private JButton button11;

    public Fenetre4() {
        //construct components
        button9 = new JLabel ("Suppression classe : ");
        button10 = new JTextField (5);
        button11 = new JButton ("Ok");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        button11.addMouseListener(this) ; 
        add (button9);
        add (button10);
        add (button11);

        //set component bounds (only needed by Absolute Positioning)
        button9.setBounds (395, 185, 131, 25);
        button10.setBounds (405, 240, 100, 25);
        button11.setBounds (420, 305, 76, 25);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre2());
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
