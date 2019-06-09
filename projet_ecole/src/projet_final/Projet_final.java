/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final;

import java.sql.Connection;
import java.sql.SQLException;
import projet_final.dao.*;

/**
 *
 * @author HP
 */
public class Projet_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       
        Connexion con = new Connexion("bdd_gestion", "root", "radiateur");
        Eleve e = new Eleve(1, "Lauro", "Guilhem" ,1);
        
        
        
        //DAO<Ecole> ecdao = new EcoleDAO(con);
        EcoleDAO.load_Ecole(con);
        EcoleDAO.load_Classe(con);
        EleveDAO.load_Eleve(con);
        ClasseDAO.load_eleve_in_classe(con);
        EleveDAO.load_Bulletin(con);
        BulletinDAO.load_Discipline(con);
        DisciplineDAO.load_liste_eval(con);
        
        for(int i = 0 ; i < Ecole.get_ecole_list().size(); ++i)
        {
            //int j = 0;
            for(int j = 0; j<Ecole.get_ecole_list().get(i).get_classe().size(); ++j)
            {  System.out.println(Ecole.get_ecole_list().get(i).get_nom());
               System.out.println(Ecole.get_ecole_list().get(i).get_classe().get(j).get_nom());
               System.out.println("Liste eleve classe" + Ecole.get_ecole_list().get(i).get_classe().get(j).get_nom());
               Ecole.get_ecole_list().get(i).get_classe().get(j).afficher_eleve();
               
               System.out.println("Annee Scolaire");
               System.out.println(Ecole.get_ecole_list().get(i).get_classe().get(j).get_annee_scolaire());
               
               for(int it_eleve = 0; it_eleve<Ecole.get_ecole_list().get(i).get_classe().get(j).get_eleve_list().size(); ++it_eleve)
               {
                    System.out.println(Ecole.get_ecole_list().get(i).get_classe().get(j).get_eleve_list().get(it_eleve).get_nom()  +" Appreciation ");
                    System.out.println("Les matieres sont: ");
                    for(int it_bul = 0 ; it_bul<Ecole.get_ecole_list().get(i).get_classe().get(j).get_eleve_list().get(it_eleve).get_bulletin_liste().size(); ++it_bul)
                    {
                        for(int it_disc = 0 ; it_disc<Ecole.get_ecole_list().get(i).get_classe().get(j).get_eleve_list().get(it_eleve).get_bulletin_liste().get(it_bul).get_discipline_liste().size(); ++it_disc)
                        { System.out.println(Ecole.get_ecole_list().get(i).get_classe().get(j).get_eleve_list().get(it_eleve).get_bulletin_liste().get(it_bul).get_discipline_liste().get(it_disc).get_nom());
                        for(int it_eval = 0 ; it_eval<Ecole.get_ecole_list().get(i).get_classe().get(j).get_eleve_list().get(it_eleve).get_bulletin_liste().get(it_bul).get_discipline_liste().size(); ++it_eval)
                            {
                                try{
                                System.out.println(Ecole.get_ecole_list().get(i).get_classe().get(j).get_eleve_list().get(it_eleve).get_bulletin_liste().get(it_bul).get_discipline_liste().get(it_disc).moyenne());
                                System.out.println(Ecole.get_ecole_list().get(i).get_classe().get(j).get_eleve_list().get(it_eleve).get_bulletin_liste().get(it_bul).moyenne());
                                }
                                catch(Exception ex)
                                    {
                                        System.out.println("Toutes les notes sont chargées");
                                    }
                           }
                        }
                    }
                }
               }
            }
            
        }
        
        
        
        
        //ensdao.create(e);
        
        //EleveDAO.load_Eleve(con);
       // DAO<Enseignant> disdao = new EnseignantDAO(con);
        
     
       
       
      /* EleveDAO.load_Eleve(con);
        for(int i = 0; i<Personne.get_liste_enseignant().size(); ++i)
            System.out.println(Personne.get_liste_enseignant().get(i).get_nom());
        
       ensdao.delete(Personne.get_liste_eleve().get(3));
        
        /*Discipline d = new Discipline("Math", 4);
        
        
        
       
        DAO<Discipline> disdao = new DisciplineDAO(con);
        disdao.delete(d);
      /* DAO<Eval> evaldao = new EvalDAO(con);
       Eval eval = evaldao.find(1);
        // TODO code application logic here*/
    }
    
}
