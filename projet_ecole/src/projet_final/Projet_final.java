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
       
        Connexion con = new Connexion("ecole", "root", "radiateur");
       // DAO<Enseignant> disdao = new EnseignantDAO(con);
        EnseignantDAO.load_enseignant(con);
        /*Discipline d = new Discipline("Math", 4);
        
        
        
        
        DAO<Discipline> disdao = new DisciplineDAO(con);
        disdao.delete(d);
      /* DAO<Eval> evaldao = new EvalDAO(con);
       Eval eval = evaldao.find(1);
        // TODO code application logic here*/
    }
    
}
