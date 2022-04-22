import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main {

    public static boolean isMatchingFirstWord(String word, String sentence){
        String[] splitSentence = sentence.split(" ");
        return splitSentence[0].equalsIgnoreCase(word);
    }

    /**
    For a more advanced word searcher, create a program that returns the number of times
     a word appears in an input string.
     For example, given an input word “new” and an input string “I'm the new newt,” the program should return a value of 2.
     **/

    public static int getCountConcurrentWord(String word, String sentence){
        String[] splitSentence = sentence.split(" ");
        int count = 0;
        for(String str: splitSentence){
            if(str.contains(word)) count++;
        }
        return count;
    }

    @Test
    public void isMatchingFirstWordTest(){
        assertTrue(isMatchingFirstWord("hello", "hello world"));
        assertTrue(isMatchingFirstWord("Hello", "hello world"));
    }

    @Test
    public void getCountConcurrentWordTest(){
        assertEquals(2, getCountConcurrentWord("new", "I'm the new newt,"));
    }
}
