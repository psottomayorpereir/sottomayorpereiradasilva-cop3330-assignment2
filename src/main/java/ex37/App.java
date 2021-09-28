/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package ex37;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Character> list = new ArrayList<>();
        int len = 0, spec = 0, num = 0, total = 0;
        String upperLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
        String specChars = "!@#$";
        String numbers = "1234567890";
        char c='a';
        int number = 0;

        System.out.print("What is the minimum length? ");
        len = sc.nextInt();
        System.out.print("How many special characters? ");
        spec = sc.nextInt();
        System.out.print("How many numbers? ");
        num = sc.nextInt();

        total = len + spec + num;
        int temp=total;
        int a=spec+num;
        while (temp != 0) {
            while(a>0){
                number = rand.nextInt(1);
                if(number==0){
                    c = lowerLetters.charAt(rand.nextInt(lowerLetters.length()));
                }
                if(number==1){
                    c = upperLetters.charAt(rand.nextInt(upperLetters.length()));
                }
                list.add(c);
                a=a-1;
            }
            number = rand.nextInt(4);
            if (number == 0) {
                c = upperLetters.charAt(rand.nextInt(upperLetters.length()));
            } else if (number == 1) {
                c = lowerLetters.charAt(rand.nextInt(lowerLetters.length()));
            } else if (number == 2) {
                c = specChars.charAt(rand.nextInt(specChars.length()));
            } else {
                c = numbers.charAt(rand.nextInt(numbers.length()));
            }
            list.add(c);
            temp=temp-1;
        }

        System.out.print("Your password is ");
        for(int j=0;j<total;j++){
            System.out.print(list.get(j));
        }

    }
}