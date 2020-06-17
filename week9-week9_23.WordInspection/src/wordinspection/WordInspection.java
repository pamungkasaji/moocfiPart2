
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    private final String vowels = "aeiouyäö";
    private Scanner reader;
    private List<String> lines;

    public WordInspection(File file) throws FileNotFoundException{
        this.lines = new ArrayList<>();
        this.reader = new Scanner(file, "UTF-8");
        readFile();
    }

    private void readFile() {
        while (reader.hasNextLine()){
            this.lines.add(reader.nextLine());
        }
    }

    public int wordCount(){
        return lines.size();
    }

    public List<String> wordsContainingZ(){
        List<String> containsZ = new ArrayList<>();
        for (String line : lines){
            if (line.contains("z")){
                containsZ.add(line);
            }
        }
        return containsZ;
    }

    public List<String> wordsEndingInL(){
        List<String> endsWithL = new ArrayList<>();
        for (String line : lines){
            if (line.endsWith("l")){
                endsWithL.add(line);
            }
        }
        return endsWithL;
    }

    public List<String> palindromes(){
        List<String> palindrom = new ArrayList<>();

        for (String word : lines){
            String reversed = "";
            for (int i=word.length() - 1; i>=0; i--){
                reversed += word.charAt(i);
            }
            if (reversed.equals(word)){
                palindrom.add(word);
            }
        }
        return palindrom;
    }

    public List<String> wordsWhichContainAllVowels(){
        List<String> containVowels = new ArrayList<>();
        for (String line : lines){
            if(containsVowels(line)){
                containVowels.add(line);
            }
        }
        return containVowels;
    }

    private boolean containsVowels(String word){
        for (char vowel : this.stringToCharArray(vowels)){
            if(!word.contains("" + vowel)){
                return false;
            }
        }
        return true;
    }

    // can also use toCharArray() method
    private char[] stringToCharArray (String word) {
        char[] chars = new char[word.length()];
        for (int i=0; i<word.length(); i++){
            chars[i] = word.charAt(i);
        }
        return chars;
    }
}
