public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        ComplexCalculator calculator = new ComplexCalculator(logger);

        ComplexNumber a = new ComplexNumber(3, 2);
        ComplexNumber b = new ComplexNumber(1, -1);

        ComplexNumber sum = calculator.add(a, b);
        ComplexNumber product = calculator.multiply(a, b);
        ComplexNumber division = calculator.divide(a, b);
    }
}
