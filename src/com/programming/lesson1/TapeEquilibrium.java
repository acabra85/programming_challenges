package com.programming.lesson1;

/**
 * @author acabra
 * @version 2015-05-21
 */
public class TapeEquilibrium {

    /**
     * Find the minimum absolute distance between the sum of all the elements of the array on one side and the other
     * splitted at a fixed point P     *
     * Constraints: Complexity in time and space O(N)
     * @param input non-empty zero-indexed array input consisting of N integers is given. Array input represents numbers on a tape.
     * @return the minimum distance
     */
    public int solution(int[] input) {
        long[] sums = new long[input.length];
        for (int i = 0; i < input.length; i++) {
            if (i == 0) sums[i] = input[i];
            else sums[i] = sums[i - 1] + input[i];
        }
        long min = Long.MAX_VALUE;
        int size = sums.length - 1;
        long abs = 0;
        for (int i = 0; i < size; i++) {
            abs = Math.abs(sums[i] - (sums[size]-sums[i]));
            if (abs < min) {
                min = abs;
            }
        }
        return Integer.parseInt(min+"");
    }
}
