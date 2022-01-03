package com.assignments;

public class PrimeNumber {

    public static void main(String[] args) {

        int num = 13;
        int FactorCount = 0;

        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    FactorCount++;
            }
            if (FactorCount > 2) {
                System.out.println("The Number you have chosen is not a Prime Number!");
            } else {
                System.out.println("The Number you have chosen is a Prime Number!");
            }

        } else {
            System.out.println("The Number is not a Prime Number");
        }
    }



        }
