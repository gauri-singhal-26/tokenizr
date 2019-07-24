/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_tokenizer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author gauris
 */
public class Utils {
    
    /**
     * 
     * @param key
     * @return thanks
     */
    public static List<String> generateKeys(String key) {

        List<String> generatedKeys = new ArrayList<>();
        String splitedKeys[] = key.split(">");
        int i = 0;
        String tmp = splitedKeys[0].trim();
        generatedKeys.add(tmp);
        for (int j = 1; j < splitedKeys.length; j++) {
            tmp = tmp + ">" + splitedKeys[j].trim();
            tmp = tmp.trim();
            generatedKeys.add(tmp);

        }

        return generatedKeys;

    }
    
    
    public static String generatePayload(Map<String,Integer> map){
     StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, Integer> eSet : map.entrySet()) {
            builder.append(eSet.getKey().replace(">", " > "))
                    .append(" : ")
                    .append(eSet.getValue())
                    .append("\n");

        }
        
        return builder.toString();
    }
    
}
