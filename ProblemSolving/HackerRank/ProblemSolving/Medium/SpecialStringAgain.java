package ProblemSolving.HackerRank.ProblemSolving.Medium;

import java.io.*;
import java.util.*;

public class SpecialStringAgain {

    public static class Solution {

        static long substrCount(int n, String s) {
            long ans = n;

            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    int j = 1;

                    while (s.charAt(i) == s.charAt(i + j)) {
                        ++ans;
                        ++j;
                    }
                } else {
                    int j = 1;
                    char c = s.charAt(i + 1);

                    while (i - j >= 0 && i + j < n && s.charAt(i - j) == c && s.charAt(i + j) == c) {
                        ++ans;
                        ++j;
                    }
                }

            }

            return ans;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String s = scanner.nextLine();

            long result = substrCount(n, s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();
        }
    }

}
