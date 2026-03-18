package HackerRank.Java.Java2DArray;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] parts = bufferedReader.readLine().split(" ");
            for (int j = 0; j < 6; j++) {
                arr[i][j] = Integer.parseInt(parts[j]);
            }
        }

        bufferedReader.close();

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {

                int sum =
                        arr[i][j]     + arr[i][j+1]     + arr[i][j+2] +
                                arr[i+1][j+1] +
                                arr[i+2][j]   + arr[i+2][j+1]   + arr[i+2][j+2];

                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }
}