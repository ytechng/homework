/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author ATB
 */
public class Homework {

    // variable declarations
    private int dividend;
    private int divisor;

    public Homework() {
        // variable initialization during instantiation
        this.dividend = 0;
        this.divisor = 0;
    }

    // method to divide x and y and it will return floor value
    public int divide(int dividend, int divisor) {
        
        this.checkNegativeDivisor(divisor);

        // Calculate sign of divisor i.e., sign will be negative only if 
        // either one of them is negative otherwise it will be positive
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        // update divisor and dividend positive
        this.dividend = Math.abs(dividend);
        this.divisor = Math.abs(divisor);

        // declare and initialize quotient
        int quotient = 0;

        while (this.dividend >= this.divisor) {
            this.dividend -= this.divisor;
            ++quotient;
        }
        return sign * quotient;
    }
    
    
    // method to return the remain when x divisible b y
    public int remainder(int dividend, int divisor) {
        
        this.checkNegativeDivisor(divisor);
        
        // if either dividend or divisor is negative
        if (dividend < 0) {
            dividend *= -1;
        }
        
        if (divisor < 0) {
            divisor *= -1;
        }
        
        // substract divisor from dividend untill dividend greater or equalto divisor
        while (dividend >= divisor) {
            dividend -= divisor;
        }
        
        return dividend;
    }
    
    public boolean checkNegativeDivisor(int v) {
        if (v == 0) {
            System.out.println();
            System.out.println("==================================================");
            System.out.println("The value of the denominator cannot be zero!");
            System.out.println("==================================================");
            return false;
        }
        
        return true;
    }

    public int getDividend() {
        return dividend;
    }

    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

}
