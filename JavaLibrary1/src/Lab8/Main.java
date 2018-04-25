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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        Tractor tr = new Tractor("Ursus", 250000, "szybki");
        
        tr.buy();
        tr.showInfo();
                
  
        Produkt[] produkt = new Produkt[10];
        
        produkt[0] = new Ksiazka("Wladca pierscieni", 35, "fantasy");
        produkt[1] = new Czekolada("Wedel", 3, "smaczna","truskawkowa");
        produkt[2] = new Ksiazka("Harry Potter", 35, "fantasy");
        produkt[3] = new Dlugopis("BIC", 1, "czarny");
        produkt[4] = new Dzem("Jakis", 3, "truskawkowy");
        produkt[5] = new Polopiryna("Lek", 10, "szybki");
        produkt[6] = new Czekolada("Milka", 3, "smaczna","toffi");
        produkt[7] = new Dlugopis("BIC", 1, "niebieski");
        produkt[8] = new Ksiazka("Hobbit", 25, "fantasy");
        produkt[9] = new Tractor("Ursus", 400000, "wolny");
        
        
        for(int i=0; i<10; i++){
            System.out.println("\nProdukt "+(i+1));
            produkt[i].buy();
            produkt[i].showInfo();
                 
        }
        
        
    }
    
}
