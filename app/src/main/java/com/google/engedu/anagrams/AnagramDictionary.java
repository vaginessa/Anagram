package com.google.engedu.anagrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import android.util.Log;

public class AnagramDictionary {

    private static final int MIN_NUM_ANAGRAMS = 5;
    private static final int DEFAULT_WORD_LENGTH = 3;
    private static final int MAX_WORD_LENGTH = 7;
    private Random random = new Random();

    public AnagramDictionary(InputStream wordListStream) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(wordListStream));
        String line;
        ArrayList<String> wordList = new ArrayList<String>();
        while((line = in.readLine()) != null) {
            String word = line.trim();
            wordList.add(word);
        }
        Log.d("Anthony", sortLetters(wordList.get(1)));

    }

    public boolean isGoodWord(String word, String base) {
        return true;
    }

    public ArrayList<String> getAnagrams(String targetWord) {
        ArrayList<String> result = new ArrayList<String>();

        return result;
    }

    private static String sortLetters(String word) {
        char[] word_array = word.toCharArray();
        Arrays.sort(word_array);
        return new String(word_array);
    }

    public ArrayList<String> getAnagramsWithOneMoreLetter(String word) {
        ArrayList<String> result = new ArrayList<String>();
        return result;
    }

    public String pickGoodStarterWord() {
        return "badge";
    }
}
