/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projet_final.Bulletin;
import projet_final.Connexion;

/**
 *
 * @author sarto
 */
public class BulletinDAO extends DAO<Bulletin>{

    public BulletinDAO(Connexion conn) {
        super(conn);
    }

    @Override
    public boolean create(Bulletin obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Bulletin obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Bulletin obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Bulletin find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void load_discipline(Connexion connect)
    {
        try
        {
            ArrayList<String> result;
           
           result = connect.remplirChampsRequete("SELECT * FROM trimestre Where 1");
            System.out.println(result.size());
        }
        catch(SQLException ex)
        {
            Logger.getLogger(DisciplineDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("null");
        }
    }
    
}
