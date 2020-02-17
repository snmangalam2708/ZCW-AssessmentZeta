package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {

        int sum = 0;
        for (int i=0; i<intArray.length; i++)
        {
            sum += intArray[i];
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {

        int prod = 1;
        for (int i=0; i<intArray.length; i++)
        {
            prod *= intArray[i];
        }
        return prod;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {

        int avg = 0;
        int i = 0;
        for ( i=0; i<intArray.length; i++)
        {
            avg += intArray[i];
        }
        return Double.valueOf((avg/(i)));
    }
}
