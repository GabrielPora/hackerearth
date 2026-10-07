import java.io.*;
import java.util.*;

public class Solution {

    // Generic method that accepts any type of array
    static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Integer[] intArray    = {1, 2, 3};
        String[]  stringArray = {"Hello", "World"};

        printArray(intArray);
        printArray(stringArray);
    }
}