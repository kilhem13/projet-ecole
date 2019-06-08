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
public class Fenetre18 extends JPanel implements MouseListener {
    
    private JLabel button68;
    private JTextField button69;
    private JTextField button70;
    private JButton button71;

    public Fenetre18() {
        //construct components
        button68 = new JLabel ("Suppression note :");
        button69 = new JTextField (5);
        button70 = new JTextField (5);
        button71 = new JButton ("Ok");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add 
        button71.addMouseListener(this) ; 
        add (button68);
        add (button69);
        add (button70);
        add (button71);

        //set component bounds (only needed by Absolute Positioning)
        button68.setBounds (395, 160, 115, 25);
        button69.setBounds (340, 220, 100, 25);
        button70.setBounds (465, 220, 100, 25);
        button71.setBounds (400, 275, 100, 25);
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
