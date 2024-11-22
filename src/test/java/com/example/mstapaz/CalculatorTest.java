package com.example.mstapaz;

import com.example.mstapaz.testfor.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator;



    @Test
    void testMultiply(){
        calculator=new Calculator();
        assertEquals(20, calculator.multiply(4,5));
    }

    @Test
    void testDivide(){
        calculator=new Calculator();
        assertEquals(2, calculator.divide(4,2));
    }


}
