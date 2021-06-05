package day50_inheritance;

public class BookInheritanceTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "intro to java";
        book.author = "Savitch";
        book.type = "Programing";
        book.price = 85.0;
        System.out.println("book = " + book.title);
        System.out.println("book.type = " + book.type);
        System.out.println("book = " + book.author);
        System.out.println("book = " + book.price);

       AudioBook audioBook = new AudioBook();
       audioBook.author = "Jora Cardan";
       audioBook.length = 25;
       audioBook.narrator = "Vera Siliodka";
       audioBook.price = 2500.0;
       audioBook.title = "Kiron in tara minunilor";
       audioBook.type = "Automation";
       audioBook.listen();

       EBook eBook = new EBook();
        eBook.author = "Mila Jovic";

        eBook.price = 25.0;
        eBook.title = "Kironiada";
        eBook.type = "PIPI";
        eBook.size = 333;
        eBook.pages = 3332;
        eBook.readBook();



    }
}
