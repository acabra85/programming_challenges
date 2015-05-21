package com.programming.testSuites;

/**
 * @author acabra
 * @version 2015-05-21
 */

import com.programming.lesson1.BunnyJmpTest;
import com.programming.lesson1.FindMissingTest;
import com.programming.lesson1.TapeEquilibriumTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BunnyJmpTest.class,
        FindMissingTest.class,
        TapeEquilibriumTest.class
})
public class Lesson1TestSuite {
}
