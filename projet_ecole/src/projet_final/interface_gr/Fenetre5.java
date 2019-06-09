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
import projet_final.Classe;
import projet_final.Ecole;

/**
 *
 * @author nizar
 */
public class Fenetre5 extends JPanel implements MouseListener
{
     private JComboBox button13;
    private JLabel button12;
    private JButton bouton14;
    private JButton bouton15;
    private JButton b;

    public Fenetre5()
    {
        String[] button13Items = {};
                //construct components
        button13 = new JComboBox (button13Items);
        button12 = new JLabel ("Liste des élèves : ");
        bouton14 = new JButton ("Ajout élève :");
        bouton15 = new JButton ("Supprimer élève : ");
        b = new JButton ("Page suivante");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        bouton14.addMouseListener(this) ;
        bouton15.addMouseListener(this) ;
        b.addMouseListener(this) ;
        add (button13);
        add (button12);
        add (bouton14);
        add (bouton15);
         add (b);

        //set component bounds (only needed by Absolute Positioning)
        button13.setBounds (415, 265, 100, 25);
        button12.setBounds (410, 165, 113, 30);
        bouton14.setBounds (285, 355, 146, 25);
        bouton15.setBounds (515, 355, 146, 25);
        b.setBounds (410, 425, 121, 25);
    }
    
    public Fenetre5(Classe classe_selected) {
        //construct preComponents
        String[] button13Items = {};

         int nb_eleve = 0;

       String[] liste_eleve_classe = new String[classe_selected.get_eleve_list().size()];
       int id_eleve = 0;

            for(int it_eleve = 0; it_eleve< classe_selected.get_eleve_list().size(); ++it_eleve, id_eleve++)
                liste_eleve_classe[id_eleve] = classe_selected.get_eleve_list().get(it_eleve).get_nom();

             
        //construct components
        button13 = new JComboBox (liste_eleve_classe);
        button12 = new JLabel ("Liste des élèves : ");
        bouton14 = new JButton ("Ajout élève :");
        bouton15 = new JButton ("Supprimer élève : ");
        b = new JButton ("Page suivante");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        bouton14.addMouseListener(this) ;
        bouton15.addMouseListener(this) ;
        b.addMouseListener(this) ;
        add (button13);
        add (button12);
        add (bouton14);
        add (bouton15);
         add (b);

        //set component bounds (only needed by Absolute Positioning)
        button13.setBounds (415, 265, 100, 25);
        button12.setBounds (410, 165, 113, 30);
        bouton14.setBounds (285, 355, 146, 25);
        bouton15.setBounds (515, 355, 146, 25);
        b.setBounds (410, 425, 121, 25);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
       Object source = me.getSource();
        
        if(source==bouton14)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre6());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==bouton15) 
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre7());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==b)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre8());
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
