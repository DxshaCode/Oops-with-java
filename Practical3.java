
interface Printable {
    void print();
}
interface Scannable {
    void scan();
}

class Machine {
    void start() {
        System.out.println("machine is starting");
    }
}
class AllInOnePrinter extends Machine
        implements Printable, Scannable {

    public void print() {
        System.out.println("document is printing");
    }

    public void scan() {
        System.out.println("document is scanned");
    }
}

public class Main {
    public static void main(String[] args) {

        AllInOnePrinter printer = new AllInOnePrinter();
        System.out.println("Hybrid Inheritance Demonstration");
        printer.start();
        printer.print();
        printer.scan();
    }
}

