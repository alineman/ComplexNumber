public class Main {

    public static void main(String[] args) {

        ComplexNumber number = new ComplexNumber(5, 10);
        number.print();
        ComplexNumber number2 = new ComplexNumber(0, 0);
        number2.print();
        number.division(number2);
        number.print();
        number2.subtraction(number);
        number2.print();


    }
}
