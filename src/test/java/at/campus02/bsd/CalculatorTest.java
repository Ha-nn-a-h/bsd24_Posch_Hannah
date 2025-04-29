package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setCalculator() {
        calculator = new Calculator();
    }

    //tests for addition

    @Test
    public void additionTest1() {
        calculator.add(6, 4);
    }

    @Test
    public void additionTest2() {
        calculator.add(-5, -4);
    }

    @Test
    public void additionTest3() {
        calculator.add(0, 4);
    }

    //tests for subtraction

    @Test
    public void substrTest1() {
        calculator.subtract(12, 3);
    }

    @Test
    public void substrTest2() {
        calculator.subtract(-4, -20);
    }

    @Test
    public void substrTest3() {
        calculator.subtract(15, 0);
    }

    // tests for multiplication
    @Test
    public void multiplyTest1() {
        calculator.subtract(11, 3);
    }

    @Test
    public void multiplyTest2() {
        calculator.subtract(-9, -3);
    }

    @Test
    public void multiplyTest3() {
        calculator.subtract(14, 0);
    }

    // tests for division

    @Test
    public void divideTest1() {
        calculator.subtract(11, 3);
    }

    @Test
    public void divideTest2() {
        calculator.subtract(-3, -4);
    }

    @Test
    public void divideTest3() {
        calculator.subtract(11, 0);
    }
}
