import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start(){

        while (true){
            System.out.println("Statement:");
            System.out.println("  add - adds a word pair to the dictionary");
            System.out.println("  translate - asks a word and prints its translation");
            System.out.println("  quit - quit the text user interface");
            System.out.println("Statement: ");
            String statement = reader.nextLine();

            if ("quit".equals(statement)){
                System.out.println("Cheers!");
                break;
            } else if("add".equals(statement)){
                add();
            } else if("translate".equals(statement)){
                translate();
            } else {
                System.out.println("Unknown Statement");
            }

            System.out.println("");
        }
    }

    private void translate() {
        System.out.print("Give a word: ");
        String from = reader.nextLine();

        String translated = dictionary.translate(from);
        System.out.print("Translation: " + translated);
    }

    private void add() {
        System.out.print("In Finnish: ");
        String from = reader.nextLine();;
        System.out.print("Translation: ");
        String to = reader.nextLine();

        dictionary.add(from, to);
    }
}
