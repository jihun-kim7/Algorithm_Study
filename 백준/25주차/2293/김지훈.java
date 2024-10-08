package coplit.dailyCoding.study.백준.week25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2293 {

    static int n, k;
    static int[] coin, dp;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        k = Integer.parseInt(input[1]);

        coin = new int[n];
        dp = new int[k + 1];

        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                if (j >= coin[i])
                    dp[j] += dp[j - coin[i]];
            }
        }

        bw.write(dp[k] + "\n");
        bw.flush();
    }

}
