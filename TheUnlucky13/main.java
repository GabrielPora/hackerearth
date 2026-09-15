package TheUnlucky13;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine().trim());

        // Transition matrix
        // State 0 = last char was NOT 1
        // State 1 = last char WAS 1
        //      S0  S1
        // S0 [  9,  8 ]
        // S1 [  1,  1 ]
        long[][] transMatrix = {
            {9, 8},
            {1, 1}
        };

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            long N = Long.parseLong(br.readLine().trim());

            if (N == 1) {
                // Base case: 10 single-digit strings (0-9), none can contain "13"
                sb.append(10).append('\n');
                continue;
            }

            // Initial state vector after 1 character:
            // S0 = 9 (digits 0,2,3,4,5,6,7,8,9)
            // S1 = 1 (digit 1)
            long s0 = 9L;
            long s1 = 1L;

            // Apply T^(N-1) to the initial vector
            long[][] Tn = matPow(transMatrix, N - 1);

            long newS0 = (Tn[0][0] * s0 + Tn[0][1] * s1) % MOD;
            long newS1 = (Tn[1][0] * s0 + Tn[1][1] * s1) % MOD;

            long answer = (newS0 + newS1) % MOD;
            sb.append(answer).append('\n');
        }

        System.out.print(sb);
    }

    static final long MOD = 1_000_000_009L;

    // ── 2x2 matrix multiplication ──────────────────────────────────
    static long[][] matMul(long[][] A, long[][] B) {
        int n = A.length;
        long[][] C = new long[n][n];
        for (int i = 0; i < n; i++)
            for (int k = 0; k < n; k++)
                if (A[i][k] != 0)
                    for (int j = 0; j < n; j++)
                        C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % MOD;
        return C;
    }

    // ── Matrix exponentiation: A^p ─────────────────────────────────
    static long[][] matPow(long[][] A, long p) {
        int n = A.length;
        // Start with identity matrix
        long[][] result = new long[n][n];
        for (int i = 0; i < n; i++) result[i][i] = 1;

        while (p > 0) {
            if ((p & 1) == 1) result = matMul(result, A);
            A = matMul(A, A);
            p >>= 1;
        }
        return result;
    }
}
