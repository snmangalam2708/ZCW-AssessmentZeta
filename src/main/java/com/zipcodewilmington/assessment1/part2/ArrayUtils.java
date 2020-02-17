package com.zipcodewilmington.assessment1.part2;




import static java.util.Arrays.*;
import static java.util.Arrays.sort;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        int count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == objectToCount) {
                count++;
            }

        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

        int i, j;
        for (i = j = 0; j < objectArray.length; ++j)
            if (!objectToRemove.equals(objectArray[j]))
                objectArray[i++] = objectArray[j];
        objectArray = copyOf(objectArray, i);

        return objectArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        sort(objectArray);

        int mc = 1, Object[];
        Object res = objectArray[0];
        int cc = 1;

        for (int i = 0; i < objectArray.length - 1; i++) {
            if (objectArray[i + 1] == objectArray[i])
                cc++;
            else {
                if (cc > mc) {
                    mc = cc;
                    res = objectArray[i - 1];
                }
                cc = 1;
            }
        }

        if (cc > mc) {
            mc = cc;
            res = objectArray[objectArray.length - 1];
        }

        return res;

    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

        sort(objectArray);

        int mc = objectArray.length + 1;
        Object res = -1;
        int cc = 1;

        for (int i = 1; i < objectArray.length; i++) {
            if (objectArray[i] == objectArray[i - 1])
                cc++;
            else {
                if (cc < mc) {
                    mc = cc;
                    res = objectArray[i - 1];
                }

                cc = 1;
            }
        }

        if (cc < mc) {
            mc = cc;
            res = objectArray[objectArray.length - 1];
        }

        return res;

    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        return null;
    }
}