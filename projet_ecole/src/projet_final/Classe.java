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
    private ArrayList<Eleve> eleve_liste = new ArrayList<>();
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
     public int get_id()
     {
         return this.id;
     }
     
     public void add_eleve(Eleve e)
     {
         this.eleve_liste.add(e);
     }
     public ArrayList<Eleve> get_eleve_list()
     {
         return eleve_liste;
     }
     public void afficher_eleve()
     {
         for(int i = 0; i < this.eleve_liste.size(); ++i)
            System.out.println(this.eleve_liste.get(i).get_prenom() +" "+ this.eleve_liste.get(i).get_nom());
     }

}
