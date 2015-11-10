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
        String s8= "abba";
        String s9 = "abbaabba";
        String s10 = "ggububgvfk";


        assertEquals(0, Solution3.lengthOfLongestSubstring(s));
        assertEquals(1, Solution3.lengthOfLongestSubstring(s1));
        assertEquals(2, Solution3.lengthOfLongestSubstring(s2));
        assertEquals(5, Solution3.lengthOfLongestSubstring(s3));
        assertEquals(1, Solution3.lengthOfLongestSubstring(s4));
        assertEquals(2, Solution3.lengthOfLongestSubstring(s5));
        assertEquals(2, Solution3.lengthOfLongestSubstring(s6));
        assertEquals(3, Solution3.lengthOfLongestSubstring(s7));
        assertEquals(2, Solution3.lengthOfLongestSubstring(s8));
        assertEquals(2, Solution3.lengthOfLongestSubstring(s9));
        assertEquals(6, Solution3.lengthOfLongestSubstring(s10));


        assertEquals(Solution3.lengthOfLongestSubstring(s),Solution3.lengthOfLongestSubstring2(s));
        assertEquals(Solution3.lengthOfLongestSubstring(s1),Solution3.lengthOfLongestSubstring2(s1));
        assertEquals(Solution3.lengthOfLongestSubstring(s2),Solution3.lengthOfLongestSubstring2(s2));
        assertEquals(Solution3.lengthOfLongestSubstring(s3),Solution3.lengthOfLongestSubstring2(s3));
        assertEquals(Solution3.lengthOfLongestSubstring(s4),Solution3.lengthOfLongestSubstring2(s4));
        assertEquals(Solution3.lengthOfLongestSubstring(s5),Solution3.lengthOfLongestSubstring2(s5));
        assertEquals(Solution3.lengthOfLongestSubstring(s6),Solution3.lengthOfLongestSubstring2(s6));
        assertEquals(Solution3.lengthOfLongestSubstring(s7),Solution3.lengthOfLongestSubstring2(s7));
        assertEquals(Solution3.lengthOfLongestSubstring(s8),Solution3.lengthOfLongestSubstring2(s8));
        assertEquals(Solution3.lengthOfLongestSubstring(s9),Solution3.lengthOfLongestSubstring2(s9));
        assertEquals(Solution3.lengthOfLongestSubstring(s10),Solution3.lengthOfLongestSubstring2(s10));

    }

}
