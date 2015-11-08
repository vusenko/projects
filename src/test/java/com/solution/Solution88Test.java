package com.solution;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution88Test {


    @org.junit.Test
    public void validMerge(){
        int indexFullnessOfFirst = 3;
        int [] firstArray = new int[]{1,3,4,0,0,0};

        int indexFullnessOfSecond = 3;
        int [] secondArray = new int []{1,2,5,0,0,0,0,0,0};

        int[] expected = new int[] {1,1,2,3,4,5};

        assertArrayEquals(expected, Solution88.merge(firstArray, indexFullnessOfFirst, secondArray, indexFullnessOfSecond));
    }

    @org.junit.Test
    public void validMergeWithEmptySecondArray(){
        int indexFullnessOfFirst = 3;
        int [] firstArray = new int[]{1,3,4,0,0,0};

        int indexFullnessOfSecond = 0;
        int [] secondArray = new int []{0,0,0,0,0};

        int[] expected = new int[] {1,3,4,0,0,0};

        assertArrayEquals(expected, Solution88.merge(firstArray, indexFullnessOfFirst, secondArray, indexFullnessOfSecond));
    }

    @org.junit.Test
    public void validMergeWithEmptyFirstArray(){
        int indexFullnessOfFirst = 0;
        int [] firstArray = new int[]{0,0,0};

        int indexFullnessOfSecond = 3;
        int [] secondArray = new int []{1,2,5,0,0,0,0,0,0};

        int[] expected = new int[] {1,2,5};

        assertArrayEquals(expected, Solution88.merge(firstArray, indexFullnessOfFirst, secondArray, indexFullnessOfSecond));
    }

    @Test
    public void testCheckMerge(){
        int lengthFirst = 3;
        int [] a1 = new int[]{1,3,4,0,0,0};

        int lengthSecond = 3;
        int [] a2 = new int []{1,2,5,0,0,0,0,0,0};


        assertArrayEquals(Solution88.merge(a1, lengthFirst, a2, lengthSecond),
                Solution88.anotherMerge(a1, lengthFirst, a2, lengthSecond));
    }

}
