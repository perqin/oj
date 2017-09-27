package com.perqin.lintcode.longestwords;

import java.util.ArrayList;

public class Solution {
    /**
     * @param dictionary: an array of strings
     * @return an arraylist of strings
     */
    ArrayList<String> longestWords(String[] dictionary) {
        final ArrayList<String> results = new ArrayList<>();
        int longestLength = 0;
        for (String word : dictionary) {
            if (word.length() > longestLength) {
                longestLength = word.length();
                results.clear();
                results.add(word);
            } else if (word.length() == longestLength) {
                results.add(word);
            }
        }
        return results;
    }
}
