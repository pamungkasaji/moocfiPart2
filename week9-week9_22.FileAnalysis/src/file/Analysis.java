
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Analysis {

    private Scanner reader;
    private List<String> lines;

    public Analysis(File file) throws Exception {
        this.reader = new Scanner(file);
        this.lines = new ArrayList<>();

        readFile();
    }

    public void readFile(){
        while (reader.hasNextLine()){
            this.lines.add(reader.nextLine() + "\n");
        }
    }

    public int lines(){
        return lines.size();
    }

    public int characters(){
        int characters = 0;
        for (String line : lines){
            characters += line.length();
        }
        return characters;
    }
}
