package Trash;

import java.util.HashMap;

public class Check {


    public static void main(String[] args) {
        String inputString = "I work in capgemini technologies";
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        for (char c : inputString.toCharArray()) {

            if (charFrequencyMap.containsKey(c)) {
                charFrequencyMap.put(c, charFrequencyMap.get(c) + 1);
            } else {
                charFrequencyMap.put(c, 1);
            }
        }
        for (char key : charFrequencyMap.keySet()) {
            System.out.println("Character: " + key + ", Frequency: " + charFrequencyMap.get(key));
        }
    }

}
