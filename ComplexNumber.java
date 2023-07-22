public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    // Конструкторы, геттеры и сеттеры

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(realPart + other.realPart, imaginaryPart + other.imaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newRealPart = realPart * other.realPart - imaginaryPart * other.imaginaryPart;
        double newImaginaryPart = realPart * other.imaginaryPart + imaginaryPart * other.realPart;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = Math.pow(other.realPart, 2) + Math.pow(other.imaginaryPart, 2);
        double newRealPart = (realPart * other.realPart + imaginaryPart * other.imaginaryPart) / denominator;
        double newImaginaryPart = (imaginaryPart * other.realPart - realPart * other.imaginaryPart) / denominator;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    @Override
    public String toString() {
        return realPart + (imaginaryPart >= 0 ? " + " : " - ") + Math.abs(imaginaryPart) + "i";
    }
}
