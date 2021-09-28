/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package ex24;

import java.util.Arrays;
import java.util.Scanner;

public class App
{
    static boolean isAnagram(String word1, String word2)
    {
        char[] word1_arr;
        char[] word2_arr;
        int len1,len2;

        len1=word1.length();
        len2=word2.length();

        if(len1!=len2){
            return false;
        }

        word1_arr = word1.toCharArray();
        word2_arr = word2.toCharArray();

        Arrays.sort(word1_arr);
        Arrays.sort(word2_arr);
        return Arrays.equals(word1_arr, word2_arr);

    }

    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);

        String word1, word2;
        boolean result;

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        word1=sc.nextLine();
        System.out.print("Enter the second string: ");
        word2=sc.nextLine();

        result=isAnagram(word1,word2);
        if(result){
            System.out.printf("\"%s\" and \"%s\" are anagrams.",word1,word2);
        }
        else{
            System.out.printf("\"%s\" and \"%s\" are not anagrams.",word1,word2);
        }

    }
}