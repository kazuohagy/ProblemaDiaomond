package application;

import devices.Printer;
import devices.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // heranca multipla n é permetida
        Printer printer = new Printer("1234");
        printer.print("Hello, World!");
        printer.print("Hello, World1!");

        Scanner sc = new Scanner("2021");
        sc.processDoc("My Email");
        System.out.println("Scan result: " + sc.scan());
    }
}
