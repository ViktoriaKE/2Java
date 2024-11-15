package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testCorrectExpression() {
        Calculator calc = new Calculator("3 + 4 * 2 / ( 1 - 5 )");
        assertTrue(calc.calculate());
        assertEquals("1.0", calc.toString());
    }

    @Test
    void testIncorrectExpression() {
        Calculator calc = new Calculator("3 + 4 * 2 / ( 1 - 5");
        assertFalse(calc.calculate());
    }

    @Test
    void testEmptyExpression() {
        Calculator calc = new Calculator("");
        assertFalse(calc.calculate());
    }

    @Test
    void testSimpleAddition() {
        Calculator calc = new Calculator("3 + 4");
        assertTrue(calc.calculate());
        assertEquals("7.0", calc.toString());
    }

    @Test
    void testSimpleSubtraction() {
        Calculator calc = new Calculator("5 - 4");
        assertTrue(calc.calculate());
        assertEquals("1.0", calc.toString());
    }

    @Test
    void testSimpleMultiplication() {
        Calculator calc = new Calculator("3 * 4");
        assertTrue(calc.calculate());
        assertEquals("12.0", calc.toString());
    }

    @Test
    void testSimpleDivision() {
        Calculator calc = new Calculator("8 / 2");
        assertTrue(calc.calculate());
        assertEquals("4.0", calc.toString());
    }

    @Test
    void testComplexExpression() {
        Calculator calc = new Calculator("(3 + 4) * 2 - 5 / (1 + 1)");
        assertTrue(calc.calculate());
        assertEquals("11.5", calc.toString());
    }

    @Test
    void testExpressionWithSpaces() {
        Calculator calc = new Calculator(" 3 + 4 ");
        assertTrue(calc.calculate());
        assertEquals("7.0", calc.toString());
    }

    @Test
    void testExpressionWithInvalidCharacters() {
        Calculator calc = new Calculator("3 + 4 * a");
        assertFalse(calc.calculate());
    }
}
