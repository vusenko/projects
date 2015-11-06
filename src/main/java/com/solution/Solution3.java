package com.solution;

public class Solution3 {


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



    public static int [] anotherMerge(int [] array1 , int firstIndex,int [] array2,int secondIndex){
        //if second index is 0 ,just return first array
        if(secondIndex == 0){
            return array1;
        }

        //if first index is 0 ,we need just copy second array to first (cause can checked array length,not fullness)
        if(firstIndex == 0){
            for(int i= 0; i< secondIndex;i++){
                array1[i] = array2[i];
            }

        //we will make one array and then will make sort
        } else {
            for(int i = 0; i < secondIndex; i++){
                array1[firstIndex+i] = array2[i];
            }
            sort(array1,firstIndex+secondIndex);
        }
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

    private static void shiftToRight(int [] array,int indexOfFullness,int index){
        for(int i = indexOfFullness; i > index; i--){
            array[i] = array[i-1];
        }
    }

    private static void printArray(int [] array){
        for(int i =0 ;i<array.length;i++){
            System.out.println("["+i+"]"+" = "+array[i]);
        }
    }
}
