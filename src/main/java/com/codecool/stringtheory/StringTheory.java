package com.codecool.stringtheory;

import java.util.ArrayList;
import java.util.List;

public class StringTheory {

    private static boolean isPalindrome(String str) {
        String str1 = str.toLowerCase().replaceAll("[^A-Za-z]", ""); // Make all letters lowercase, replace every non-letter characters with nothing
        char[] test = new char[str1.length()];
        int j = 0;
        for (int i = str1.length() - 1; i > -1; i--) {
            test[j] = str1.charAt(i);
            j++;
        }
        String compare = new String(test);
        return str1.equals(compare);
    }

    private static boolean isIsogram(String str) {
        String str1 = str.toLowerCase().replaceAll("[^A-Za-z]", ""); // Make all letters lowercase, replace every non-letter characters with nothing
        char[] test = str1.toCharArray();
        int counter = 0;
        for (char i : test) {
            for (char j : test) {
                if (i == j) {
                    counter++;
                }
            }
        }
        return counter <= test.length;
    }

    private static boolean isPangram(String str) {
        String str1 = str.toLowerCase().replaceAll("[^A-Za-z]", ""); // Make all letters lowercase, replace every non-letter characters with nothing
        List<Character> letter = new ArrayList<Character>();
        int counter = 0;

        for (char i : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            letter.add(i);
        }

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < letter.size(); j++) {
                if (str1.charAt(i) == letter.get(j)) {
                    letter.remove(j);
                    counter++;
                }
            }
        }

        return letter.size() <= 0;
    }

    private static boolean isAnagram(String str1, String str2) {
        String strOne = str1.toLowerCase().replaceAll("[^A-Za-z]", ""); // Make all letters lowercase, replace every non-letter characters with nothing
        String strTwo = str2.toLowerCase().replaceAll("[^A-Za-z]", ""); // Make all letters lowercase, replace every non-letter characters with nothing

        int counter = 0;
        if(!strOne.length() == strTwo.length()){
            for (int i = 0; i < strOne.length();i++){
                for (int j = 0; i < strTwo.length();i++){
                    char tmp = strTwo.charAt(j);
                    if(strOne.indexOf(j))
                }
            }
        }
    }

    private static boolean isBlanagram(String str1, String str2) {
        String strOne = str1.toLowerCase().replaceAll("[^A-Za-z]", ""); // Make all letters lowercase, replace every non-letter characters with nothing
        String strTwo = str2.toLowerCase().replaceAll("[^A-Za-z]", ""); // Make all letters lowercase, replace every non-letter characters with nothing
        char[] strOneCharArray = strOne.toCharArray();
        char[] strTwoCharArray = strTwo.toCharArray();
        int counter = 0;
        List<Character> strOneCheck = new ArrayList<Character>();
        List<Character> strTwoCheck = new ArrayList<Character>();

        for (int i = 0; i < strOneCharArray.length; i++) {
            strOneCheck.add(strOne.charAt(i));
            strTwoCheck.add(strTwo.charAt(i));
        }

        if (strOne.length() != strTwo.length()) {
            return false;
        }

        for (int i = 0; i < strOneCharArray.length; i++) {
            for (int j = 0; j < strTwoCharArray.length; j++) {
                if (strOneCharArray[i] == strTwoCharArray[j]) {
                    strOneCheck.set(j, 'X');
                    strTwoCheck.set(i, 'X');

                }
            }
        }

        for (int i = 0; i < strOneCheck.size(); i++) {
            if (strOneCheck.get(i) != 'X') {
                counter++;
            }
            if (strTwoCheck.get(i) != 'X') {
                counter++;
            }
        }
        return counter == 1 || counter == 2;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("Mr. Owl ate my metal worm")); // True
        System.out.println(isPalindrome("Eva, can I see bees in a cave?")); // True
        System.out.println(isIsogram("uncopyrightables")); // True
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog")); // True
        System.out.println(isAnagram("Justin Timberlake", "I'm a jerk but listen")); // True
        System.out.println(isBlanagram("Justin Timberlake", "I'm a berk but listen")); // True
    }
}
