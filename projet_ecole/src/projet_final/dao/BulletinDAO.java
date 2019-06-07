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
import java.util.logging.Level;
import java.util.logging.Logger;
import projet_final.Bulletin;
import projet_final.Connexion;
import projet_final.Discipline;
import projet_final.Eleve;

/**
 *
 * @author sarto
 */
public class BulletinDAO extends DAO<Bulletin> {

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

    public static void load_discipline(Connexion connect) {
        try {
            ArrayList<String> result;

            result = connect.remplirChampsRequete("SELECT * FROM trimestre Where 1");
            System.out.println(result.size());
        } catch (SQLException ex) {
            Logger.getLogger(DisciplineDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("null");
        }
    }

    public static void load_Discipline(Connexion connect) {
        try {
            for (int i = 0; i < Eleve.get_liste_eleve().size(); i++) {
                for (int j = 0; j < Eleve.get_liste_eleve().get(i).get_bulletin_liste().size(); j++) {
                    ArrayList<String> result;
                    result = connect.remplirChampsRequete("SELECT discipline.nom, detailbulletin.coef, detailbulletin.id FROM detailbulletin, discipline,enseignement WHERE discipline.id=enseignement.discipline_id AND enseignement.id=detailbulletin.enseignement_id AND detailbulletin.bulletin_id ="+Eleve.get_liste_eleve().get(i).get_bulletin_liste().get(j));
                    System.out.println(result.size());

                    for (int k = 0; k < result.size(); k++) {
                        String[] res = result.get(k).split(",");
                        Discipline d = new Discipline(res[0],parseDouble(res[1]),parseInt(res[2]));
                        Eleve.get_liste_eleve().get(i).get_bulletin_liste().get(j).add_discipline(d);
                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(EnseignantDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("null");
        }
    }
}
