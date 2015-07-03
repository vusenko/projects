package com.solution;

/**
 * @author vusenko on 7/2/15.
 */
public class Solution {

    public static int find(final String value) {
        int counter = 0;

        if (value == null || value.trim().isEmpty()) {
            return counter;
        }

        int openChar = 0;
        int anotherChar = 0;

        char openParenthes = '(';
        char closeParenthes = ')';
        char[] chars = value.toCharArray();

        int anotherCounter = 0;
        int finalCount = 0;

        for (int i = 0; i < chars.length; i ++) {

            if (openParenthes == chars[i]) {
                openChar++;
                for (int j = i + 1; j < chars.length; j++) {

                    //this part work (without changes)
                    if (openChar != 0 && closeParenthes == chars[j]) {
                        openChar = 0;

                        chars [i] = '0';
                        chars [j] = chars [i];

                        counter +=2;
                        break;
                    }else {
                        openChar = 0;
                        anotherChar++;
                        break;
                    }

//                    finalCount = getLongest(counter,anotherCounter);
                }
            }
        }
        return counter;
    }

    private static int getLongest(int a ,int b){
        if(a < b) return b;
        return a;
    }
}
