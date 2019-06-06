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
import projet_final.Classe;
import projet_final.Connexion;
import projet_final.Discipline;
import projet_final.Eleve;
import projet_final.Personne;

/**
 *
 * @author HP
 */
public class ClasseDAO extends DAO<Classe> {

    public ClasseDAO(Connexion conn) {
        super(conn);
    }

    @Override
    public boolean create(Classe obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Classe obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Classe obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Classe find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       /*Discipline dis = new Discipline();
       try {
           ArrayList<String> result;
           result = connect.remplirChampsRequete("SELECT * FROM classe WHERE id = "+ id);
           String[] res = result.get(0).split(",");
           for(int i = 0; i<res.length; ++i)
            System.out.println(res[i]);
           Classe c = new Classe( id,  nom,  niveau);
           
           
           /*     if(result.first()){
        ens = new Enseignant(id, result.getString("cls_nom"));

        result = this.connect.createStatement().executeQuery(
          "SELECT prof_id, prof_nom, prof_prenom from professeur " +
          "INNER JOIN j_mat_prof ON prof_id = jmp_prof_k " +
          "INNER JOIN j_cls_jmp ON jmp_id = jcm_jmp_k AND jcm_cls_k = " + id
        );*/
      /* } catch (SQLException ex) {
            Logger.getLogger(EnseignantDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return dis;*/
    }
       public static void load_Classe (Connexion connect) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             //  Enseignant ens = new Enseignant();
       try {
          ArrayList<String> result;
           
           result = connect.remplirChampsRequete("SELECT * FROM classe Where 1");
           System.out.println(result.size());
           for(int j  = 0; j<result.size(); ++j)
           {
            String[] res = result.get(j).split(",");
           System.out.println(res[2]);
            int id = parseInt(res[0]);
            String niveau = res[3];
            String nom = res[1];
           
            Classe c = new Classe(id, nom, niveau);
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
