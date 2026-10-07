import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Write your code here
class Arithmetic {
    // Method returns int sum of two integers
    int add(int a, int b){
        return a + b;
    }
}

class Adder extends Arithmetic{
    // Inherits add() from Arithmetic, nothing extra needed
}


public class Solution {
    public static void main(String[] args) {
        Adder a = new Adder();

        // Print the name of the superclass
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print results of 3 add() calls space-separated
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
    }
}