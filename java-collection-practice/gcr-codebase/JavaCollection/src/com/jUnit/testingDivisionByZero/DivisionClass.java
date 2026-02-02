package com.jUnit.testingDivisionByZero;
public class DivisionClass 
{

    public int divide(int a, int b) 
    {
        if (b == 0) 
        {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
