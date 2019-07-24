package string_tokenizer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {
   
    static String getInputFromFile(String filename){
        String inputData= "";
        try{
            FileReader in = new FileReader(filename);
            BufferedReader br = new BufferedReader(in);
            String input;
            while((input = br.readLine())!=null){
                inputData+=input + "\n";
                
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return inputData;
    }
    
    static String removeQuotes(String inputData){
        String pattern = "#.*?\\n";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(inputData);
        inputData = m.replaceAll("");
        return inputData;
    }
}
