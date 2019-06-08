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
    private int annee_scolaire;
    private int ecole_id;
    
    public Classe()
    {
        this.nom = "";
        this.niveau = "";
        this.id = 0;
        this.annee_scolaire = 0;
    }
    
     public Classe(int id, String nom, String niveau, int annee, int ecole_id)
    {
        this.ecole_id = ecole_id;
        this.id = id;
        this.nom = nom;
        this.niveau = niveau;
         this.annee_scolaire = annee;
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
     public int get_annee_scolaire()
     {
         return this.annee_scolaire;
     }
     public ArrayList<Eleve> get_liste_eleve()
     {
         return eleve_liste;
     }
     public int get_indice()
     {
         return Ecole.get_ecole_list().get(ecole_id).get_classe().indexOf(this);
         
     }

   
}
