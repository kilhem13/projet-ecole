/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_final;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 *
 * @author sarto
*/public class Eval {
    private double note;
    private String appreciation;
    private int id;
    private double coef;
    
    public Eval()
    {
        this.note = 0;
        this.appreciation = null;
        this.id = 0;
    }
     public Eval(int id, double note, String app)
    {
        this.note = note;
        this.appreciation = app;
        this.id = id;
    }

     public double get_note()
     {
         return note;
     }
    public double get_coef()
     {
         return coef;
     }
    
}