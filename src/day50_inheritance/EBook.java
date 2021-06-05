package day50_inheritance;

public class EBook extends Book {
    int size;
    int pages;

    public void readBook(){
        System.out.println("reading book: " + title);
        System.out.println("Author: "+ author);
        System.out.println("Size: "+ size);
        System.out.println("Pages: " + pages);
    }

}
