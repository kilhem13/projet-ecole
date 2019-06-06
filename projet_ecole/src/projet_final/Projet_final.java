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
        int id =  Ecole.get_ecole_list().get(0).get_id();
        
        DAO<Ecole> ecdao = new EcoleDAO(con);
        EcoleDAO.load_Classe(con, 1);
        
        for(int i = 0 ; i < Ecole.get_ecole_list().size(); ++i)
        {
            int j = 0;
            while(System.out.println(Ecole.get_ecole_list().get(j))
            System.out.println(Ecole.get_ecole_list().get(0).get_id());
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
