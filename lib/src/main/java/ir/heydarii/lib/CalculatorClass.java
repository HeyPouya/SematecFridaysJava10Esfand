package ir.heydarii.lib;

public class CalculatorClass {

    private float f = 3.14f;

    public int sum(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        return result;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public void calculateCircle(int a) {
        float mohit = a * f;
    }
}
