/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input. */
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input */

        //BufferedReader
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String name = br.readLine();                // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        // Scanner s = new Scanner(System.in);
        // String name = s.nextLine();                 // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT


        // Write your code here


        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int N = Integer.parseInt(br.readLine().trim());
        // String S = br.readLine().trim();
 
        // System.out.println(N * 2);
        // System.out.println(S);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        // Read and validate N
        String lineN = br.readLine();
        if (lineN == null) {
            throw new IllegalArgumentException("Missing input: N is required.");
        }
        int N;
        try {
            N = Integer.parseInt(lineN.trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: N must be an integer.");
        }
        if (N < 0 || N > 10) {
            throw new IllegalArgumentException("Constraint violated: N must be between 0 and 10, got " + N);
        }
 
        // Read and validate S
        String S = br.readLine();
        if (S == null) {
            throw new IllegalArgumentException("Missing input: S is required.");
        }
        S = S.trim();
        if (S.length() < 1 || S.length() > 15) {
            throw new IllegalArgumentException("Constraint violated: length of S must be between 1 and 15, got " + S.length());
        }
 
        System.out.println(N * 2);
        System.out.println(S);


    }
}
