package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
    public class ArrayUtility <T> {
        private T[] inputArray;

        ArrayUtility(T[] inputArray){
            this.inputArray = inputArray;
        }
        public Integer countDuplicatesInMerge(T [] arrayToMerge, T valueToEvaluate) {
            Integer count = 0;
            T[] newArray = merge(inputArray, arrayToMerge);
            for(int i = 0; i < newArray.length; i++) {
                if(newArray[i] == valueToEvaluate) {
                    count++;
                }
            }
            return count;
        }

    private T[] merge(T[] inputArray, T[] arrayToMerge) {
            return null;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
            Object[] newArray = merge(inputArray, arrayToMerge);
            T mostCommonValue = (T) newArray[0];
            Object temp;
            int count = 1, tempCount;
            int i;
            int j;
            for(i = 0; i < newArray.length -1; i++) {
                temp = newArray[i];
                tempCount = 0;
                for(j = 0; j<newArray.length; j++) {
                    if(temp == newArray[j])
                        tempCount++;
                }
                if (tempCount > count) {
                    mostCommonValue = (T) temp;
                    count = tempCount;
                }
        }
            return mostCommonValue;
        }
        public Integer getNumberOfOccurrences(T valueToEvaluate) {
            Integer count = 0;
            for(int i = 0; i < inputArray.length; i++) {
                if(inputArray[i] == valueToEvaluate) {
                    count++;
                }
            }
            return count;
        }
        public T[] removeValue(T valueToRemove) {
            int index = 0;
            for(int i = 0; i < inputArray.length; i++) {
                if(inputArray[i] != valueToRemove) {
                    inputArray[index] = inputArray[i];
                    index++;
                }
            }
            return Arrays.copyOf(inputArray, index);
        }
}
