/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package ex27;

import java.util.Scanner;

public class App
{
    public static void validateInput(String first, String last, String zip, String id){
        boolean res1, res2, res3, res4;
        res1=validateFirst(first);
        res2=validateFirst(last);
        res3=validateZip(zip);
        res4=validateId(id);
        if(res1&&res2&&res3&&res4){
            System.out.print("There were no errors found.");
        }
        else{
            System.out.print("The first name must be at least 2 characters long.\n" +
                    "The last name must be at least 2 characters long.\n" +
                    "The last name must be filled in.\n" +
                    "The employee ID must be in the format of AA-1234.\n" +
                    "The zipcode must be a 5 digit number.");
        }
    }

    public static boolean validateId(String id){
        char[] arr= id.toCharArray();
        if(arr.length==7){
            if(arr[0]>='A' && arr[0]<='Z'){
                if(arr[1]>='A' && arr[1]<='Z'){
                    if(arr[2]=='-'){
                        if(arr[3]>='0' && arr[3]<='9'){
                            if(arr[3]>='0' && arr[3]<='9'){
                                if(arr[3]>='0' && arr[3]<='9'){
                                    if(arr[3]>='0' && arr[3]<='9'){
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;

    }

    public static boolean validateZip(String zip){
        if((zip.matches("[0-9]+")) && (zip.length()==5)){
            return true;
        }
        return false;

    }

    public static boolean validateFirst(String first){
        if((first.matches("[a-zA-Z]+")) && (first.length()>=2)){
            return true;
        }
        return false;

    }

    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);

        String first, last, id, zip;

        System.out.print("Enter the first name: ");
        first=sc.nextLine();
        System.out.print("Enter the last name: ");
        last=sc.nextLine();
        System.out.print("Enter the ZIP code: ");
        zip=sc.nextLine();
        System.out.print("Enter the employee ID: ");
        id=sc.nextLine();

        validateInput(first, last, zip, id);
    }
}