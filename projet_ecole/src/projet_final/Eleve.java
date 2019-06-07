/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final;

import java.util.ArrayList;
import projet_final.*;

/**
 *
 * @author sarto
 */
public class Eleve extends Personne{
    private ArrayList<Bulletin> bulletin_liste = new ArrayList<Bulletin>();
    private int id;
    
    public Eleve(int id, String nom, String prenom, int type)
    {
        super(id, nom, prenom, type);
        
    }
    public Eleve()
    {
        
    }
    
    public void add_bulletin(Bulletin b)
    {
        bulletin_liste.add(b);
    }
    
    public void afficher_appreciation_bulletin()
    {
        for(int i = 0; i< bulletin_liste.size(); ++i)
        {
            System.out.println(bulletin_liste.get(i).get_appreciation());
        }
    }
    
    public ArrayList<Bulletin> get_bulletin_liste()
    {
        return bulletin_liste;
    }
            
            

}
