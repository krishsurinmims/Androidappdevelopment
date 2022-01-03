package com.assignments;
import java.util.*;


public class SumOfNaturalNumbers {
    public static void main(String[] args){

        System.out.println("Sum of Natural Numbers upto N Program");
        System.out.println("N: ");

        Scanner input = new Scanner(System.in);
        int NNumber = input.nextInt();

        if (NNumber<= 0){
            System.out.println("The number you have chosen is not a Natural Number");
        }
        else {

            int Total = NNumber * ((NNumber + 1) / 2);
            System.out.println("The sum of all natural numbers upto " + NNumber + " is " + Total);
        }




    }
}
