package com.assignments;

public class CopyArray {
    public static void main(String[] args) {

        System.out.println("Welcome to Arrays.");


        // Initialize the array
        int a[] = {1,2,3,4,5,6};

        // Printing out the array
        System.out.println("Elements of Original Array are:");
        for ( int i:a) {
            System.out.print(i + " ");

        }
        System.out.println();

        // Initialize the array the original one has to be copied into
        int b[] = new int[a.length];
        System.out.println("Elements of Copied array are:");


        for (int x=0; x< a.length; x++) {
            b[x] = a[x];


        }
        for ( int i:b) {
            System.out.print(i + " ");
        }







    }
}
