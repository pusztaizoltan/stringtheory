package com.codecool.stringtheory;

public class StringTheory {

    private static boolean isPalindrome(String str){
        str1 = str.toLowerCase().replaceAll("[^A-Za-z]",""); // Make all letters lowercase, replace every non-letter characters with nothing
        return true;
    }

    private static boolean isIsogram(String str) {
        return true;
    }

    private static boolean isPangram(String str) {
        return true;
    }

    private static boolean isAnagram(String str1, String str2) {
        return true;
    }

    private static boolean isBlanagram(String str1, String str2) {
        return true;
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
