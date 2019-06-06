/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final;

import java.util.ArrayList;

/**
 *
 * @author sarto
 */
public class AnneeScolaire {
    private int id;
    private ArrayList<Trimestre> trim_liste;
    private Date debut;
    private Date fin;
    
    public AnneeScolaire(int id, ArrayList<Trimestre> trim_liste,Date debut,Date fin)
    {
        this.id=id;
        this.trim_liste=trim_liste;
        this.debut=debut;
        this.fin=fin;
    }
}
