package com.programming.lesson1;

import com.programming.util.StubFactory;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @author acabra
 * @version 2015-05-21
 */
public class FindMissingTest {

    @Test
    public void solutionTest() {
        final FindMissing findMissing = new FindMissing();
        assertEquals(4, findMissing.solution(StubFactory.getArrayLesson1FindMissing(0)));
        assertEquals(7, findMissing.solution(StubFactory.getArrayLesson1FindMissing(2)));
    }
}
