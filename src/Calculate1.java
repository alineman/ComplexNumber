import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: isamokhvalov
 * Date: 28.05.13
 * Time: 19:42
 * To change this template use File | Settings | File Templates.
 */
public class Calculate1 {
    public static ComplexNumber calculate(ArrayList<ComplexNumber> data){
        int i = 1;
        ComplexNumber result = data.get(0);
        ComplexNumber temp;
        while (i < data.size()){
            temp = data.get(i);
            while (data.get(i).getOperation() == '*' || data.get(i).getOperation() == '/'){
                temp = ComplexNumber.solve(temp, data.get(++i));
            }
            result = ComplexNumber.solve(result,temp);
            i++;
        }
        return result;
    }
}
