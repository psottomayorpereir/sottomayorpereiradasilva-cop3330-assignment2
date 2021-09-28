/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package ex35;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class App
{

    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        Random rand = new Random();
        ArrayList<String> list = new ArrayList<String>();
        String n="a";
        String prize;
        int number=0, i=0;

        while(n.equals("")==false){
            System.out.print("Enter a name: ");
            n=sc.nextLine();
            if(n.equals("")==false){
                list.add(n);
                i++;
            }
        }

        number = rand.nextInt(i);
        prize=list.get(number);

        System.out.printf("The winner is... %s", prize);

    }
}