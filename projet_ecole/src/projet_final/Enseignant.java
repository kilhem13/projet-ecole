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

/**
 *
 * @author sarto
 */
public class Enseignant extends Personne {
    private String discipline;
    
    public Enseignant()
    {
        super();
        this.discipline = null;
    }
    
    public Enseignant(String discip, int id, String nom, String prenom)
    {
        super(id, nom, prenom);
        this.discipline = discip;
    }
}