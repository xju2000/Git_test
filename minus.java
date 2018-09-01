public class Calculator {
    public int minus(int one, int another) {
        return one - another;
    }
}

public class CalculatorTest {
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        int sum = calculator.minus(1, 2);
        Assert.assertEquals(-1, sum);
    }
