package HackerRank.Java.JavaSubarray;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner  scan = new Scanner(System.in);
        int n =  Integer.parseInt(scan.nextLine());
        int [] elements =  new int [n];
        for(int i = 0; i < n; i++) {
            elements[i] = scan.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            int runningSum = 0;
            for(int j = i; j < n; j++) {
                runningSum += elements[j];

                if(runningSum < 0) {
                    count ++;
                }
            }
        }
        System.out.println(count);

        scan.close();
    }
}