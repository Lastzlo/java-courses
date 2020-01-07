package ru.lesson.lessons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
         Calculator calculator = new Calculator();
         calculator.add(1, 1);
         assertEquals(2, calculator.getResult());
    }
}