package week10;

public class Numeric<T extends Number> {
    private T value;

    public Numeric(T value) {
        this.value = value;
    }

    public double reciprocal() {
        return 1.0 / value.doubleValue();
    }

    public double fractionalPart() {
        return value.doubleValue() - value.intValue();
    }

    public boolean absoluteEquals(Numeric<?> other) {
        return Math.abs(value.doubleValue()) == Math.abs(other.value.doubleValue());

    }

    public static void main(String[] args) {
        Numeric<Double> doubleNum = new Numeric<Double>(9.76);
        Numeric<Float> floatNum = new Numeric<Float>(9.76f);

        System.out.println("Reciprocal of Double: " + doubleNum.reciprocal());
        System.out.println("Reciprocal of Float: " + floatNum.reciprocal());

        System.out.println("Fractional part of Double: " + doubleNum.fractionalPart());
        System.out.println("Fractional part of Float: " + floatNum.fractionalPart());

        System.out.println("Absolute equality: " + doubleNum.absoluteEquals(floatNum));

    }

}
