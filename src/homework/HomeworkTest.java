/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Scanner;

/**
 *
 * @author ATB
 */
public class HomeworkTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Homework test = new Homework();
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Dividend: ");
        test.setDividend(input.nextInt());
        
        System.out.print("Enter Divisor: ");
        test.setDivisor(input.nextInt());
        
        int qot = test.divide(test.getDividend(), test.getDivisor());
        int rem = test.remainder(test.getDividend(), test.getDivisor());
        
        System.out.println("Quotient ======>>>>  " + qot);
        System.out.println("Ramainder ======>>>>  " + rem);
        
        System.exit(0);
    }
    
}
