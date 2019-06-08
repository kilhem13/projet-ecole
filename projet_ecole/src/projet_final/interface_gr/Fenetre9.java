/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final.interface_gr ;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


/**
 *
 * @author nizar
 */
public class Fenetre9 extends JPanel implements MouseListener
{
     private JLabel butt35;
    private JTextField butt36;
    private JButton butt37;

    public Fenetre9() {
        //construct components
        butt35 = new JLabel ("Ajout année scolaire :");
        butt36 = new JTextField (5);
        butt37 = new JButton ("Ok");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        butt37.addMouseListener(this) ; 
        add (butt35);
        add (butt36);
        add (butt37);

        //set component bounds (only needed by Absolute Positioning)
        butt35.setBounds (400, 165, 136, 25);
        butt36.setBounds (410, 240, 100, 25);
        butt37.setBounds (410, 305, 100, 25);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre8());
        frame.pack();
        frame.setVisible (true);
    }

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
