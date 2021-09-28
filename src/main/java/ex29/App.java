/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package ex29;

import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String n;
        int num1=0;
        float years=0;
        boolean check=true;

        do{
            System.out.print("What is the rate of the return? ");
            n=sc.nextLine();
            try{
                num1 = Integer.parseInt(n);
                check=true;
            }catch (NumberFormatException ex) {
                check=false;
            }
            if(num1==0){
                System.out.println("Sorry. That's not a valid input.");
            }
        }while(num1==0 || check==false);

        years=72/(float)num1;

        System.out.printf("It will take %.1f years to double your initial investment.",years);

    }
}
