package week1;

import java.util.Arrays;
import java.util.Scanner;

public class DominosPiling {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int m = b.nextInt();
        int n = b.nextInt();
        int[][] dp = new int[m + 1][n + 1];
        for (int[] d : dp)
            Arrays.fill(d, -1);
        System.out.println(findDominoes(m, n, dp));
    }

    public static int findDominoes(int m, int n, int[][] dp) {
        if (m <= 0 || n <= 0)
            return 0;
        if (n == 1) {
            return m / 2;
        }
        if (m == 1)
            return n / 2;
        if (dp[m][n] != -1)
            return dp[m][n];
        int h = 1 + (dp[m - 1][n] != -1 ? dp[m - 1][n] : findDominoes(m - 1, n, dp)) + (dp[m][n - 2] != -1 ? dp[m][n - 2] : findDominoes(m, n - 2, dp)) - (dp[m - 1][n - 2] != -1 ? dp[m - 1][n - 2] : findDominoes(m - 1, n - 2, dp));
        int v = 1 + (dp[m - 2][n] != -1 ? dp[m - 2][n] : findDominoes(m - 2, n, dp)) + (dp[m][n - 1] != -1 ? dp[m][n - 1] : findDominoes(m, n - 1, dp)) - (dp[m - 2][n - 1] != -1 ? dp[m - 2][n - 1] : findDominoes(m - 2, n - 1, dp));
        dp[m][n] = Math.max(h, v);
        return dp[m][n];
    }

}
