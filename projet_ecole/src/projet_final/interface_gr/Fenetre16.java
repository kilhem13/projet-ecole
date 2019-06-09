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
public class Fenetre16 extends JPanel implements MouseListener {
    
   private JLabel button61;
    private JComboBox button62;
    private JTextArea button63;
     private JButton bip;

    public Fenetre16() {
        //construct preComponents
        String[] button62Items = {};

        //construct components
        button61 = new JLabel ("Note : ");
        button62 = new JComboBox (button62Items);
        button63 = new JTextArea (5, 5);
        bip = new JButton ("Retour en arrière :");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        bip.addMouseListener(this);
        add (button61);
        add (button62);
        add (button63);
        add (bip) ;

        //set component bounds (only needed by Absolute Positioning)
        button61.setBounds (425, 100, 100, 25);
        button62.setBounds (395, 140, 100, 25);
        button63.setBounds (300, 235, 350, 150);
         bip.setBounds (375, 410, 146, 25);
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
        int i = 0 ;
    }

    @Override
    public void mouseExited(MouseEvent me) {
        int i = 0 ;
    }
    
}
