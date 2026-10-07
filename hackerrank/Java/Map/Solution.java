package hackerrank.Java.Map;
import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        // Use a HashMap to store name -> phone number
        HashMap<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name  = in.nextLine();
            int phone    = in.nextInt();
            in.nextLine();

            phoneBook.put(name, phone);
        }

        // Read queries until end of file
        while (in.hasNextLine()) {
            String s = in.nextLine();

            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}