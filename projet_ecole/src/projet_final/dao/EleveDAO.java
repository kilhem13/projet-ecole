/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final.dao;

import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import projet_final.Connexion;
import projet_final.Eleve;
import projet_final.Enseignant;
import projet_final.Personne;

/**
 *
 * @author HP
 */
public class EleveDAO extends DAO<Eleve> {

    public EleveDAO(Connexion conn) {
        super(conn);
    }

    @Override
    public boolean create(Eleve obj) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               String req = "INSERT INTO `personne` (`ID`, `NOM`, PRENOM, TYPE) VALUES (NULL, '"+obj.get_nom()+"', '"+ obj.get_prenom() +"', 1);";
        try {
            connect.executeUpdate(req);
            System.out.println("Inserted");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DisciplineDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Discipline not found");
            return false;
        }
    
    }

    @Override
    public boolean delete(Eleve obj) {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       String req = "DELETE FROM personne WHERE id = "+obj.get_id();
        try {
            connect.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(EleveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return true;
    }

    @Override
    public boolean update(Eleve obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Eleve find(int id) {
        
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               Eleve ens = new Eleve();
       try {
           ArrayList<String> result;
           result = connect.remplirChampsRequete("SELECT * FROM personne WHERE id = "+ id);
           String[] res = result.get(0).split(",");
           for(int i = 0; i<res.length; ++i)
            System.out.println(res[i]);
     
       } catch (SQLException ex) {
            Logger.getLogger(EnseignantDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       ens = new Eleve();
       return ens;
    }
    
    public static void load_Eleve (Connexion connect) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             //  Enseignant ens = new Enseignant();
       try {
          ArrayList<String> result;
           
           result = connect.remplirChampsRequete("SELECT * FROM Personne Where Type = 1");
           System.out.println(result.size());
           for(int j  = 0; j<result.size(); ++j)
           {
            String[] res = result.get(j).split(",");
           System.out.println(res[2]);
            int id = parseInt(res[0]);
            String prenom = res[1];
            String nom = res[2];
           
            Eleve e = new Eleve(id, prenom, nom, 1);
            //System.out.println(e);
            Personne.add_el_to_array(e);
            
           }
           
       } catch (SQLException ex) {
            Logger.getLogger(EleveDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("null");
        }
       //ens = new Enseignant();
     
    
    }
    
     public static void load_AnneeScolaire (Connexion connect)
     {
         try
         {
             for(int i=0; i<Eleve.get_liste_eleve().size(); i++)
             {
             ArrayList<String> result;
             result = connect.remplirChampsRequete("SELECT anneescolaire.id FROM anneescolaire,classe,inscription,personne WHERE classe.anneescolaire_id=anneescolaire.id AND classe.id=Inscription.classe_id AND Inscription.personne_id="+Eleve.get_liste_eleve().get(i).get_id());
             System.out.println(result.size());
             for(int j=0;j<result.size();j++)
             {
                 AnneeScolaire a =new AnneeScolaire(id);
             }
             }
             
         }
         catch (SQLException ex)
         {
             Logger.getLogger(EnseignantDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("null");
         }
     }
    
    
    
}
