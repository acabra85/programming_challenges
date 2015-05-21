package com.programming.lesson1;

/**
 * @author acabra
 * @version 2015-05-21
 */
public class BunnyJmp {


    /**
     * A small bunny wants to get to the other side of the road by jumping.
     * Constraints: Complexity in time and space O(1)
     * @param X bunny's current location at position
     * @param Y bunny's wanted position
     * @param D distance of fixed jumps
     * @return  the minimal number of jumps from position X to a position equal to or greater than Y.
     */
    public int solution(int X, int Y, int D) {
        if(X > Y)
            return 0;
        int difference = (Y-X);
        int remainder = difference%D;
        int jumps = difference/D;
        return remainder==0? jumps: jumps + 1;
    }
}
