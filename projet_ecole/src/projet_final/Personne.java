/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sarto
 */
public abstract class Personne {
    public static ArrayList<Personne> liste_personne;
    protected int id;
    protected String nom;
    protected String prenom;
    
    public Personne()
    {
        this.id = 0;
        this.nom = null;
        this.prenom = null;
        liste_personne.add(this);
    }
    
    public Personne(int id, String nom, String prenom)
    {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        liste_personne.add(this);
    }
    
    public static ArrayList<Personne> get_liste_personne()
    {
        return liste_personne;
    }
    
}