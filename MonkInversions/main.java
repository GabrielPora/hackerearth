package MonkInversions;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
// imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
	 public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine().trim());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            int[][] M = new int[N][N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    M[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            long count = 0;

            // Check every unordered pair of cells
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    for (int p = i; p < N; p++) {           // p >= i
                        for (int q = (p == i ? j + 1 : 0); q < N; q++) { 
							// q >= j when p==i
                            // Now i<=p and j<=q is guaranteed only when p>i
                            // When p==i, q>j so j<q ✅
                            // When p>i, q starts from 0 — need j<=q check
                            if (p > i && q < j) continue;   // j > q, skip
                            if (M[i][j] > M[p][q]) count++;
                        }
                    }
                }
            }

            System.out.println(count);
        }
    }
}
