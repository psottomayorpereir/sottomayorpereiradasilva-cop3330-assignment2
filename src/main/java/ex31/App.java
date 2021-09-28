/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package ex31;

import java.util.Scanner;

public class App
{
    public static void getInputCalculate(){


    }

    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String pulse, age;
        int num1=0,num2=0, var=0, var1=0, res=0;
        double var2=0;
        double target_rate=0;
        boolean check=true;

        do{
            System.out.print("Resting pulse: ");
            pulse=sc.nextLine();
            try{
                num1 = Integer.parseInt(pulse);
                check=true;
            }catch (NumberFormatException ex) {
                System.out.println("Sorry. That's not a valid input.");
                check=false;
            }
        }while(check==false);

        do{
            System.out.print("Age: ");
            age=sc.nextLine();
            try{
                num2 = Integer.parseInt(age);
                check=true;
            }catch (NumberFormatException ex) {
                System.out.println("Sorry. That's not a valid input.");
                check=false;
            }
        }while(check==false);

        System.out.printf("Resting pulse :%d      Age:%d", num1, num2);
        System.out.println("      ");
        System.out.println("Intensity  | Rate");
        System.out.println("-----------|-----------");

        for(double i = 0.55; i<=1.0; i=i+0.05){
            var=220-num2;
            var1=var-num1;
            var2=var1*(i);
            target_rate=var2 + num1;
            res= (int) (i*100);
            System.out.printf("%d%%        |   %d bpm", res, Math.round(target_rate));
            System.out.println("      ");
        }

    }
}