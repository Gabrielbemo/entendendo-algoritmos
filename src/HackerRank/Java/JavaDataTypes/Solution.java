package HackerRank.Java.JavaDataTypes;

import java.util.*;
import java.io.*;


class Solution {
    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String longOutPutFitted = "";
            String intOutPutFitted = "";
            String shortOutPutFitted = "";
            String byteOutPutFitted = "";
            String value = "";
            try {
                String recivedValue = sc.next();
                value = recivedValue;
                Long longValuesConverted = Long.parseLong(recivedValue);
                longOutPutFitted = "* long";
                Integer intValuesConverted = Integer.parseInt(recivedValue);
                intOutPutFitted = "* int";
                Short shortValuesConverted = Short.parseShort(recivedValue);
                shortOutPutFitted = "* short";
                Byte byteValuesConverted = Byte.parseByte(recivedValue);
                byteOutPutFitted = "* byte";
            } catch (Exception e) {

            }
            if (longOutPutFitted.isEmpty() && intOutPutFitted.isEmpty() && shortOutPutFitted.isEmpty() && byteOutPutFitted.isEmpty()) {
                System.out.println(value + " can't be fitted anywhere.");
            } else {
                System.out.println(value + " can be fitted in:");
                if (!byteOutPutFitted.isEmpty()) System.out.println(byteOutPutFitted);
                if (!shortOutPutFitted.isEmpty()) System.out.println(shortOutPutFitted);
                if (!intOutPutFitted.isEmpty()) System.out.println(intOutPutFitted);
                if (!longOutPutFitted.isEmpty()) System.out.println(longOutPutFitted);
            }
        }
    }
}
