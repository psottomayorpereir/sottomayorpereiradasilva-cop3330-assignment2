/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package ex32;

import java.util.Scanner;
import java.util.Random;

public class App
{

    public static void main( String[] args )
    {
        Random rand = new Random();
        Scanner sc= new Scanner(System.in);
        int dif=0;
        int i=0;
        int number=-1;
        String guess;
        int guess1=0;
        String n;
        boolean check=true;
        int upperbound = 0;
        char choice ='Y';

        do{
            System.out.println("Let's play Guess the Number!");

            do{
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                n=sc.nextLine();
                try{
                    dif = Integer.parseInt(n);
                    check=true;
                }catch (NumberFormatException ex) {
                    System.out.println("Sorry. That's not a valid input.");
                    check=false;
                }
            }while(check==false);

            if(dif==1){
                upperbound=10;
            }
            else if(dif==2){
                upperbound=100;
            }
            else if(dif==3){
                upperbound=1000;
            }

            number = rand.nextInt((upperbound - 1) + 1) + 1;
            System.out.print("I have my number. What is your guess? ");

            while(number!=guess1){
                do{
                    guess=sc.nextLine();
                    try{
                        guess1 = Integer.parseInt(guess);
                        check=true;
                    }catch (NumberFormatException ex) {
                        System.out.println("Sorry. That's not a valid input.");
                        check=false;
                    }
                    if(check==true){
                        if(guess1>number){
                            System.out.print("Too high! Guess again: ");
                        }
                        else if(guess1<number){
                            System.out.print("Too low! Guess again: ");
                        }
                    }
                    i++;
                }while(guess1!=number);
            }

            System.out.printf("You guessed it in %d guesses", i);
            System.out.print("\nDo you wish to play again (Y/N)? ");
            choice=sc.next().charAt(0);
            choice=Character.toUpperCase(choice);


        }while(choice=='Y');


    }
}