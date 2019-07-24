/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_tokenizer;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author gauris
 */
public class ProcessorClass {

    public static void execute(String inputFile, String outputFile) {
        String inputData = FileHelper.readFile(inputFile);
        //inputData = Helper.removeQuotes(inputData);
        String[] array = inputData.split(System.lineSeparator());

        process(array, inputData, outputFile);

    }

    public static void process(String[] arr, String inputData, String outputFile) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            List<String> list = Utils.generateKeys(arr[i]);

            for (String key : list) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                } else {
                    int val = map.get(key);
                    map.put(key, val + 1);
                }
            }

        }
        String payload = Utils.generatePayload(map);
        FileHelper.write(outputFile, payload);

        //map.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println("result has been generated successfully in output file...");

    }

    public static void process(String inputFile, String outputFile) {

        execute(inputFile, outputFile);

    }
}
