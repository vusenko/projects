package com.solution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution3Test {


    @Test
    public void test(){
        String s = "";
        String s1 = "a";
        String s2 = "ab";
        String s3 = "abcabced";
        String s4 = "bbbbbb";
        String s5 = "abbbbb";
        String s6 = "bbbbbc";
        String s7= "abac";


        assertEquals(0, Solution3.lengthOfLongestSubstring(s));
        assertEquals(1, Solution3.lengthOfLongestSubstring(s1));
        assertEquals(2, Solution3.lengthOfLongestSubstring(s2));
        assertEquals(5, Solution3.lengthOfLongestSubstring(s3));
        assertEquals(1, Solution3.lengthOfLongestSubstring(s4));
        assertEquals(2, Solution3.lengthOfLongestSubstring(s5));
        assertEquals(2, Solution3.lengthOfLongestSubstring(s6));
        assertEquals(3, Solution3.lengthOfLongestSubstring(s7));
    }

}
