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
        int len=0, spec=0, num=0, total=0;
        String upperLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
        String specChars = "!@#$";
        String numbers = "1234567890";
        char c;

        System.out.print("What is the minimum length? ");
        len=sc.nextInt();
        System.out.print("How many special characters? ");
        spec=sc.nextInt();
        System.out.print("How many numbers? ");
        num=sc.nextInt();

        total=len+spec+num;
        while(total!=0){
            while(len>0){

            }
            list.add(c);
        }

        System.out.print("Your password is "+ list);

}