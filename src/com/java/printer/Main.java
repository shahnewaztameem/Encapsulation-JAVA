package com.java.printer;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("Initial page count: " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Printed pages was " + pagesPrinted + " new total print count for printer " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(5);
        System.out.println("Printed pages was " + pagesPrinted + " new total print count for printer " + printer.getPagesPrinted());
//        printer.addToner(20);
       // System.out.println("Getting tonar level: " + printer.getTonerLevel());
    }
}
