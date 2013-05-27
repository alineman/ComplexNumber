/**
 * Created with IntelliJ IDEA.
 * User: isamokhvalov
 * Date: 27.05.13
 * Time: 16:01
 */
public class ComplexNumber {
    private float Re;
    private float Im;

    public ComplexNumber(int re, int im) {
        this.Re = re;
        this.Im = im;
    }

    public ComplexNumber() {
        this.Re = 0;
        this.Im = 0;
    }

    public void add(ComplexNumber in) {
        this.Re = this.Re + in.Re;
        this.Im = this.Im + in.Im;
    }

    public void subtraction(ComplexNumber in) {
        this.Re = this.Re - in.Re;
        this.Im = this.Im - in.Im;
    }

    public void multiply(ComplexNumber in) {
        this.Re = this.Re * in.Re - this.Im * in.Im;
        this.Im = this.Re * in.Im + this.Im * in.Re;
    }

    public void division(ComplexNumber in) {
        this.Re = (this.Re * in.Re + this.Im * in.Im) / (this.Re * this.Re + in.Re * in.Re);
        this.Im = (this.Im * in.Re - this.Re * in.Im) / (this.Re * this.Re + in.Re * in.Re);
    }

    public void print() {
        System.out.println("(" + this.Re + (this.Im > 0 ? " + " : " - ") + Math.abs(this.Im) + "i)");
    }

    public String toString() {
        return "(" + this.Re + (this.Im > 0 ? " + " : " - ") + Math.abs(this.Im) + "i)";
    }
}
