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
import projet_final.Ecole;
import projet_final.Personne;

/**
 *
 * @author HP
 */
public class EcoleDAO extends DAO<Ecole> {

    public EcoleDAO(Connexion conn) {
        super(conn);
    }

    @Override
    public boolean create(Ecole obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Ecole obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Ecole obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ecole find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void load_Ecole (Connexion connect) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             //  Enseignant ens = new Enseignant();
       try {
          ArrayList<String> result;
           
           result = connect.remplirChampsRequete("SELECT * FROM ecole Where 1");
           System.out.println(result.size());
           for(int j  = 0; j<result.size(); ++j)
           {
            String[] res = result.get(j).split(",");
            int id = parseInt(res[0]);
            String nom = res[1];
           
            Ecole e = new Ecole(id, nom);
            //System.out.println(res[1]);
            Ecole.add_ec_to_array(e);
            
           }
           
       } catch (SQLException ex) {
            Logger.getLogger(EcoleDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("null");
        }
       //ens = new Enseignant();
     
    
    }
    public static void load_Classe(Connexion connect, int id) throws SQLException
    {
        for(int i = 0; i<Ecole.get_ecole_list().size(); ++i)
        {
        String req = "SELECT * FROM classe WHERE ecole_id = "+ Ecole.get_ecole_list().get(i).get_id();
        ArrayList<String> result;
        result = connect.remplirChampsRequete(req);
        System.out.println(result.size());
        for(int j  = 0; j<result.size(); ++j)
           {
            String[] res = result.get(j).split(",");
            System.out.println(res[0]);
            Classe c = new Classe(parseInt(res[0]), res[1], res[3], parseInt("" + res[4].charAt(0) + res[4].charAt(1) + res[4].charAt(2) + res[4].charAt(3)));
           
            Ecole.get_ecole_list().get(i).add_class(c);
           // int id = parseInt(res[0]);
           }
        }
        
    }
    
}
