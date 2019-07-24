package string_tokenizer;

/**
 *
 * @author gauris
 *
 */
public class DriverClass {

    public static void main(String[] args) {
        
        System.out.println("process starting..");
        String inputFile = System.getProperty("user.dir")+"/string_tokanizer_input.txt";
        String outputFile = System.getProperty("user.dir")+"/output.txt";
        ProcessorClass.process(inputFile,outputFile);

    }

}
