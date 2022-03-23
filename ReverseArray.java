package com.assignments;

public class ReverseArrayProgram {
    public static void  main(String[] args){

        // initialise the array
        int arr[] = {1,2,3,4,5};

        System.out.println("The orignal array is:");

        //print out original array
        for ( int x =0; x <= arr.length -1 ; x++){

            System.out.print(arr[x] + " ");
        }

        System.out.println("");
        System.out.println("The array reversed is:");


        //print out reverse of the orignal array by going backwards through the indices
        for (int x = arr.length - 1 ; x >=0 ; x--){


            System.out.print(arr[x] + " ");
        }





    }
}
