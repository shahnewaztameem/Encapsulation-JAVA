package com.java.printer;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonarAmount) {
        if(tonarAmount > 0 && tonarAmount <= 100) {
            if(this.tonerLevel + tonarAmount > 100) {
                return -1;
            }
            this.tonerLevel+=tonarAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }
    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.duplex) {
            System.out.println("Printing in duplex mode...");
            pagesToPrint = (pages / 2) + (pages % 2);
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
