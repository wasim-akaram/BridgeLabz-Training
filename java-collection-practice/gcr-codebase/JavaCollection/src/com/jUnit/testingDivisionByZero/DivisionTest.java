package com.jUnit.testingDivisionByZero;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DivisionTest {

    @Test
    void testDivideByZeroThrowsException() {

        DivisionClass  obj = new DivisionClass();

        try 
        {
            obj.divide(10, 0);
            fail("Expected ArithmeticException was not thrown");
        } 
        catch (ArithmeticException e)
        {
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }
}
