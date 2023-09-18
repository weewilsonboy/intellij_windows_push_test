package com.codebase;

public class Printer {
    private int sheetsAvailable;
    private int tonerAvailable;

    public Printer(int sheetsAvailable, int tonerAvailable) {
        this.sheetsAvailable = sheetsAvailable;
        this.tonerAvailable = tonerAvailable;
    }

    public int getSheetsAvailable() {
        return sheetsAvailable;
    }

    public int getTonerAvailable() {
        return tonerAvailable;
    }

    public void print(int pages, int copies){
        if ((pages*copies)>sheetsAvailable || (pages*copies)>tonerAvailable){
            System.out.println("Not enough paper/toner to print that");
            return;
        }
        sheetsAvailable -= (pages*copies);
        tonerAvailable -= (pages*copies);
    }
}
