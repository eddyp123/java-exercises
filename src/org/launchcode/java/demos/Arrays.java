package org.launchcode.java.demos;

import com.sun.xml.internal.stream.events.ProcessingInstructionEvent;

import java.security.KeyStore;
import java.util.Scanner;
import java.util.*;


/**
 * Created by LaunchCode
 */
public class Arrays {

    public static void main(String[] args) {

        System.out.println("printArrayOfNumbers :: ");
        printArrayOfNumbers();

        System.out.println("arrayCreation :: ");
        arrayCreation();

    }

    public static void printArrayOfNumbers() {

        // Declare and initialize an array of integers
        int[] numbers = {};

        // Loop over the array and print each number
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void arrayCreation() {

        // Declare and initialize an empty array of 10 Integers
        int[] someInts = new int[10];

        // Declare and initialize an array using an array literal
        int[] someOtherInts = {1, 1, 2, 3, 5, 8};

        // We can use a for-in loop with arrays
        for (int i : someInts) {
            System.out.println(i);
        }

        // We can loop through an array with an iterator var as well
        for (int j : someOtherInts) {
            System.out.println(j);
        }


    }
}
