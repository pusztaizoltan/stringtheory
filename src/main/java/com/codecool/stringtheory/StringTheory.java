package com.codecool.stringtheory;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringTheory {

    private static boolean isPalindrome(String str){
        String cleanedString = str.toLowerCase().replaceAll("[^A-Za-z]","");
        String reversedString = new StringBuilder(cleanedString).reverse().toString();
        return cleanedString.equals(reversedString);
    }

    private static boolean isIsogram(String str) {
        String cleanedString = str.toLowerCase().replaceAll("[^A-Za-z]","");
        String uniqueChars = ofUniqueCharaters(cleanedString);
        return cleanedString.length() == uniqueChars.length();
    }

    private static boolean isPangram(String str) {
        String alphabet = "qaywsxedcrfvtgbzhnujmikolp";
        String cleanedString = str.toLowerCase().replaceAll("[^A-Za-z]","");
        String uniqueChars = ofUniqueCharaters(cleanedString);
        return alphabet.length() == uniqueChars.length();
    }

    private static boolean isAnagram(String str1, String str2) {
        String[] cleanedCharacters1 = str1.toLowerCase().replaceAll("[^A-Za-z]","").split("");
        String[] cleanedCharacters2 = str2.toLowerCase().replaceAll("[^A-Za-z]","").split("");
        Arrays.sort(cleanedCharacters1);
        Arrays.sort(cleanedCharacters2);
        return Arrays.equals(cleanedCharacters1, cleanedCharacters2);
    }

    private static boolean isBlanagram(String str1, String str2) {
        String cleanedCharacters1 = str1.toLowerCase().replaceAll("[^A-Za-z]","");
        String cleanedCharacters2 = str2.toLowerCase().replaceAll("[^A-Za-z]","");
        String temp1 = cleanedCharacters1;
        String temp2 = cleanedCharacters2;
        for (String i: cleanedCharacters2.split("")) {
            temp1 = temp1.replaceFirst(i, "");
        }
        for (String i: cleanedCharacters1.split("")) {
            temp2 = temp2.replaceFirst(i, "");
        }
        return temp1.length() == 1 && temp2.length() == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Mr. Owl ate my metal worm")); // True
        System.out.println(isPalindrome("Eva, can I see bees in a cave?")); // True
        System.out.println(isIsogram("uncopyrightables")); // True
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog")); // True
        System.out.println(isAnagram("Justin Timberlake", "I'm a jerk but listen")); // True
        System.out.println(isBlanagram("Justin Timberlake", "I'm a berk but listen")); // True
    }
    // support function to reduce string to a continuation of unique characters
    private static String ofUniqueCharaters(String str) {
        String stringOfUniqueChars = str.chars()
                .distinct()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        return stringOfUniqueChars;
    }
}
