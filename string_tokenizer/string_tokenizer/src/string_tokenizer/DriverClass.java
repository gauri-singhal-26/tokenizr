package string_tokenizer;

/**
 *
 * @author gauris
 *
 */
public class DriverClass {

    public static void main(String[] args) {
        
        String inputFile = "string_tokanizer_input.txt";
        String outputFile = "/Users/gauris/NetBeansProjects/string_tokenizer/output.txt";
        ProcessorClass.process(inputFile,outputFile);

    }

}
