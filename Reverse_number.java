package com.assignments;
import java.util.*;
//First, we find the remainder of the given number by using the modulo (%) operator.
//Multiply the variable reverse by 10 and add the remainder into it.
//Divide the number by 10.

public class ReverseNumber {
    public static void main(String[] args ){
        System.out.println("Input the number you would like to reverse");
        Scanner input = new Scanner(System.in);
        int RevNum = input.nextInt();
        if (RevNum == 0){
            System.out.println("The number you've chosen is a single digit number");
        }
        int Number = 0;

        while (RevNum!= 0){
            int  Remainder = RevNum%10;
            Number = (Number *10) + Remainder;
            RevNum = RevNum/10;

        }
        System.out.println("The Reverse of the number is " + Number);














    }
}
