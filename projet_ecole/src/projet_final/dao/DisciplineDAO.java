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
import projet_final.Eleve;
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

        String req = "INSERT INTO `discipline` (`ID`, `NOM`) VALUES (NULL, '" + obj.get_nom() + "');";
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
        String req = "DELETE FROM `discipline` WHERE nom='" + obj.get_nom() + "';";
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
            int num = myObj.nextInt();
            switch (num) {
                case 1:
                    Scanner myObj2 = new Scanner(System.in);
                    String new_name = myObj2.nextLine();
                    String req = "UPDATE discipline SET nom = '" + new_name + "' WHERE nom = '" + obj.get_nom() + "'";
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
            result = connect.remplirChampsRequete("SELECT * FROM enseignant WHERE id = " + id);
            String[] res = result.get(0).split(",");
            for (int i = 0; i < res.length; ++i) {
                System.out.println(res[i]);
            }
            Discipline d = new Discipline(res[0], 0);

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

    public static void load_liste_eval(Connexion connect) {
        try {
            for (int i = 0; i < Eleve.get_liste_eleve().size(); i++) {
                for (int j = 0; j < Eleve.get_liste_eleve().get(i).get_bulletin_liste().size(); j++) {
                    for (int k = 0; k < Eleve.get_liste_eleve().get(i).get_bulletin_liste().get(j).get_discipline_liste().size(); k++) {
                        ArrayList<String> result;
                        result = connect.remplirChampsRequete("SELECT evaluation.id, evaluation.note, evaluation.appreciation, evaluation.coef FROM evaluation , detailbulletin WHERE detailbulletin.id ="+Eleve.get_liste_eleve().get(i).get_bulletin_liste().get(j).get_discipline_liste().get(k).get_id());
                        System.out.println(result.size());

                        for (int l = 0; l < result.size(); l++) {
                            String[] res = result.get(l).split(",");
                            Eval e= new Eval(parseInt(res[0]),parseDouble(res[1]),res[2],parseDouble(res[3]));
                            Eleve.get_liste_eleve().get(i).get_bulletin_liste().get(j).get_discipline_liste().get(k).add_eval(e);
                        }
                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(EnseignantDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("null");
        }
    }

}
