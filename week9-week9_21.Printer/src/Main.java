
public class Main {

    public static void main(String[] args) throws Exception {
        Printer printer = new Printer("week9-week9_21.Printer/src/kalevala.txt");

        printer.printLinesWhichContain("tuli");
        System.out.println("-----");
        printer.printLinesWhichContain("on");
        System.out.println("-----");
    }
}
