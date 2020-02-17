package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        int r;

        if(k==j) { r = 1; }

        if(k<j) { r = k; }

        else
                { r = (int) Math.ceil((double) k/ (double)j);
                //System.out.println(r);

                }

        return r;
    }
}
