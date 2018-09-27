/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package u2_a3_restaurantbill;

/**
 *
 * @author antho6229
 */

import java.text.DecimalFormat;

public class U2_A3_RestaurantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variable declaration
        double purPrice = 12.49;
        double taxPer = 0.13;
        double taxAmount = 0;
        double total = 0;
        DecimalFormat dFormat = new DecimalFormat("$###.##");
        
        //calculate
        taxAmount = purPrice * taxPer;
        total = taxAmount + purPrice;
        
        //output
        System.out.println("Restaurant Bill\n****************\n\nMeal:\t\t" + dFormat.format(purPrice) + "\nTax:\t\t" + dFormat.format(taxAmount) + "\nTotal:\t\t" + dFormat.format(total));
    }
    
}
