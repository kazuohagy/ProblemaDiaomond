package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class App {
    public static void main(String[] args) throws Exception {
        // heranca multipla n é permetida
        ConcretePrinter printer = new ConcretePrinter("1234");
        printer.print("Hello, World!");
        printer.print("Hello, World1!");

        ConcreteScanner sc = new ConcreteScanner("2021");
        sc.processDoc("My Email");
        System.out.println("Scan result: " + sc.scan());
        System.out.println();

        ComboDevice cd = new ComboDevice("1234");
        cd.processDoc("My Diploma");
        cd.print("My Diploma");
        System.out.println("Scan result: " + cd.scan());
    }
}
