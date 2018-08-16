public class Calculator {
    public int add(int one, int another) {
        return one + another;
    }
}

public class CalculatorTest {
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        int sum = calculator.add(1, 2);
        Assert.assertEquals(3, sum);
    }
