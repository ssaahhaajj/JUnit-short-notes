package com.sahaj;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class MyClassTest {

        @Test
        public void multiplicationOfZeroIntegersShouldReturnZero() {
            MyClass tester=new MyClass();
            assertEquals(0,tester.multiply(0,10),"0x10 should be 0");
            assertEquals(0,tester.multiply(10,0),"10x0 should be 0");
            assertEquals(0,tester.multiply(0,0),"0x0 should be 0");
            //fail();
        }
}
