/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_16;

/**
 *
 * @author ifernandezblanco
 */
public class Boletin_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persoa per= new Persoa();
        Canario can=new Canario();
        Galo gal=new Galo();
       Tenor ten=new Tenor();
        per.cantar();
        can.cantar();
        gal.cantar();
        ten.cantar();
        
        IPodeCantar obx=new Persoa();
        obx.cantar();
    }
    
}
