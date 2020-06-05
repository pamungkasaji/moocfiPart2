
public class Smileys {

    public static void main(String[] args) {

        // Test your method at least with the following
        printWithSmileys("\\:D/");
        printWithSmileys("87.");
        printWithSmileys("Matti");
        printWithSmileys("Mikael");
        printWithSmileys("Arto");
    }

    private static void printWithSmileys(String characterString) {
        int length = characterString.length();
        int ncoleven = length + 1;
        int ncolodd = length + 2;
        String smiley = ":)";

        if (length % 2 == 0) {
            printSmiley(ncoleven);
            //System.out.println("");
            System.out.println(smiley + " " + characterString + " " + smiley);
            printSmiley(ncoleven);
        }

        if (length % 2 == 1) {
            printSmiley(ncolodd);
            //System.out.println("");
            System.out.println(smiley + " " + characterString + "  " + smiley);
            printSmiley(ncolodd);
        }
    }

    private static void printSmiley(int length) {
        for (int i=0; i<length; i++){
            System.out.print(":)");
        }
        System.out.println("");
    }
}
