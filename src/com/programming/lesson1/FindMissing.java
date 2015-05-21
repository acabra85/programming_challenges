package com.programming.lesson1;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author acabra
 * @version 2015-05-21
 */
public class FindMissing {


    /**
     * The array A contains integers in the range [1..(N + 1)], which means that exactly one element is missing
     * Constraints: Complexity in time O(N) and space execution O(1)
     * @param A zero-indexed array A consisting of N different integers
     * @return find the missing element in the sequence
     */
    public int solution(final int[] A) {
        String val1 = (A.length+1)+"";
        BigInteger sum = sumOfNumbers(new BigInteger(val1));
        for(int i=0; i<A.length; i++) {
            sum = sum.subtract(new BigInteger(A[i]+""));
        }
        return sum.intValue();
    }

    private BigInteger sumOfNumbers(final BigInteger n) {
        String val = (1.0*n.intValue()/2)+"";
        BigDecimal half = new BigDecimal(val);
        val = (n.intValue()+1)+"";
        return half.multiply(new BigDecimal(val)).toBigInteger();
    }
}
