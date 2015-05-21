package com.programming.util;

/**
 * @author acabra
 * @version 2015-05-21
 */
public class StubFactory {

    public static int[] getArrayLesson1FindMissing(int code){
        switch (code) {
            case 0:
                int A[] = {2,3,1,5};
                return A;
            default:
                int E[] = {1,2,5,6,3,4,8};
                return E;
        }
    }

    public static int[] getArrayLesson1TapeEquilibrium(int code) {
        switch (code) {
            case 0:
                int A[] = {3,1,2,4,3};
                return A;
            default:
                int E[] = {1,2,5,6,3,4,8,2,5};
                return E;
        }
    }
}
