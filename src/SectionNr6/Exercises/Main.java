package SectionNr6.Exercises;

public class Main {

    public static void main(String[] args) {
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal() + " here should be 2");
        System.out.println("one.imaginary= " + one.getImaginary() + " here should be 2");
        one.subtract(number);
        System.out.println("one.real= " + one.getReal() + " here should be -0.5");
        System.out.println("one.imaginary= " + one.getImaginary() + " here should be 3.5");
        number.subtract(one);
        System.out.println("number.real= " + number.getReal() + " here should be 3.0");
        System.out.println("number.imaginary= " + number.getImaginary() + " here should be -5.0");
    }
}
