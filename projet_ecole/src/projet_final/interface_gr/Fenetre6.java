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
public class Fenetre6 extends JPanel implements MouseListener {
    
     private JTextField butt20;
    private JLabel button16;
    private JLabel button17;
    private JLabel button18;
    private JLabel button19;
    private JTextField butt21;
    private JTextField butt22;
    private JButton butt23;

    public Fenetre6() {
        //construct components
        butt20 = new JTextField (5);
        button16 = new JLabel ("Ajout d'un élève : ");
        button17 = new JLabel ("Prénom :");
        button18 = new JLabel ("Nom : ");
        button19 = new JLabel ("Classe : ");
        butt21 = new JTextField (5);
        butt22 = new JTextField (5);
        butt23 = new JButton ("Ok");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        butt23.addMouseListener(this);
        add (butt20);
        add (button16);
        add (button17);
        add (button18);
        add (button19);
        add (butt21);
        add (butt22);
        add (butt23);

        //set component bounds (only needed by Absolute Positioning)
        butt20.setBounds (230, 285, 100, 25);
        button16.setBounds (235, 190, 100, 25);
        button17.setBounds (230, 240, 100, 25);
        button18.setBounds (380, 240, 100, 25);
        button19.setBounds (550, 240, 100, 25);
        butt21.setBounds (380, 285, 100, 25);
        butt22.setBounds (550, 285, 100, 25);
        butt23.setBounds (375, 350, 100, 25);
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
