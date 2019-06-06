/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final;

import java.util.ArrayList;

/**
 *
 * @author sarto
 */
public class Classe {
    private String nom;
    private String niveau;
    private ArrayList<Personne> eleve_liste;
    private int id;
    
    public Classe()
    {
        this.nom = "";
        this.niveau = "";
        this.id = 0;
    }
    
     public Classe(int id, String nom, String niveau)
    {
        this.id = id;
        this.nom = nom;
        this.niveau = niveau;
    }
     public String get_nom()
     {
         return nom;
     }

}
