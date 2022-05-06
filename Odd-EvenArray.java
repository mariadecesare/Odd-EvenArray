/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mariadecesare
 */

import java.util.*;
import java.util.Scanner;

public class Exercise3 {
    
    public static void main(String[] args) {
        
        //declare variable for length of array
        int length;
        
        Scanner sc = new Scanner(System.in);
        
        //get length of array
        System.out.println("Enter the length of the array: ");
        length = sc.nextInt();
        
        //declare array
        int arr[] = new int[length];
        
        //get array
        System.out.println("Enter the array: ");
        for(int i  = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }            
        
        //print given array
        System.out.println("Array: " + Arrays.toString(arr));
        
        //initialize variables for lengths of odd and even arrays
        int evenLength = 0, oddLength = 0;
        
        //separate even and odd elements
        for(int i = 0; i < length; i++) {
            if(arr[i] % 2 == 0) {
                evenLength++;
            }
            else {
                oddLength++;
            }
        }

        //declare odd and even arrays
        int arrayEven[] = new int[evenLength];
        int arrayOdd[] = new int[oddLength];
        
        //get arrays
        int j = 0, k = 0;
        for(int i = 0; i < length; i++) {
            if(arr[i] % 2 == 0) {
                arrayEven[j] = arr[i];
                j++;
            }
            else {
                arrayOdd[k] = arr[i];
                k++;
            }
        }
        
        System.out.println("Array of the even numbers: " + Arrays.toString(arrayEven));
        System.out.println("Array of the odd numbers: " + Arrays.toString(arrayOdd)); 
    }
}
        