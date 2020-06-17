package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, Exception {
        // test your code here

        File file = new File("week9-week9_23.WordInspection/src/shortList.txt");
        // all words are in file src/wordList.txt
        WordInspection wordInspection = new WordInspection(file);
        System.out.println( wordInspection.wordCount() );
        System.out.println( wordInspection.wordsContainingZ() );
        System.out.println( wordInspection.wordsEndingInL() );
        System.out.println( wordInspection.palindromes() );
        System.out.println( wordInspection.wordsWhichContainAllVowels() );
    }
}
