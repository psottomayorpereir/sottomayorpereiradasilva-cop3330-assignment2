/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package ex33;

import java.util.Random;
import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt((4 - 1) + 1) + 1;
        String[] myarray;
        String[] strArray = new String[15];
        strArray[0]= "Yes.";
        strArray[1]= "No.";
        strArray[2]= "Maybe.";
        strArray[3]= "Ask again later.";
        String ans;

        System.out.print("What is your question?\n> ");
        ans=sc.nextLine();

        if(number==1){
            System.out.println(strArray[0]);
        }
        else if(number==2){
            System.out.println(strArray[1]);
        }
        else if(number==3){
            System.out.println(strArray[2]);
        }
        else{
            System.out.println(strArray[3]);
        }



    }
}