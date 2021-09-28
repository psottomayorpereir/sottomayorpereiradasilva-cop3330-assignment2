/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package ex34;

import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String remove;
        String[] myarray;
        int i=0;
        String[] strArray = new String[15];
        strArray[0]= "John Smith";
        strArray[1]= "Jackie Jackson";
        strArray[2]= "Chris Jones";
        strArray[3]= "Amanda Cullen";
        strArray[4]= "Jeremy Goodwin";

        System.out.println("There are 5 employees: ");
        for(i=0;i<5;i++){
            System.out.println(strArray[i]);
        }

        System.out.println("Enter an employee name to remove: ");
        remove=sc.nextLine();

        i=0;
        while(strArray[i].equals(remove)==false){
            i++;
        }
        strArray[i]="a";
        System.out.println("There are 4 employees: ");
        for(i=0;i<5;i++){
            if(strArray[i].equals("a")){

            }
            else{
                System.out.println(strArray[i]);
            }
        }

    }
}