/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package ex26;

import java.util.Scanner;

import static java.lang.Math.log;

class PaymentCalculator{

    public int calculateMonthsUntilPaidOff(float b,float api,float p){
        double n;
        n = -(1/30) * (log(1 + (b/p) * (1 - (1 + (int)(api/365))^30)) / log(1 + (api/365)));
        return (int) n;
    }

}

public class App
{

    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        PaymentCalculator pc = new PaymentCalculator();

        float b, api, p;
        int n;

        System.out.print("What is your balance? ");
        b=sc.nextFloat();
        System.out.print("What is the APR on the card (as a percent)? ");
        api=sc.nextFloat();
        System.out.print("What is the monthly payment you can make? ");
        p=sc.nextFloat();

        n=pc.calculateMonthsUntilPaidOff(b,api,p);

        System.out.printf("It will take you %d months to pay off this card.", n);
    }
}