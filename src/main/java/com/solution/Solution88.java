package com.solution;

public class Solution88 {

    public static int [] merge(int [] array1 , int firstIndex,int [] array2,int secondIndex){
        //if second index is 0 ,just return first array
        if(secondIndex == 0){
            return array1;
        }

        //if first index is 0 ,we need copy second array to first (cause can checked array length,not fullness)
        if(firstIndex == 0){
            for(int i= 0;i<secondIndex;i++){
                array1[i] = array2[i];
            }

        //we made merge of both
        } else {
            for(int i = 0; i< secondIndex;i++){

                for(int j = 0;j<firstIndex; j++){

                    if(array2[i] <= array1[j]){
                        shiftToRight(array1,firstIndex,j);
                        array1[j] = array2[i];
                        break;
                    }else if (j==0){
                        ++firstIndex;
                        array1[firstIndex] = array2[i];
                    }
                }
            }
        }
        return array1;
    }

    private static void shiftToRight(int [] array,int indexOfFullness,int index){
        for(int i = indexOfFullness; i > index; i--){
            array[i] = array[i-1];
        }
    }


    /**
     * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
     * Note:You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
     * The number of elements initialized in nums1 and nums2 are m and n respectively.
     */
    public static int [] anotherMerge(int [] array1 , int firstIndex,int [] array2,int secondIndex){
        for(int i = 0; i < secondIndex; i++){
            array1[firstIndex+i] = array2[i];
        }

        sort(array1,firstIndex+secondIndex);

        return array1;
    }


    private static void sort(int [] array,int index){
        int temp ;
        for(int i = 0; i<index; i++){

            for(int k = i; k<index; k++){

                if(array[k] < array[i]){
                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
    }
}
