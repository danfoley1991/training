package conditionGates;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import students.services.StudentServices;

class ConditionsTest {

    private Conditions conditions;

    @BeforeEach
    void setup() {
        conditions = new Conditions();
    }

    @Test
    void shouldReturnTrueWhenSentenceContainsOneOfTheWords() {
        // Given a sentence
        String sentence = "this is a sentence with a lot of words in it";

        // When the method is called
        boolean result = conditions.containsAnyOneOfTheWords(sentence, "words", "nope", "hello");

        // Then result should be true
        assertTrue(result);
    }

    @Test
    void containsAllOfTheWords() {
        // Given a sentence
        String sentence = "this is a sentence with a lot of words in it";

        // When the method is called
        boolean result = conditions.containsAllOfTheWords(sentence, "words", "in", "it");

        // Then result should be true
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenSentenceContainsNoneOfTheWords() {
        // Given a sentence
        String sentence = "this is a sentence with a lot of words in it";

        // When the method is called
        boolean result = conditions.containsAnyOneOfTheWords(sentence, "sent", "nope", "hello");

        // Then result should be false
        assertFalse(result);
    }

    @Test
    void doesNotContainAllOfTheWordsPart1() {
        // Given a sentence
        String sentence = "this is a sentence with a lot of words in it";

        // When the method is called
        boolean result = conditions.containsAllOfTheWords(sentence, "words", "missing", "it");

        // Then result should be false
        assertFalse(result);
    }

    @Test
    void doesNotContainAllOfTheWordsPart2() {
        // Given a sentence
        String sentence = "this is a sentence with a lot of words in it";

        // When the method is called
        boolean result = conditions.containsAllOfTheWords(sentence, "words", "i", "it");

        // Then result should be false
        assertFalse(result);
    }

    @Test
    void containsAtLeastTwoOfTheWords() {
        // Given a sentence
        String sentence = "this is a sentence with a lot of words in it";

        // When the method is called
        boolean result = conditions.containsAtLeastTwoOfTheWords(sentence, "words", "lot", "not-found");

        // Then result should be true
        assertTrue(result);
    }

    @Test
    void onlyContainsOneWordWhenItNeedsToBeAtLeastTwoOfTheWords() {
        // Given a sentence
        String sentence = "this is a sentence with a lot of words in it";

        // When the method is called
        boolean result = conditions.containsAtLeastTwoOfTheWords(sentence, "words", "notfound", "notfound");

        // Then result should be false
        assertFalse(result);
    }

    @Test
    void containsNoneOfTheWordsPart1() {
        // Given a sentence
        String sentence = "this is a sentence with a lot of words in it";

        // When the method is called
        boolean result = conditions.containsNoneOfTheWords(sentence, "words", "lot", "it");

        // Then result should be false
        assertFalse(result);
    }

    @Test
    void containsNoneOfTheWordsPart2() {
        // Given a sentence
        String sentence = "this is a sentence with a lot of words in it";

        // When the method is called
        boolean result = conditions.containsNoneOfTheWords(sentence, "words", "lot", "notfound");

        // Then result should be false
        assertFalse(result);
    }

    @Test
    void containsNoneOfTheWordsPart3() {
        // Given a sentence
        String sentence = "this is a sentence with a lot of words in it";

        // When the method is called
        boolean result = conditions.containsNoneOfTheWords(sentence, "words", "notfound", "notfound");

        // Then result should be false
        assertFalse(result);
    }

    @Test
    void containsNoneOfTheWordsPart4() {
        // Given a sentence
        String sentence = "this is a sentence with a lot of words in it";

        // When the method is called
        boolean result = conditions.containsNoneOfTheWords(sentence, "notfound", "notfound", "notfound");

        // Then result should be true
        assertTrue(result);
    }

    @Test
    void containsAWordFromTheSentencePart1() {
        // Given a sentence
        String sentence = "this is a sentence with a lot of words in it";

        // And a sentence to search for words from
        String anotherSentence = "this is another sentence";

        // When the method is called
        boolean result = conditions.containsAWordFromTheSentence(sentence, anotherSentence);

        // Then result should be true
        assertTrue(result);
    }

    @Test
    void containsAWordFromTheSentencePart2() {
        // Given a sentence
        String sentence = "this is a sentence with a lot of words in it";

        // And a sentence to search for words from
        String anotherSentence = "not here";

        // When the method is called
        boolean result = conditions.containsAWordFromTheSentence(sentence, anotherSentence);

        // Then result should be false
        assertFalse(result);
    }

    @Test
    void concatenateStrings() {
        // Given a word
        String word1 = "james";

        // And another word
        String word2 = "stone";

        // When the method is called
        String result = conditions.concatenateStrings(word1, word2);

        // Then result should be expected
        assertEquals("jamesstone", result);
    }

    @Test
    void testConcatenateStrings() {
        // Given a word
        String word1 = "james";

        // And a space
        String space = "-";

        // And another word
        String word2 = "stone";

        // When the method is called
        String result = conditions.concatenateStrings(word1, space, word2);

        // Then result should be expected
        assertEquals("james-stone", result);
    }

    @Test
    void removeStringFromSentence() {
        // Given a sentence
        String sentence = "this is a sentence with a lot of words in it";

        // And a word to remove
        String word = "sentence";

        // When the method is called
        String result = conditions.removeStringFromSentence(sentence, word);

        // Then result should be expected
        assertEquals("this is a  with a lot of words in it", result);
    }

    @Test
    void addWordToBeginningOfSentence() {
        // Given a sentence
        String sentence = "this is a sentence with a lot of words in it";

        // And a word to add to beginning
        String word = "Output: ";

        // When the method is called
        String result = conditions.addWordToBeginningOfSentence(sentence, word);

        // Then result should be expected
        assertEquals("Output: this is a sentence with a lot of words in it", result);
    }

    @Test
    void addWordToEndOfSentence() {
        // Given a sentence
        String sentence = "this is a sentence with a lot of words in it";

        // And a word to add to end of sentence
        String word = " - FINAL";

        // When the method is called
        String result = conditions.addWordToEndOfSentence(sentence, word);

        // Then result should be expected
        assertEquals("this is a sentence with a lot of words in it - FINAL", result);
    }

    @Test
    void addWordAfterSpecifiedWordInSentence() {
        // Given a sentence
        String sentence = "this is a sentence with a lot of words in it";

        // Word to look for to add the following word to
        String searchWord = "is";

        // And a word to add after word above
        String wordToAdd = "not";

        // When the method is called
        String result = conditions.addWordAfterSpecifiedWordInSentence(sentence, searchWord, wordToAdd);

        // Then result should be expected
        assertTrue(List.of(
            "this is not a sentence with a lot of words in it",
            "this isnot a sentence with a lot of words in it",
            "this is nota sentence with a lot of words in it",
            "this isnota sentence with a lot of words in it",
            "thisisnotasentencewithalotofwordsinit"
        ).contains(result));
    }
}