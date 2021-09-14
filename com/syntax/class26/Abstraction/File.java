package com.syntax.class26.Abstraction;

public abstract class File {

    // Task
    /*
    Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile
    that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
     */

    public abstract void open();
    public void edit(){
        System.out.println("Edit file");
    }
    public void close(){
        System.out.println("Close file");
    }
    }

class JavaFile extends File{

    public void open(){
        System.out.println("For Java we need notepad++ or sublime text, to open file");
    }
}
class WordFile extends File{
    public void open(){
        System.out.println("To open .doc file we need Microsoft word to be installed");
    }
}
class PdfFile extends File implements DownloadAble{
    public void open(){
        System.out.println("Use Adobe PDF Reader to open Pdf File");
    }
    public void downloadAble(){
        System.out.println("Download file");
    }
}