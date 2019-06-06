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
    private ArrayList<AnneeScolaire> annee_liste = new ArrayList<AnneeScolaire>();
    private int id;
    
    public Eleve(int id, String nom, String prenom, int type)
    {
        super(id, nom, prenom, type);
        
    }
    public Eleve()
    {
        
    }

}
