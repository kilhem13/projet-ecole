/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final.dao;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projet_final.*;

/**
 *
 * @author HP
 */
public class EvalDAO extends DAO<Eval> {
   
    public EvalDAO(Connexion conn) {
        super(conn);
    }

    @Override
    public boolean create(Eval obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Eval obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Eval obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Eval find(int id) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       Eval eval = new Eval();
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
       eval = new Eval();
       return eval;
    }
   
   
}
