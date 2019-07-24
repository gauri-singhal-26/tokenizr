/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_tokenizer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static string_tokenizer.GlobalConstants.*;

/**
 *
 * @author gauris
 */
public class FileHelper {

    public static void write(String outputFile, String data) {

        FileWriter fw = null;
        try {

            fw = new FileWriter(new File(outputFile), false);

            fw.write(data);

            fw.flush();
            fw.close();
        } catch (IOException e) {

        }

    }

    /**
     *
     * @param inputFile
     * @return
     */
    public static String readFile(String inputFile) {
        String inputData = EMPTY;
        try {
            FileReader in = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(in);
            String input;
            while ((input = br.readLine()) != null) {
                inputData += input + "\n";

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return inputData;
    }

}
