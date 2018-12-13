package com.skaaria.task5;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> catalog = new HashMap<>();

        catalog.put("videocard", 979);
        catalog.put("cpu", 771);
        catalog.put("motherboard", 1572);
        catalog.put("ram", 2846);
        catalog.put("zero", 0);

        List<Map.Entry<String, Integer>> list = new LinkedList<>(catalog.entrySet());

        Collections.sort(list, new MapComaparator());

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> sort : list) {
            sortedMap.put(sort.getKey(), sort.getValue());
        }
        for (Map.Entry<String, Integer> output: sortedMap.entrySet()){
            System.out.println(output);
        }

        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : catalog.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }
        System.out.println("max entry: "+maxEntry);
    }
}
