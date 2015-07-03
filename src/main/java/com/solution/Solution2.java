package com.solution;

/**
 * @author vusenko on 7/3/15.
 */
public class Solution2 {

    public static int find(final String value) {
        int count = 0;

        if (value == null || value.trim().isEmpty()) {
            return count;
        }

        char [] chars = value.toCharArray();
        char [] openedChars = getOpenedParentes(chars);
        char [] closedChars = getClosedParenthes(chars);

        int openChar = 0;

        for (int i = 0; i < chars.length; i ++) {
            if(openedChars [i] == '('){
                openChar++;
            }else if( openChar != 0 && closedChars[i] == ')'){
                count +=2;
            }
        }

        return count;
    }

    private static char [] getOpenedParentes(char[] array){
        char openParenthes = '(';
        char [] chars = new char[array.length];

        for(int i=0;i < array.length;i++){
            if (openParenthes == array[i]){
                chars[i] = openParenthes;
            }
        }
        return chars;
    }

    private static char [] getClosedParenthes (char [] array){
        char closeParenthes = ')';

        char [] chars = new char[array.length];

        for(int i=0;i < array.length;i++){
            if (closeParenthes == array[i]){
                chars[i] = closeParenthes;
            }
        }
        return chars;
    }
}
