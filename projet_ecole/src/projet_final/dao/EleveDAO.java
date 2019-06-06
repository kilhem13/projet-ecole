/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final.dao;

import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.ArrayList;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Eleve obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            Logger.getLogger(EnseignantDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("null");
        }
       //ens = new Enseignant();
     
    
    }
    
    
    
}
