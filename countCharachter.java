package com.assignments;
import java.util.Scanner;

public class countCharacter {
    public static void main(String[] args){
        System.out.println("Type a sentence:");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int count = 0;



        for (int i = 0;i<sentence.length();i++){
            if (sentence.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("Your sentence contains "+ count + " charcters.");


    }
}
