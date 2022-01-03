package com.assignments;
import java.util.*;



public class FactorialProgram {

    public static void main(String[] args){
        // input an integer to find the factorial of
        System.out.println("Type the number you would like to find the factorial of:");
        Scanner input = new Scanner(System.in);
        int Numin = input.nextInt();
        int multi = 1;

        //checks if the integer is 0, 0! = 1
        if(Numin == 0){
            System.out.println("The Factorial is 1");
        }
        else if(Numin < 0){
            System.out.println("A Factorial is defined only for non-negative integer numbers.");
        }
        else {
            // for loop that multiplies numbers till the chosen integer
            for (int i = 1; i <= Numin; i++) {

                multi = multi * i;

            }
            System.out.println("The Factorial of " + Numin + " is" +": "+ multi  );
        }
        }

    }
