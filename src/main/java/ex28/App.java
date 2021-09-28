/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package ex28;

import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        int n=0;
        int sum=0;

        for (int i=0; i<5; i++){
            System.out.print("Enter a number: ");
            n=sc.nextInt();
            sum=sum+n;
        }
        System.out.printf("The total is: %d", sum);
    }
}