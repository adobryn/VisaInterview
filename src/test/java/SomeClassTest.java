import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Parameter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SomeClassTest {

    private SomeClass testee;

    @BeforeEach
    void setUp() {
        testee = new SomeClass();
    }

    @Test
    void somePositiveTestCase1(){
        String expression = "((()))";
        assertTrue(testee.isBalanced(expression));
    }

    @Test
    void somePositiveTestCase2(){
        String expression = "(())()";
        assertTrue(testee.isBalanced(expression));
    }

    @Test
    void somePositiveTestCase3(){
        String expression = "[()]";
        assertTrue(testee.isBalanced(expression));
    }

    @Test
    void someNegativeTestCase1(){
        String expression = "(()";
        assertFalse(testee.isBalanced(expression));
    }

    @Test
    void someNegativeTestCase2(){
        String expression = "))";
        assertFalse(testee.isBalanced(expression));
    }

    @Test
    void someNegativeTestCase3(){
        String expression = "(()))(";
        assertFalse(testee.isBalanced(expression));
    }

    @Test
    void someNegativeTestCase4(){
        String expression = "[](){)";
        assertFalse(testee.isBalanced(expression));
    }

}