/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package ex25;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class App
{
    static int passwordValidator(String pass)
    {
        Pattern p = Pattern.compile("[^A-Za-z0-9 ]");
        Matcher m = p.matcher(pass);
        if((pass.matches("[0-9]+")) && (pass.length()<8)){
            return 1;
        }
        else if((pass.matches("[a-zA-Z]+")) && (pass.length()<8)){
            return 2;
        }
        else if(pass.matches(".*[a-z].*") && pass.matches(".*\\d.*") && pass.length() >= 8  && m.find()) {
            return 4;
        }
        else if(pass.matches(".*[a-z].*") && pass.matches(".*\\d.*") && pass.length()>=8){
            return 3;
        }
        return 0;
    }

    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);

        String pass;
        int result;

        System.out.println("Enter a password:");
        pass=sc.nextLine();

        result=passwordValidator(pass);
        if(result==1){
            System.out.printf("The password '%s' is a very weak password", pass);
        }
        else if(result==2){
            System.out.printf("The password '%s' is a weak password", pass);
        }
        else if(result==3){
            System.out.printf("The password '%s' is a strong password", pass);
        }
        else if(result==4){
            System.out.printf("The password '%s' is a very strong password", pass);
        }
        else{
            System.out.printf("The password '%s' is not valid", pass);
        }

    }
}