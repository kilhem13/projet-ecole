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
public class Fenetre3 extends JPanel implements MouseListener {
    private JLabel button6;
    private JTextField button7;
    private JButton button8;

    public Fenetre3() {
        //construct components
        button6 = new JLabel ("Ajout classe : ");
        button7 = new JTextField (5);
        button8 = new JButton ("Ok");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        button8.addMouseListener(this);
        add (button6);
        add (button7);
        add (button8);

        //set component bounds (only needed by Absolute Positioning)
        button6.setBounds (385, 175, 100, 25);
        button7.setBounds (375, 220, 100, 25);
        button8.setBounds (375, 270, 100, 25);
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
