package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setCalculator() {
        calculator = new Calculator();
    }

    //tests for addition

    @Test
    public void additionTest1() {
        assertEquals(10, calculator.add(6,4));
    }

    @Test
    public void additionTest2() {
        assertEquals(-9, calculator.add(-4,-5));
    }

    @Test
    public void additionTest3() {
        assertEquals(4, calculator.add(0,4));
    }

    //tests for subtraction

    @Test
    public void substrTest1() {
        assertEquals(9, calculator.subtract(12, 3));
    }

    @Test
    public void substrTest2() {
        assertEquals(16, calculator.subtract(-4,-20));
    }

    @Test
    public void substrTest3() {
        assertEquals(15, calculator.subtract(15,0));
    }

    // tests for multiplication
    @Test
    public void multiplyTest1() {
        assertEquals(33, calculator.multiply(11,3));
    }

    @Test
    public void multiplyTest2() {
        assertEquals(27, calculator.multiply(-9,-3));
    }

    @Test
    public void multiplyTest3() {
        assertEquals(0, calculator.multiply(14,0));
    }

    // tests for division

    @Test
    public void divideTest1() {
        assertEquals(4, calculator.divide(12, 3));
    }

    @Test
    public void divideTest2() {
        assertEquals(0.75, calculator.divide(-3,-4));
    }

    @Test
    public void divideTest3() {
        assertEquals(0, calculator.divide(11, 0));
    }

    // tests for factorial

    @Test
    public void testFactorial1(){
        assertEquals(120, calculator.factorial(5));
    }
    @Test
    public void testFactorial2(){
        assertEquals(3628800, calculator.factorial(10));
    }
    @Test
    public void testFactorial3(){
        assertEquals(0, calculator.factorial(-2));
    }
}
