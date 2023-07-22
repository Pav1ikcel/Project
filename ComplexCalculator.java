public class ComplexCalculator {
    private Logger logger;

    public ComplexCalculator(Logger logger) {
        this.logger = logger;
    }

    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.add(b);
        logger.log("Addition: " + a + " + " + b + " = " + result);
        return result;
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.multiply(b);
        logger.log("Multiplication: " + a + " * " + b + " = " + result);
        return result;
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        if (b.getRealPart() == 0 && b.getImaginaryPart() == 0) {
            logger.log("Division by zero is not allowed.");
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        ComplexNumber result = a.divide(b);
        logger.log("Division: " + a + " / " + b + " = " + result);
        return result;
    }
}
