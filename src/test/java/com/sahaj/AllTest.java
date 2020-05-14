package com.sahaj;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class) // https://www.logicbig.com/tutorials/unit-testing/junit/runner.html
@SuiteClasses({
        MyClassTest.class,
        AppTest.class })

public class AllTest {
}
