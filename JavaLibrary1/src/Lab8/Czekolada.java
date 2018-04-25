/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author student
 */
public class Czekolada extends Produkt{
    
    private String smak;
    
         public Czekolada(String name, double price, String describe,String smak){
        super(name, price, describe);
        this.smak=smak;
    }


    
     public void buy() {
        System.out.println(
                "Zakupilem czekoladke");
    }

    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
                + "smak:"+smak
        );
    }
    
}
