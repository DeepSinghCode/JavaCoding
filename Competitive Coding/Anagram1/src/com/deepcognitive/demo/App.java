package com.deepcognitive.demo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("hello");

        String s1 = "listen";
        String s2 = "silent";

        int[] intArray = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            intArray[s1.charAt(i)]++;
            // System.out.println(intArray[s1.charAt(i)]);

        }

        for (int j = 0; j < s2.length(); j++) {
            intArray[s2.charAt(j)]--;
        }
        for (int k = 0; k < intArray.length; k++) {
            // if (intArray[k] == 0) {
            // System.out.println(false);
            // } else {
            System.out.println(intArray[k]);
            // }
        }

    }
}
