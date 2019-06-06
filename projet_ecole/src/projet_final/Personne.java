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
    public static ArrayList<Eleve> liste_eleve = new ArrayList<Eleve>();
    public static ArrayList<Enseignant> liste_enseignant = new ArrayList<Enseignant>();
    protected int id;
    protected String nom;
    protected String prenom;
    protected int type; 
    
    public Personne()
    {
        this.id = 0;
        this.nom = null;
        this.prenom = null;
        
        //liste_personne.add(this);
    }
    
    public Personne(int id, String nom, String prenom, int type)
    {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.type = type;
        //liste_enseignant.add(this);
    }
    
    public static ArrayList<Eleve> get_liste_eleve()
    {
        return liste_eleve;
    }
    
        public static ArrayList<Enseignant> get_liste_enseignant()
    {
        return liste_enseignant;
    }
    public static void add_en_to_array(Enseignant e)
    {
            liste_enseignant.add(e);
    }
    public void add_el_to_array(Eleve e)
    {
            liste_eleve.add(e);
    }
    
}