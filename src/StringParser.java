
public class StringParser {
    public static String parsing(String input) throws ParserException {
        input = input.replace(" ", "");
        return verify(input);
    }

    private static String verify(String input) throws ParserException {
        String output;
        String temp;
        int from;
        int to;
        System.out.println(input);
        from = input.indexOf("(");
        to = input.indexOf(")", from);
        temp = input.substring(from + 1, to);
        return stringToComplex(temp).toString();
    }

    private static ComplexNumber stringToComplex(String data) throws ParserException {
        int Re;
        String stringRe;
        int Im;
        String stringIm;
        int split = (data.lastIndexOf("+") > data.lastIndexOf("-")) ? data.lastIndexOf("+") : data.lastIndexOf("-");

        if (data.charAt(data.length() - 1) == 'i') {
            stringIm = data.substring(split, data.length() - 1);
            stringRe = data.substring(0, split);
        } else {
            stringIm = data.substring(0, split - 1);
            stringRe = data.substring(split, data.length());
        }


        Re = Integer.parseInt(stringRe.replace("+",""));
        Im = Integer.parseInt(stringIm.replace("+",""));

        return new ComplexNumber(Re, Im);
    }
}
