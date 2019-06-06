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
public class Enseignant extends Personne {
    private String discipline;
        public static ArrayList<Enseignant> liste_enseignant;

    
    public Enseignant()
    {
        super();
        this.discipline = null;
    }
    
    public Enseignant(String discip, int id, String nom, String prenom, int type)
    {
        super(id, nom, prenom, type);
        this.discipline = discip;
    }
     public static void add_en_to_array(Enseignant e)
    {
            liste_enseignant.add(e);
    }
     public String get_nom()
     {
         return this.nom;
    }
}