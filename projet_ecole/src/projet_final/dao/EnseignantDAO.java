/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final.dao;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import projet_final.Connexion;
import projet_final.Enseignant;
import projet_final.Eval;
import projet_final.Personne;

/**
 *
 * @author HP
 */
public class EnseignantDAO extends DAO<Enseignant> {

    public EnseignantDAO(Connexion conn) {
        super(conn);
    }

    @Override
    public boolean create(Enseignant obj) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           String req = "INSERT INTO `personne` (`ID`, `NOM`, PRENOM, TYPE) VALUES (NULL, '"+obj.get_nom()+"', '"+ obj.get_prenom() +"', 2);";
        try {
            connect.executeUpdate(req);
            Scanner sc_classe = new Scanner(System.in);
            String classe = sc_classe.nextLine();
            String req3 = "SELECT ID FROM classe WHERE nom = '"+classe+"'";
            ArrayList<String> result = connect.remplirChampsRequete(req3);
            String[] res = result.get(0).split(",");
            System.out.println(res[0]);
            
            String req4 = "SELECT ID FROM personne WHERE id = '"+obj.get_nom()+"'";
            ArrayList<String> result2 = connect.remplirChampsRequete(req4);
            
            String[] res2 = result2.get(0).split(",");
            System.out.println(res2[0]);
            
            String matiere = obj.get_discipline();
            String req5 = "SELECT ID FROM discipline WHERE nom = '"+obj.get_discipline()+"'";
            ArrayList<String> result3 = connect.remplirChampsRequete(req5);
             String[] res5 = result3.get(0).split(",");
            
            String req2 = "INSERT INTO enseignement(`ID`, `CLASSE_ID`, DISCIPLINE_ID, PERSONNE_ID) VALUES(NULL,"+res[0]+", "+res5[0]+", "+res2[0]+")"; 
            connect.executeUpdate(req2);
            System.out.println("Inserted");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DisciplineDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Discipline not found");
            return false;
        }
    }

    @Override
    public boolean delete(Enseignant obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Enseignant obj) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public Enseignant find(int id) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               Enseignant ens = new Enseignant();
       try {
           ArrayList<String> result;
           result = connect.remplirChampsRequete("SELECT * FROM enseignant WHERE id = "+ id);
           String[] res = result.get(0).split(",");
           for(int i = 0; i<res.length; ++i)
            System.out.println(res[i]);
       //    Enseignant e = new Enseignant(res[0]);
           
           
           /*     if(result.first()){
        ens = new Enseignant(id, result.getString("cls_nom"));

        result = this.connect.createStatement().executeQuery(
          "SELECT prof_id, prof_nom, prof_prenom from professeur " +
          "INNER JOIN j_mat_prof ON prof_id = jmp_prof_k " +
          "INNER JOIN j_cls_jmp ON jmp_id = jcm_jmp_k AND jcm_cls_k = " + id
        );*/
       } catch (SQLException ex) {
            Logger.getLogger(EnseignantDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       ens = new Enseignant();
       return ens;
    
    }
        public static void load_enseignant (Connexion connect) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             //  Enseignant ens = new Enseignant();
       try {
          ArrayList<String> result;
           
           result = connect.remplirChampsRequete("SELECT * FROM Personne Where Type = 2");
           System.out.println(result.size());
           for(int j  = 0; j<result.size(); ++j)
           {
            String[] res = result.get(j).split(",");
           System.out.println(res[2]);
            int id = parseInt(res[0]);
            String prenom = res[1];
            String nom = res[2];
            String req = "SELECT nom FROM `discipline` WHERE `ID` = (SELECT DISCIPLINE_ID FROM enseignement WHERE PERSONNE_ID = "+id+" and id = (SELECT MIN(id) FROM enseignement WHERE PERSONNE_ID = "+ id +"))";
            ArrayList<String> result2 = connect.remplirChampsRequete(req);
            
            res = result2.get(0).split(",");
            String discip = "";
            for(int k = 0; k<res.length; ++k)
             discip = res[k];
            
            Enseignant e = new Enseignant(discip, id, prenom, nom, 2);
            //System.out.println(e);
            Personne.add_en_to_array(e);
            
           }
           
           /*     if(result.first()){
        ens = new Enseignant(id, result.getString("cls_nom"));

        result = this.connect.createStatement().executeQuery(
          "SELECT prof_id, prof_nom, prof_prenom from professeur " +
          "INNER JOIN j_mat_prof ON prof_id = jmp_prof_k " +
          "INNER JOIN j_cls_jmp ON jmp_id = jcm_jmp_k AND jcm_cls_k = " + id
        );*/
       } catch (SQLException ex) {
            Logger.getLogger(EnseignantDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("null");
        }
       //ens = new Enseignant();
     
    
    }

    
}
