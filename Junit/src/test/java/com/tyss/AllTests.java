package com.tyss;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BooleanOperationTest.class, MathOperationTest.class, MathStringTests.class,
		StringOperationmultivalues.class, StringOperationTest.class })

public class AllTests {

}
