package MonkSuffixSort;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int k    = sc.nextInt();

        // Generate all suffixes
        List<String> suffixes = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            suffixes.add(S.substring(i));
        }

        // Sort lexicographically (Java compareTo does this natively)
        Collections.sort(suffixes);

        // Print kth smallest (1-indexed)
        System.out.println(suffixes.get(k - 1));
    }
}
