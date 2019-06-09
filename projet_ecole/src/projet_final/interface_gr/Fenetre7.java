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
public class Fenetre7 extends JPanel implements MouseListener
{
    
     private JLabel butt24;
    private JLabel butt25;
    private JLabel butt26;
    private JLabel butt27;
    private JTextField butt28;
    private JTextField butt29;
    private JTextField butt30;
    private JButton butt31;

    public Fenetre7() {
        //construct components
        butt24 = new JLabel ("Suppression élève : ");
        butt25 = new JLabel ("Nom : ");
        butt26 = new JLabel ("Prénom : ");
        butt27 = new JLabel ("Année scolaire :");
        butt28 = new JTextField (5);
        butt29 = new JTextField (5);
        butt30 = new JTextField (5);
        butt31 = new JButton ("Ok");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        butt31.addMouseListener(this) ; 
        add (butt24);
        add (butt25);
        add (butt26);
        add (butt27);
        add (butt28);
        add (butt29);
        add (butt30);
        add (butt31);

        //set component bounds (only needed by Absolute Positioning)
        butt24.setBounds (385, 180, 125, 25);
        butt25.setBounds (220, 260, 100, 25);
        butt26.setBounds (380, 260, 100, 25);
        butt27.setBounds (550, 260, 100, 25);
        butt28.setBounds (220, 310, 100, 25);
        butt29.setBounds (375, 310, 100, 25);
        butt30.setBounds (550, 310, 100, 25);
        butt31.setBounds (380, 380, 100, 25);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
       JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre5());
        frame.pack();
        frame.setVisible (true);
    }

    @Override
    public void mousePressed(MouseEvent me) {
       int i = 0 ;
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        int i =0 ; 
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
