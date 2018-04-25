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
public class Dzem extends Produkt {
    
     public Dzem(String name, double price, String describe){
        super(name, price, describe);
    }
    
    
     public void buy() {
        System.out.println(
                "Zakupilem dzemor");
    }

    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
    }
    
}