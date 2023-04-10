package hw3.task;
// Реализовать алгоритм сортировки слиянием.

import java.util.Arrays;

public class Task1 {
    public static void mergeSort(int[] array){


        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        for (int i = 0; i < mid; i++){
            left[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }
        if (array.length < 2) {
            return;

        } else {
            mergeSort(left);
            mergeSort(right);
        }

        mergeArray(array,left, right);
        System.out.println(Arrays.toString(array));

    }

    public static void mergeArray (int[] resultArray, int[] array1, int[] array2) {

        int array1Ind = 0;
        int array2Ind = 0;
        int resultArrayInd = 0;

        while (array1Ind < array1.length && array2Ind < array2.length) {
            if (array1[array1Ind] <= array2[array2Ind]) {
                resultArray[resultArrayInd] = array1[array1Ind];
                array1Ind++;

            } else {
                resultArray[resultArrayInd] = array2[array2Ind];
                array2Ind++;
            }
            resultArrayInd++;
        }
        while (array1Ind < array1.length) {
            resultArray[resultArrayInd] = array1[array1Ind];
            array1Ind++;
            resultArrayInd++;
        }
        while (array2Ind < array2.length) {
            resultArray[resultArrayInd] = array2[array2Ind];
            array2Ind++;
            resultArrayInd++;
        }

    }

}
