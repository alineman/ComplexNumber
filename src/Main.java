import java.io.*;

public class Main {
    static final String INPUT_FILE = "input.txt";
    static final String OUTPUT_FILE = "output.txt";

    public static void main(String[] args) {
        try {
            BufferedReader inputFile = new BufferedReader(new FileReader(INPUT_FILE));
            BufferedWriter outputFile = new BufferedWriter(new FileWriter(OUTPUT_FILE));
            String data;
            String result;

            while (inputFile.ready()) {
                data = inputFile.readLine();
                try {
                result = StringParser.parsing(data);
                } catch (ParserException e) {
                    result = "can't calculate";
                }
                catch (Exception e) {
                    result = e.getMessage();
                }
                outputFile.write(data + " = " + result + "\n");

            }
            inputFile.close();
            outputFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
