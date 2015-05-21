package com.programming.lesson2;

import com.programming.util.StubFactory;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @author acabra
 * @version 2015-05-21
 */
public class CheckingPermutationsTest {
    @Test
    public void solutionTest() {
        assertEquals(true, new CheckingPermutations().solution(StubFactory.getArrayLesson2CheckingPermutations(0)));
        assertEquals(false, new CheckingPermutations().solution(StubFactory.getArrayLesson2CheckingPermutations(1)));
    }
}
