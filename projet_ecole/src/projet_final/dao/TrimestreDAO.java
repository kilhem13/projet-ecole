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
import projet_final.Ecole;
import projet_final.Trimestre;

/**
 *
 * @author sarto
 */
public class TrimestreDAO extends DAO<Trimestre>{

    public TrimestreDAO(Connexion conn) {
        super(conn);
    }

    @Override
    public boolean create(Trimestre obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Trimestre obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Trimestre obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Trimestre find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void load_Trimestre(Connexion connect)
    {
        try
        {
           ArrayList<String> result;
           
           result = connect.remplirChampsRequete("SELECT * FROM trimestre Where 1");
            System.out.println(result.size());
           for(int j  = 0; j<result.size(); ++j)
           {
            String[] res = result.get(j).split(",");
            int id = parseInt(res[0]);
            String nom = res[1];
           
            Trimestre t = new Trimestre(id, nom);
            //System.out.println(res[1]);
            Ecole.add_ec_to_array(e);
           }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(TrimestreDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("null");
        }
    }
}
