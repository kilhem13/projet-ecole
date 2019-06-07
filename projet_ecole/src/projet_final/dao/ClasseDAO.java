/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final.dao;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projet_final.Classe;
import projet_final.Connexion;
import projet_final.Discipline;
import projet_final.Ecole;
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
      /* public static void load_Classe (Connexion connect) {
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
     
    
    }*/
    public static void load_eleve_in_classe(Connexion connect) throws SQLException
    {
        
        {
        for(int i = 0; i<Ecole.get_ecole_list().size(); ++i)
        {
            System.out.println("nb class"+Ecole.get_ecole_list().get(i).get_classe().size());
            for(int y = 0; y < Ecole.get_ecole_list().get(i).get_classe().size(); ++y)
            {
                String req = "SELECT personne_id FROM inscription WHERE classe_id = "+ Ecole.get_ecole_list().get(i).get_classe().get(y).get_id();
                ArrayList<String> result;
                result = connect.remplirChampsRequete(req);
                System.out.println("nb eleve "+result.size());
                for(int j  = 0; j<result.size(); ++j)
                   {
                    String[] res = result.get(j).split(",");
                    System.out.println("eleve "+res[0]);
                    Eleve e;
                    for(int it_eleve = 0; it_eleve < Personne.get_liste_eleve().size(); ++it_eleve)
                    {
                        //try
                            {
                              // the String to int conversion happens here
                             // int eleve = Integer.parseInt(res[0]);

                              // print out the value after the conversion
                              System.out.println("int i = " + i);
                              String res_parse = "" + res[0].charAt(0);
                              
                              if( res_parse.equalsIgnoreCase( String.valueOf(Personne.get_liste_eleve().get(it_eleve).get_id())))
                                {
                                    e = Personne.get_liste_eleve().get(it_eleve);
                                    Ecole.get_ecole_list().get(i).get_classe().get(y).add_eleve(e);
                                    System.out.println("good");
                            
                            break;
                                }
                              
                            }
                           /* catch (NumberFormatException nfe)
                            {
                                System.out.println("bad");
                              System.out.println("NumberFormatException: " + nfe.getMessage());
                            }*/
                        
                        
                    }
                    //if(e != null)
                        
                    /*Classe c = new Classe(parseInt(res[0]), res[1], res[3]);
                    Ecole.get_ecole_list().get(i).add_class(c);*/
                   // int id = parseInt(res[0]);
                    }
            }
        
        }
        
    }
    }
    
}
