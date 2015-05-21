package com.programming.lesson1;

/**
 * @author acabra
 * @version 2015-05-21
 */
public class BunnyJmp {


    /**
     * A small bunny wants to get to the other side of the road by jumping.
     * Constraints: Complexity in time and space O(1)
     * @param ini bunny's current location at position
     * @param ending bunny's wanted position
     * @param jumpSize distance of fixed jumps
     * @return  the minimal number of jumps from position ini to a position equal to or greater than ending.
     */
    public int solution(int ini, int ending, int jumpSize) {
        if(ini > ending)
            return 0;
        int difference = (ending-ini);
        int remainder = difference%jumpSize;
        int jumps = difference/jumpSize;
        return remainder==0? jumps: jumps + 1;
    }
}
