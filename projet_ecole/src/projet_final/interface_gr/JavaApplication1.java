/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
  package projet_final.interface_gr;
import java.sql.SQLException;
import javax.swing.JFrame;
import projet_final.Connexion;
import projet_final.Ecole;
import projet_final.Eleve;
import projet_final.dao.BulletinDAO;
import projet_final.dao.ClasseDAO;
import projet_final.dao.DAO;
import projet_final.dao.DisciplineDAO;
import projet_final.dao.EcoleDAO;
import projet_final.dao.EleveDAO;

/**
 *
 * @author nizar
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException 
    {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Fenetre(frame));
        frame.pack();
        frame.setVisible (true);
        //frame.getContentPane()
        frame.getContentPane().add (new Fenetre2(frame));
        frame.getContentPane().add (new Fenetre3());
        frame.getContentPane().add (new Fenetre4());
        frame.getContentPane().add (new Fenetre5());
        frame.getContentPane().add (new Fenetre6());
        frame.getContentPane().add (new Fenetre7());
        frame.getContentPane().add (new Fenetre8());
        frame.getContentPane().add (new Fenetre9());
        frame.getContentPane().add (new Fenetre10());
        frame.getContentPane().add (new Fenetre11());
        frame.getContentPane().add (new Fenetre12());
        frame.getContentPane().add (new Fenetre13());
        frame.getContentPane().add (new Fenetre14());
        frame.getContentPane().add (new Fenetre15());
        frame.getContentPane().add (new Fenetre16());
        frame.getContentPane().add (new Fenetre17());
        frame.getContentPane().add (new Fenetre18());
        
        Connexion con = new Connexion("bdd_gestion", "root", "radiateur");
        Eleve e = new Eleve(1, "Lauro", "Guilhem" ,1);
        
        
        
        //DAO<Ecole> ecdao = new EcoleDAO(con);
        EcoleDAO.load_Ecole(con);
        int id =  Ecole.get_ecole_list().get(0).get_id();
        
        DAO<Ecole> ecdao = new EcoleDAO(con);
        EcoleDAO.load_Classe(con, 1);
        EleveDAO.load_Eleve(con);
        ClasseDAO.load_eleve_in_classe(con);
        EleveDAO.load_Bulletin(con);
        BulletinDAO.load_Discipline(con);
        DisciplineDAO.load_liste_eval(con);
        
        for(int i = 0 ; i < Ecole.get_ecole_list().size(); ++i)
        {
            //int j = 0;
            for(int j = 0; j<Ecole.get_ecole_list().get(i).get_classe().size(); ++j)
            {  System.out.println(Ecole.get_ecole_list().get(i).get_nom());
               System.out.println(Ecole.get_ecole_list().get(i).get_classe().get(j).get_nom());
               System.out.println("Liste eleve classe" + Ecole.get_ecole_list().get(i).get_classe().get(j).get_nom());
               Ecole.get_ecole_list().get(i).get_classe().get(j).afficher_eleve();
               
               System.out.println("Annee Scolaire");
               System.out.println(Ecole.get_ecole_list().get(i).get_classe().get(j).get_annee_scolaire());
               
               for(int it_eleve = 0; it_eleve<Ecole.get_ecole_list().get(i).get_classe().get(j).get_eleve_list().size(); ++it_eleve)
               {
                    System.out.println(Ecole.get_ecole_list().get(i).get_classe().get(j).get_eleve_list().get(it_eleve).get_nom()  +" Appreciation ");
                    System.out.println("Les matieres sont: ");
                    for(int it_bul = 0 ; it_bul<Ecole.get_ecole_list().get(i).get_classe().get(j).get_eleve_list().get(it_eleve).get_bulletin_liste().size(); ++it_bul)
                    {
                        for(int it_disc = 0 ; it_disc<Ecole.get_ecole_list().get(i).get_classe().get(j).get_eleve_list().get(it_eleve).get_bulletin_liste().get(it_bul).get_discipline_liste().size(); ++it_disc)
                        { System.out.println(Ecole.get_ecole_list().get(i).get_classe().get(j).get_eleve_list().get(it_eleve).get_bulletin_liste().get(it_bul).get_discipline_liste().get(it_disc).get_nom());
                        for(int it_eval = 0 ; it_eval<Ecole.get_ecole_list().get(i).get_classe().get(j).get_eleve_list().get(it_eleve).get_bulletin_liste().get(it_bul).get_discipline_liste().size(); ++it_eval)
                            {
                                try{
                                System.out.println(Ecole.get_ecole_list().get(i).get_classe().get(j).get_eleve_list().get(it_eleve).get_bulletin_liste().get(it_bul).get_discipline_liste().get(it_disc).moyenne());
                                System.out.println(Ecole.get_ecole_list().get(i).get_classe().get(j).get_eleve_list().get(it_eleve).get_bulletin_liste().get(it_bul).moyenne());
                                }
                                catch(Exception ex)
                                    {
                                        System.out.println("Toutes les notes sont chargées");
                                    }
                           }
                        }
                    }
                }
               }
            }
        
      
    }
    
}
