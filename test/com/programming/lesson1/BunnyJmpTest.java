package com.programming.lesson1;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @author acabra
 * @version 2015-05-21
 */
public class BunnyJmpTest {
    @Test
    public void solutionTest() {
        BunnyJmp bunnyJmp = new BunnyJmp();
        assertEquals(3, bunnyJmp.solution(10, 85, 30));
    }
}
