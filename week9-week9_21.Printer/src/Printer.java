
import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Printer {

    private Scanner reader;
    private List<String> lines;

    public Printer(String fileName) throws Exception {
        reader = new Scanner( new File(fileName) );
        lines = new ArrayList<>();

        while (reader.hasNextLine()){
            lines.add(reader.nextLine());
        }
    }

    public void printLinesWhichContain(String word){
        for (String line : lines){
            if(line.contains(word)){
                System.out.println(line);
            }
        }
    }
}
