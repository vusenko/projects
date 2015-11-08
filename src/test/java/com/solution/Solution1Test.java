package com.solution;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution1Test {

    @Test
    public void test1(){
        int [] array = new int[]{1,3,5,7,9};
        int targetValue = 10;

        int [] expectedArray = new int[]{1,5};

        assertArrayEquals(expectedArray,Solution1.twoSum(array,targetValue));

    }


    @Test
    public void test2(){
        int [] array = new int[]{0,3,0,7,9};
        int targetValue = 0;

        int [] expectedArray = new int[]{1,3};

        assertArrayEquals(expectedArray,Solution1.twoSum(array,targetValue));

    }
}
