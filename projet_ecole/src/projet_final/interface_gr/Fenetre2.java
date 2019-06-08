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
import projet_final.Personne;

/**
 *
 * @author nizar
 */
public class Fenetre2 extends JPanel implements MouseListener {
    private JLabel button2;
    private JButton button3;
    private JButton button4;
    private JComboBox button5;
    private JButton but ; 
    private JFrame frame;

    public Fenetre2(JFrame frame) {
        //construct preComponents
        String[] button5Items = {};

        int nb_classe = 0;
       for(int it_ecole = 0; it_ecole<Ecole.get_ecole_list().size(); ++it_ecole)
               {
                    for(int it_classe = 0; it_classe<Ecole.get_ecole_list().get(it_ecole).get_classe().size(); ++it_classe)
                        nb_classe++;
                  
               }
       String[] liste_classe = new String[nb_classe];
       int id_classe = 0;
       for(int it_ecole = 0; it_ecole<Ecole.get_ecole_list().size(); ++it_ecole)
               {
                    for(int it_classe = 0; it_classe<Ecole.get_ecole_list().get(it_ecole).get_classe().size(); ++it_classe, id_classe++)
                        liste_classe[id_classe] = Ecole.get_ecole_list().get(it_ecole).get_classe().get(it_classe).get_nom();
                  
               }
       
        //construct components
        button2 = new JLabel ("Liste des classes : ");
        button3 = new JButton ("Ajout classe");
        button4 = new JButton ("Suppression classe");
        button5 = new JComboBox (liste_classe);
        
        but = new JButton("page suivante") ; 
        this.frame = frame;
        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        button3.addMouseListener(this);
        button4.addMouseListener(this);
        but.addMouseListener(this) ; 
        add (button2);
        add (button3);
        add (button4);
        add (button5);
        add (but);
       // button5.add("adddadd", frame);
       
        //set .component bounds (only needed by Absolute Positioning)
        button2.setBounds (380, 175, 110, 25);
        button3.setBounds (260, 285, 106, 25);
        button4.setBounds (470, 285, 149, 25);
        button5.setBounds (380, 220, 100, 25);
        but.setBounds (375, 355, 124, 25);
    


    }

    @Override
    public void mouseClicked(MouseEvent me) {
        Object source = me.getSource();
        
        if(source==button3)
        {
        
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre3());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==button4) 
        {
        //JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre4());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==but)
        {
        //JFrame frame = new JFrame ("MyPanel");
        String classe = (String)button5.getSelectedItem();
        
        Classe id_classe = new Classe();
        for(int it_ecole = 0; it_ecole<Ecole.get_ecole_list().size(); ++it_ecole)
               {
                    for(int it_classe = 0; it_classe<Ecole.get_ecole_list().get(it_ecole).get_classe().size(); ++it_classe)
                        if(Ecole.get_ecole_list().get(it_ecole).get_classe().get(it_classe).get_nom().equals(classe))
                        {
                           id_classe = Ecole.get_ecole_list().get(it_ecole).get_classe().get(it_classe);
                            break;
                        }
                  
               }
        
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre5(id_classe));
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
