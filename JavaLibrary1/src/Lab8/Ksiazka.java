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
public class Ksiazka extends Produkt {
    
    
    public Ksiazka(String name, double price, String describe){
        super(name, price, describe);
        
    }
    public void buy() {
        System.out.println(
                "Zakupilem ksiazeczke");
    }

    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
                
        );
    }
}
