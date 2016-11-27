package com.missingletters;

class Solution {

    private boolean[] alphabet;

    /**
     * Determines if there are any letters missing in a provided sentence
     * that are required for making it a pangram.

     * @param sentence Sentence to compare against the English alphabet.
     * @return Returns a string containing missing letters if any, in alphabetic order.
     */
    String getMissingLetters(String sentence) {
        this.alphabet = new boolean[26];

        // Mark the letters that are present in the sentence.

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z')) {
                saveLetter(Character.toLowerCase(ch));
            }
        }

        StringBuilder missingLetters = new StringBuilder();

        // Find missing letters.

        for (int j = 0; j < 26 ; j++) {
            if (!this.alphabet[j]) {
                char letter = (char)(j + 'a');
                missingLetters.append(letter);
            }
        }

        // The result is already sorted.

        return missingLetters.toString();
    }

    private void saveLetter(char ch) {
        this.alphabet[ch - 'a'] = true;
    }

    public static void main(String[] args) {
        Solution so = new Solution();
        String sentence = "A quick brown fox jumps over the lazy";
        String result = so.getMissingLetters(sentence);

        System.out.println("Input: sentence=\"" + sentence + "\"");
        System.out.println("Output: " + result);
    }
}