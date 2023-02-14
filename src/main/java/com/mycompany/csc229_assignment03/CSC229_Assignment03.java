/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc229_assignment03;

/**
 *
 * @author HP
 */

                                                        // Alogrithm Type : O(N) Alogrithm
public class CSC229_Assignment03 {                      //Side note, is this how you wanted it? This assignment was a bit confusing..
    public static int getLargest(int arr[], int sz){
        int iterate1=0;                                 //iterate1 = 0
        int iterate2=0;                                 //iterate2 = 1
        int largest=0;                                  //largest  = 2
        while(iterate1 < sz - 1){                       //0 < 3 -1
            iterate2++;                                 //1 -> 2 
            if(iterate2==sz){                           //2 != 3 
                iterate1++;                             //1
                iterate2=iterate1;                      //iterate2 = 1 
                continue;
            }
            int product = arr[iterate1] * arr[iterate2]; // product = 1
            if(product>largest)                          // if( 1 > 2 )
                largest = product;                       // false
        }
        return largest;                                  // return 2
    }
                                                         // --- sample input ---
                                                         //public static void main(String[] args){
                                                         //    int[] x = {0,1,2};
                                                         //    System.out.print(getLargest(x,3));
                                                         //}
}