/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final.interface_gr ;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author nizar*/

public class Interface 
{
    
    public class Fenetre extends JPanel implements MouseListener
{
     private JTextField blop;
    private JPasswordField bloop;
    private JButton bipbi;
    private JLabel bo;
    private JLabel boo;
      
     public Fenetre() {
        //construct components
         blop = new JTextField (5);
        bloop = new JPasswordField (5);
        bipbi = new JButton ("Ok");
        bo = new JLabel ("Connexion :");
        boo = new JLabel ("Password : ");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);


        //add components
        bipbi.addMouseListener(this);
         add (blop);
        add (bloop);
        add (bipbi);
        add (bo);
        add (boo);

        
         //set component bounds (only needed by Absolute Positioning)
        blop.setBounds (205, 225, 100, 25);
        bloop.setBounds (205, 260, 100, 25);
        bipbi.setBounds (335, 245, 100, 25);
        bo.setBounds (90, 225, 100, 25);
        boo.setBounds (90, 260, 100, 25);
        
        
    }
     
     
    
     public void mouseClicked(MouseEvent me)
     { 
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre2());
        frame.pack();
        frame.setVisible (true);
     
     }

    @Override
    public void mousePressed(MouseEvent me) 
    {
        int i = 0 ;
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        int i = 0 ; 
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        int i = 0 ; 
         //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        int i = 0 ;
    }

    
    
}

    
    
    public class Fenetre2 extends JPanel implements MouseListener {
    private JLabel button2;
    private JButton button3;
    private JButton button4;
    private JComboBox button5;
    private JButton but ; 

    public Fenetre2() {
        //construct preComponents
        String[] button5Items = {};

        //construct components
        button2 = new JLabel ("Liste des classes : ");
        button3 = new JButton ("Ajout classe");
        button4 = new JButton ("Suppression classe");
        button5 = new JComboBox (button5Items);
        but = new JButton("page suivante") ; 

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

        //set component bounds (only needed by Absolute Positioning)
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
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre3());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==button4) 
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre4());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==but)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre5());
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
        frame.getContentPane().add (new javaapplication1.Fenetre2());
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
        frame.getContentPane().add (new javaapplication1.Fenetre2());
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
    
    
    public class Fenetre5 extends JPanel implements MouseListener
{
     private JComboBox button13;
    private JLabel button12;
    private JButton bouton14;
    private JButton bouton15;
    private JButton b;

    public Fenetre5() {
        //construct preComponents
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
        frame.getContentPane().add (new javaapplication1.Fenetre5());
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
        frame.getContentPane().add (new javaapplication1.Fenetre5());
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
    
    public class Fenetre8 extends JPanel implements MouseListener {
     private JComboBox button33;
    private JLabel button32;
    private JButton bouton34;
     private JButton butti;

    public Fenetre8() {
        //construct preComponents
        String[] button33Items = {};

        //construct components
        button33 = new JComboBox (button33Items);
        button32 = new JLabel ("Année scolaire : ");
        bouton34 = new JButton ("Ajout année");
        butti = new JButton ("Page suivante :");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        bouton34.addMouseListener(this) ;
        butti.addMouseListener(this) ;
        add (button33);
        add (button32);
        add (bouton34);
        add (butti);

        //set component bounds (only needed by Absolute Positioning)
        button33.setBounds (425, 265, 100, 25);
        button32.setBounds (425, 190, 100, 25);
        bouton34.setBounds (425, 345, 111, 25);
        butti.setBounds (425, 405, 122, 25);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        Object source = me.getSource();
        
        if(source==bouton34)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre9());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==butti) 
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre10());
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
        frame.getContentPane().add (new javaapplication1.Fenetre8());
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

    
    public class Fenetre11 extends JPanel implements MouseListener
{
    
     private JButton button41;
    private JButton button42;
    private JButton button43;
    private JButton button44;
    private JTextArea button45;
    

    public Fenetre11() {
        //construct components
        button41 = new JButton ("Maths : ");
        button42 = new JButton ("Physique :");
        button43 = new JButton ("Info : ");
        button44 = new JButton ("Elec : ");
        button45 = new JTextArea (10, 10);

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        button41.addMouseListener(this) ;
        button42.addMouseListener(this) ;
        button43.addMouseListener(this) ;
        button44.addMouseListener(this) ;
           
        add (button41);
        add (button42);
        add (button43);
        add (button44);
        add (button45);

        //set component bounds (only needed by Absolute Positioning)
        button41.setBounds (425, 90, 100, 25);
        button42.setBounds (425, 135, 100, 25);
        button43.setBounds (425, 180, 100, 25);
        button44.setBounds (425, 225, 100, 25);
        button45.setBounds (305, 325, 380, 150);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        Object source = me.getSource();
        
        if(source==button41)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre12());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==button42) 
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre13());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==button43)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre14());
        frame.pack();
        frame.setVisible (true);
        
        }
         else if(source==button44)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre15());
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
    
    public class Fenetre12 extends JPanel implements MouseListener {
    
     private JLabel button46;
    private JComboBox button47;
    private JButton bouton48;
    private JButton bouton49;
    private JButton butbut;

    public Fenetre12() {
        //construct preComponents
        String[] button47Items = {};

        //construct components
        button46 = new JLabel ("Maths (coef 5 ) : ");
        button47 = new JComboBox (button47Items);
        bouton48 = new JButton ("Ajout note");
        bouton49 = new JButton ("Supprimer note");
        butbut = new JButton ("Retour page 2 ");
        

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        bouton48.addMouseListener(this) ; 
        bouton49.addMouseListener(this) ; 
        butbut.addMouseListener(this) ; 
        
        add (button46);
        add (button47);
        add (bouton48);
        add (bouton49);
         add (butbut);

        //set component bounds (only needed by Absolute Positioning)
        button46.setBounds (425, 125, 100, 25);
        button47.setBounds (420, 175, 100, 25);
        bouton48.setBounds (335, 245, 100, 25);
        bouton49.setBounds (475, 245, 125, 25);
         butbut.setBounds (410, 310, 126, 25);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        Object source = me.getSource();
        
         if(source==bouton48)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre17());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==bouton49) 
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre18());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==butbut)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new javaapplication1.Fenetre2());
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

    
    public class Fenetre13 extends JPanel implements MouseListener {
    
     private JLabel button50;
    private JComboBox button51;
    private JButton bouton52;
    private JButton bouton53;
     private JButton butbu;

    public Fenetre13() {
        //construct preComponents
        String[] button51Items = {};

        //construct components
        button50 = new JLabel ("Physique (coef 6) : ");
        button51 = new JComboBox (button51Items);
        bouton52 = new JButton ("Ajout note");
        bouton53 = new JButton ("Suppression note");
         butbu = new JButton ("Retour page 2 ");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        bouton52.addMouseListener(this) ; 
        bouton53.addMouseListener(this) ; 
        butbu.addMouseListener(this) ; 
        add (button50);
        add (button51);
        add (bouton52);
        add (bouton53);
         add (butbu);

        //set component bounds (only needed by Absolute Positioning)
        button50.setBounds (425, 125, 118, 25);
        button51.setBounds (425, 165, 100, 25);
        bouton52.setBounds (340, 240, 100, 25);
        bouton53.setBounds (500, 240, 142, 25);
         butbu.setBounds (410, 310, 126, 25);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        Object source = me.getSource();
        
        if(source==bouton52)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre17());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==bouton53) 
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre18());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==butbu)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new javaapplication1.Fenetre2());
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

    
    public class Fenetre14 extends JPanel implements MouseListener {
    
     private JLabel button54;
    private JComboBox button55;
    private JButton bouton55;
    private JButton bouton56;
     private JButton butb;

    public Fenetre14() {
        //construct preComponents
        String[] button55Items = {};

        //construct components
        button54 = new JLabel ("Elec (coef 3) : ");
        button55 = new JComboBox (button55Items);
        bouton55 = new JButton ("Ajout note");
        bouton56 = new JButton ("Suppression note");
        butb = new JButton ("Retour page 2 ");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        bouton55.addMouseListener(this) ; 
        bouton56.addMouseListener(this) ; 
        butb.addMouseListener(this) ; 
        add (button54);
        add (button55);
        add (bouton55);
        add (bouton56);
          add (butb);

        //set component bounds (only needed by Absolute Positioning)
        button54.setBounds (425, 130, 100, 25);
        button55.setBounds (420, 180, 100, 25);
        bouton55.setBounds (350, 260, 100, 25);
        bouton56.setBounds (495, 260, 141, 25);
        butb.setBounds (410, 310, 126, 25);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        Object source = me.getSource();
        
        if(source==bouton55)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre17());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==bouton56) 
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre18());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==butb)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new javaapplication1.Fenetre2());
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

    
    public class Fenetre15 extends JPanel implements MouseListener {
    
     private JLabel button57;
    private JComboBox button58;
    private JButton bouton59;
    private JButton bouton60;
     private JButton butbutt;

    public Fenetre15() {
        //construct preComponents
        String[] button58Items = {};

        //construct components
        button57 = new JLabel ("Info (coef 3) :");
        button58 = new JComboBox (button58Items);
        bouton59 = new JButton ("Ajout note ");
        bouton60 = new JButton ("Suppression note");
        butbutt = new JButton ("Retour page 2 ");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        bouton59.addMouseListener(this) ;
        bouton60.addMouseListener(this) ;
        butbutt.addMouseListener(this) ;
        add (button57);
        add (button58);
        add (bouton59);
        add (bouton60);
        add (butbutt);

        //set component bounds (only needed by Absolute Positioning)
        button57.setBounds (425, 130, 100, 25);
        button58.setBounds (415, 175, 100, 25);
        bouton59.setBounds (365, 235, 100, 25);
        bouton60.setBounds (510, 235, 135, 25);
        butbutt.setBounds (410, 310, 126, 25);
    }

    @Override
    public void mouseClicked(MouseEvent me) 
    {
        Object source = me.getSource();
        
        if(source==bouton59)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre17());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==bouton60) 
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre18());
        frame.pack();
        frame.setVisible (true);
        }
        else if(source==butbutt)
        {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new javaapplication1.Fenetre2());
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
        frame.getContentPane().add (new javaapplication1.Fenetre11());
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

    
    public class Fenetre17 extends JPanel implements MouseListener {
    
     private JLabel button64;
    private JTextField button65;
    private JButton button67;
    private JTextField button66;

    public Fenetre17() 
    {
        //construct components
        button64 = new JLabel ("Ajout note : ");
        button65 = new JTextField (5);
        button67 = new JButton ("Ok");
        button66 = new JTextField (5);

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 553));
        setLayout (null);

        //add components
        button67.addMouseListener(this);
        add (button64);
        add (button65);
        add (button67);
        add (button66);

        //set component bounds (only needed by Absolute Positioning)
        button64.setBounds (415, 170, 100, 25);
        button65.setBounds (345, 220, 100, 25);
        button67.setBounds (405, 275, 100, 25);
        button66.setBounds (470, 220, 100, 25);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new javaapplication1.Fenetre16());
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
        frame.getContentPane().add (new javaapplication1.Fenetre16());
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


    
    
    

    
}
    


 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
