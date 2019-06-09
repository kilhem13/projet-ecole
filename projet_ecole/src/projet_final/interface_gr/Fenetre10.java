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
public class Fenetre10 extends JPanel implements MouseListener
{
     private JLabel button38;
    private JComboBox button39;
    private JButton button40;

    public Fenetre10() {
        //construct preComponents
        String[] button39Items = {};

        //construct components
        button38 = new JLabel ("Trimestre : ");
        button39 = new JComboBox (button39Items);
        button40 = new JButton ("Ok");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        button40.addMouseListener(this) ; 
        add (button38);
        add (button39);
        add (button40);

        //set component bounds (only needed by Absolute Positioning)
        button38.setBounds (435, 30, 100, 25);
        button39.setBounds (420, 135, 100, 25);
        button40.setBounds (420, 210, 100, 25);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre11());
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
        int i = 0; 
    }

    @Override
    public void mouseExited(MouseEvent me) {
        int i = 0 ;
    }

}
