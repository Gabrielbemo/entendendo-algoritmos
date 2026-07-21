package HackerRank.Java.JavaTagContentExtractor;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        String regex = "<([^<>]+)>([^<>]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);

        while (testCases > 0) {
            String line = in.nextLine();

            Matcher matcher = pattern.matcher(line);
            boolean foundContent = false;

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                foundContent = true;
            }

            if (!foundContent) {
                System.out.println("None");
            }

            testCases--;
        }

        in.close();
    }
}

