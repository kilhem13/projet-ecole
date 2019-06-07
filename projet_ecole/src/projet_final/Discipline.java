/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final;

/**
 *
 * @author HP
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author sarto
 */
public class Discipline {
    private String nom;
    private ArrayList<Eval> note_liste;
    private double coef;
    private int id; //id de détail bulletin
    
    public Discipline()
    {
        this.nom = null;
        this.note_liste = null;
        this.coef = 0;
        this.id=0;
    }
    
    public Discipline(String nom, double coef, int id)
    {
        this.nom = nom;
        this.note_liste = null;
        this.coef = coef;
        this.id=id;
    }
    public String get_nom()
    {
        return this.nom;
    }
    
    public double moyenne()
    {
        double coeff=0;
        double moy=0;
        for(int i=0;i<note_liste.size();i++)
        {

            moy+=(note_liste.get(i).getnote())*note_liste.get(i).getcoef();
            coeff+=note_liste.get(i).getcoef();
        }
        return moy/coeff;
    }
    
    public double getcoef()
     {
         return coef;
     }
    public int get_id()
     {
         return id;
     }
    public void add_eval(Eval e)
    {
        note_liste.add(e);
    }


}