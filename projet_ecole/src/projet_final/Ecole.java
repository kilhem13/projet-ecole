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
public class Ecole {
    private static ArrayList<Ecole> ecole_list = new ArrayList<>();
    private int id;
    private String nom;
    private ArrayList<Classe> classe_liste = new ArrayList<>();
    
    public Ecole(int id, String nom)
    {
        this.id = id;
        this.nom = nom;
    }
    public static void add_ec_to_array(Ecole e)
    {
        ecole_list.add(e);
    }
}
