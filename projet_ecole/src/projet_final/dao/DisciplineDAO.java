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
import projet_final.Discipline;
import projet_final.Enseignant;
import projet_final.Eval;

/**
 *
 * @author HP
 */
public class DisciplineDAO extends DAO<Discipline> {

    public DisciplineDAO(Connexion conn) {
        super(conn);
    }

    @Override
    public boolean create(Discipline obj) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        String req = "INSERT INTO `discipline` (`ID`, `NOM`) VALUES (NULL, '"+obj.get_nom()+"');";
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
    public boolean delete(Discipline obj) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String req = "DELETE FROM `discipline` WHERE nom='"+obj.get_nom()+"';";
        try {
            connect.executeUpdate(req);
            System.out.println("Deleted");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DisciplineDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Discipline not found");
            return false;
        }
    }

    @Override
    public boolean update(Discipline obj) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       try {
           System.out.println("What to update ?");
           Scanner myObj = new Scanner(System.in);
           int num  = myObj.nextInt();
           switch(num)
           {
               case 1:
                   Scanner myObj2 = new Scanner(System.in);
                   String  new_name = myObj2.nextLine();
                   String req = "UPDATE discipline SET nom = '"+ new_name +"' WHERE nom = '"+ obj.get_nom()+"'";
                   connect.executeUpdate(req);
                  
           }
           return true;
           
           /*     if(result.first()){
        ens = new Enseignant(id, result.getString("cls_nom"));

        result = this.connect.createStatement().executeQuery(
          "SELECT prof_id, prof_nom, prof_prenom from professeur " +
          "INNER JOIN j_mat_prof ON prof_id = jmp_prof_k " +
          "INNER JOIN j_cls_jmp ON jmp_id = jcm_jmp_k AND jcm_cls_k = " + id
        );*/
       } catch (SQLException ex) {
            Logger.getLogger(EnseignantDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public Discipline find(int id) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       Discipline dis = new Discipline();
       try {
           ArrayList<String> result;
           result = connect.remplirChampsRequete("SELECT * FROM enseignant WHERE id = "+ id);
           String[] res = result.get(0).split(",");
           for(int i = 0; i<res.length; ++i)
            System.out.println(res[i]);
           Discipline d = new Discipline(res[0],0);
           
           
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
       return dis;
    }
     public static void load_eval(int id)
    {
        try {
           ArrayList<String> result;
           result = connect.remplirChampsRequete("SELECT * FROM eval WHERE id = "+ id);
           String[] res = result.get(0).split(",");
           for(int i = 0; i<res.length; ++i)
            System.out.println(res[i]);
           Eval e = new Eval( parseInt(res[0]), parseDouble(res[2]), res[1]);
           
           
           /*     if(result.first()){
        eval = new Eval(id, result.getString("cls_nom"));

        result = this.connect.createStatement().executeQuery(
          "SELECT prof_id, prof_nom, prof_prenom from professeur " +
          "INNER JOIN j_mat_prof ON prof_id = jmp_prof_k " +
          "INNER JOIN j_cls_jmp ON jmp_id = jcm_jmp_k AND jcm_cls_k = " + id
        );*/
       } catch (SQLException ex) {
            Logger.getLogger(EvalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
