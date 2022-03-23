package com.assignments;
import java.util.Arrays;


public class SecondLargestInArray {
    public static void main(String[] args){
        int arr[] = {44,66,77,11,43};

        System.out.println("Orignal Array is: ");
        for (int x = 0; x< arr.length; x++){
            System.out.print(arr[x] +" ");
        }

        Arrays.sort(arr);
        System.out.println("");

        System.out.println("Second Largest Integer is: ");
        System.out.print(arr[arr.length-2]);

        //Sorting the Array in Descending order

    }
}
