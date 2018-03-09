/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaOpdrachtenA2.eindopdrachten;

/**
 *
 * @author Erik Mast <e.mast@drenthecollege.nl>
 */
public class Opdracht1 {
    //Fibonacci reeks is 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    public static void main(String[] args) {
    	int input = Integer.parseInt(args[0]); // input van user ophalen
    	
    	Fibonacci fibCalculator = new Fibonacci();  // class aanroepen - "object aanmaken"
    	fibCalculator.printFib(input);		        // de printFibonacci aanroepen - deze verzorgt de sequence voor het printen en
    												// start de sequence voor het berekenen.
    }    
}
