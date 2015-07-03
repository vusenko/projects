package com.solution;

import java.util.Stack;

/**
 * @author vusenko on 7/2/15.
 */
public class Reference {
    public static int find(final String s){
        if(s.length() == 0 )
            return 0;
        return Math.max(findLongest(s, 0, s.length()-1, 1, '('),
                findLongest(s, s.length()-1, -1,-1, ')'));
    }

    private static int findLongest(String s, int start, int end, int step, char ch) {
        Stack<String> stack  = new Stack<String>();
        int longest = 0;
        int length = 0;
        String chToAdd = String.valueOf(ch);
        for(int i = start; i != end; i+=step){
            if(s.charAt(i) == ch){
                stack.add(chToAdd);
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                    length+=2;
                    if(stack.isEmpty()) longest = Math.max(longest, length);
                }else{
                    length = 0; // -1 case
                }
            }
        }
        return longest;
    }
}
