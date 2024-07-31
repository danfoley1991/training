package conditionGates;

import java.util.Arrays;

public class Conditions {
    public boolean containsAnyOneOfTheWords(String sentence, String text1, String text2, String text3) {
        return false;
    }

    public boolean containsAllOfTheWords(String sentence, String text1, String text2, String text3) {
        return false;
    }

    public boolean containsAtLeastTwoOfTheWords(String sentence, String text1, String text2, String text3) {
        return false;
    }

    public boolean containsNoneOfTheWords(String sentence, String text1, String text2, String text3) {
        return false;
    }

    public boolean containsAWordFromTheSentence(String sentence, String searchSentenceWords) {
        return false;
    }

    public String concatenateStrings(String word1, String word2) {
        return "";
    }

    public String concatenateStrings(String ...words) {
        return "";
    }

    public String removeStringFromSentence(String sentence, String word) {
        return "";
    }

    public String addWordToBeginningOfSentence(String sentence, String word) {
        return "";
    }

    public String addWordToEndOfSentence(String sentence, String word) {
        return "";
    }

    public String addWordAfterSpecifiedWordInSentence(String sentence, String searchWord, String wordToAdd) {
        return "";
    }

    /**
     * Helper method to aid searching an array for provided word
     *
     * @param words words to search
     * @param search word to search for
     * @return whether the word is found or not
     */
    private boolean checkWords(String[] words, String search) {
        return Arrays.asList(words).contains(search);
    }
}
