package com.brigelabz.day3array;

public class ReverseArray {
    public static void main(String[] args) {

            int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
            // Declaration of the array.
            for (int i = array.length - 1; i >= 0; i--) {
                // Condition is given to get the element in reverse order.
                System.out.print(array[i] + " ");
            }
        }
    }



