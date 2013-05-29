/**
 * Created with IntelliJ IDEA.
 * User: isamokhvalov
 * Date: 27.05.13
 * Time: 16:01
 */
public class ComplexNumber {                //TODO: Сделать обработку деления на 0
    private float Re;
    private float Im;

    public ComplexNumber(float re, float im) {
        Re = re;
        Im = im;
    }

    private char operation;


    public float getIm() {
        return Im;
    }

    public float getRe() {

        return Re;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public char getOperation() {
        return operation;
    }

    public ComplexNumber(int re, int im) {
        this.Re = (float) re;
        this.Im = (float) im;
    }

    public ComplexNumber() {
        this.Re = 0;
        this.Im = 0;
    }

    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(
                a.Re + b.Re,
                b.Im + b.Im);
    }

    public static ComplexNumber subtraction(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(
                a.Re - b.Re,
                a.Im - b.Im);
    }

    public static ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(
                a.Re * b.Re - a.Im * b.Im,
                a.Re * b.Im + a.Im * b.Re);
    }

    public static ComplexNumber division(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(
                (a.Re * b.Re + a.Im * b.Im) / (a.Re * b.Re + b.Re * b.Re),
                (a.Im * b.Re - a.Re * b.Im) / (a.Re * a.Re + b.Re * b.Re));
    }

    public void print() {
        System.out.printf("(%s%s%si)%n", this.Re, this.Im > 0 ? " + " : " - ", Math.abs(this.Im));
    }

    public String toString() {
        return "(" + this.Re + (this.Im > 0 ? " + " : " - ") + Math.abs(this.Im) + "i)";
    }

    public static ComplexNumber solve(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result;
        switch (a.getOperation()) {
            case '+':
                result = add(a, b);
                break;
            case '-':
                result = subtraction(a, b);
                break;
            case '*':
                result = multiply(a, b);
                break;
            case '/':
                result = division(a, b);
                break;
            default:
                result = null;
                break;
        }
        if (result != null) {
            result.setOperation(b.getOperation());
        }
        return result;
    }
}
