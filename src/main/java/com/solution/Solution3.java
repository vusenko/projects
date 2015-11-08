package com.solution;

import java.util.Stack;

public class Solution3 {

    /**
     * Given a string, find the length of the longest substring without repeating characters.
     * For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.
     * For "bbbbb" the longest substring is "b", with the length of 1.
     */
    public static int lengthOfLongestSubstring(String s) {

        if(s.trim().isEmpty()) return 0;
        if(s.length() == 1) return 1;

        Stack<Character> subChars = new Stack<Character>();

        char [] chars = s.toCharArray();
        int [] indices  = new int[chars.length];

        int index = 0;
        for(int i = 0; i< chars.length;i++){

            if(!subChars.contains(chars[i])){
                subChars.push(chars[i]);

                //case when all unique
                if(i == chars.length-1){
                    return subChars.size();
                }

            }else {
                indices[index] = subChars.size();
                subChars.clear();
                subChars.push(chars[i]);
                ++index;
            }
        }

        return getMax(indices);
    }

    private static int getMax(int [] values){
        int max = 0;
        for(int i = 0 ; i <values.length; i++){
            if(values[i] > max){
                max = values[i];
            }
        }
        return max;
    }
}
