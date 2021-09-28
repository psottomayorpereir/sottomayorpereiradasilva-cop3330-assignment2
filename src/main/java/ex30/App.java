/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package ex30;

public class App
{

    public static void multiplicationTable() {
        System.out.format("      ");
        for(int i = 1; i<=12; i++) {
            System.out.format("%4d", i);
        }
        System.out.println();
        System.out.println("-------------------------------------------------------");
        for(int i = 1; i<=12; i++) {
            System.out.format("%4d |", i);
            for(int j=1; j<=12; j++) {
                System.out.format("%4d", i*j);
            }
            System.out.println();
        }
        return;
    }

    public static void main( String[] args )
    {
        multiplicationTable();
    }
}