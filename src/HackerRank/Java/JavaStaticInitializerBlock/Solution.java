package HackerRank.Java.JavaStaticInitializerBlock;

import java.util.Scanner;

public class Solution {
    public static int breadth = 0;
    public static int height = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        breadth = scanner.nextInt();
        height = scanner.nextInt();

        if(!(breadth <= 0 || height <= 0)){
            int area=breadth*height;
            System.out.print(area);
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
