package com.solution;

import java.util.Stack;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.
 * For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class Solution3 {

    /**
     * First solution for this issue via stack
     */
    public static int lengthOfLongestSubstring(String s) {

        if(s.trim().isEmpty()) return 0;
        if(s.length() == 1) return 1;

        Stack<Character> subChars = new Stack<Character>();
        char [] chars = s.toCharArray();

        int index = 0;
        for(int i = 0; i< chars.length;i++){

            if(!subChars.contains(chars[i])){
                subChars.push(chars[i]);

                //case when all unique or last element
                if(i == chars.length-1){
                    return (subChars.size() > index) ? subChars.size() : index;
                }

            } else {
                if(subChars.size() > index) index = subChars.size();
                findAndRemove(subChars,chars[i]);
                subChars.push(chars[i]);
            }
        }

        return index;
    }

    private static void findAndRemove(Stack stack,char element){
        int index = stack.indexOf(element);

        if(index == 0){
            stack.remove(index);
            return;
        }

        for(int i = 0;i<=index;i++){
            stack.remove(0);
        }
    }

    /**
     * Second solution for this issue via arrays
     */
    public static int lengthOfLongestSubstring2(String s) {

        if(s.trim().isEmpty()) return 0;
        if(s.trim().length() == 1) return 1;

        char [] chars = s.toCharArray();
        char [] subChars = new char [chars.length];

        int index = 0;
        int subCharsIndex = 0;
        for(int i = 0 ; i < chars.length;i++){
            if(getIndex(subChars,chars[i],subCharsIndex) == -1){

                subChars[subCharsIndex] = chars [i];
                ++subCharsIndex;

                //case when all unique or last element
                if(i == chars.length - 1){
                    return (subCharsIndex > index) ? subCharsIndex : index;
                }

            } else {
                if(subCharsIndex > index) index = subCharsIndex;
                int indexOfDuplicate = getIndex(subChars,chars[i],subCharsIndex)+1;
                findAndRemove(subChars,indexOfDuplicate,subCharsIndex);
                subCharsIndex = subCharsIndex - indexOfDuplicate;//count
                subChars[subCharsIndex] = chars[i];
                ++subCharsIndex;
            }
        }
        return index;
    }

    private static int findAndRemove (char [] chars,int index,int indexOfFullness){
        if(indexOfFullness == 0){
            indexOfFullness = chars.length;
        }

        for(int i = 0 ;i <index; i++ ){
            for(int j = 0; j < indexOfFullness;j++){
                chars [j] = chars[j+1];
            }
        }
        return index;
    }


    private static int getIndex(char [] chars,char element,int indexOfFullness){
        for(int i = 0; i < indexOfFullness;i++){
            if(chars[i] == element) return i;
        }
        return -1;
    }
}
