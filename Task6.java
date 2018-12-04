package com.skaaria;

import java.util.HashMap;

public class Task6 {
    public static void main(String[] args)
    {
        String string = "asd bsd asd khkk jkgjk eigui asd bsd jkgjk";
        String[] words = string.split("\\s+");
        HashMap<String, Integer> countingWords = new HashMap<>();
        for (String currentWord : words)
        {
            if (!countingWords.containsKey(currentWord))
            {
                countingWords.put(currentWord, 0);
            }
            countingWords.put(currentWord, countingWords.get(currentWord) + 1);
        }
        for (String word : countingWords.keySet())
        {
            System.out.println(word + " " + countingWords.get(word));
        }
    }
}
