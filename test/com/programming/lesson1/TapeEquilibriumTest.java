package com.programming.lesson1;

import com.programming.util.StubFactory;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @author acabra
 * @version 2015-05-21
 */
public class TapeEquilibriumTest {

    @Test
    public void solutionTest() {
        assertEquals(1,  new TapeEquilibrium().solution(StubFactory.getArrayLesson1TapeEquilibrium(0)));
        assertEquals(2,  new TapeEquilibrium().solution(StubFactory.getArrayLesson1TapeEquilibrium(2)));
    }
}
