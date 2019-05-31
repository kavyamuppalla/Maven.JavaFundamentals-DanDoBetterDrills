package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class PredicateUtilities {
    /**
     * @param x
     * @param y
     * @return true if `x` is greater than `y`
     */
    public Boolean isGreaterThan(int x, int y) {

        boolean a = false;
        if (x > y) {
            a = true;
        }
        return a;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than `y`
     */
    public Boolean isLessThan(int x, int y) {

        boolean b = false;
        if(x < y) {
            b = true;
        }
        return b;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is greater than or equal to `y`
     */
    public Boolean isGreaterThanOrEqualTo(int x, int y) {

        boolean a = false;
        if(x >= y) {
            a = true;
        }


        return a;

    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than or equal to `y`
     */
    public Boolean isLessThanOrEqualTo(int x, int y) {

        boolean b = false;
        System.out.println(x +"" +y);
        if(x <= y) {
            b = true;
        }
        System.out.println(b);
        return b;
    }


    /**
     * @return true
     */
    public Boolean returnTrue() {

        return true;
    }

    /**
     * @return false
     */
    public Boolean returnFalse() {
        return false;
    }

}