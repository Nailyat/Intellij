package com.syntax.class26.Abstraction;

public class FileTester {
    public static void main(String[] args) {
        File [] file={new JavaFile(), new WordFile(), new PdfFile()};
        for(int i=0; i<file.length; i++) {
            file[i].open();
            file[i].edit();
            file[i].close();
        }
    }
}
