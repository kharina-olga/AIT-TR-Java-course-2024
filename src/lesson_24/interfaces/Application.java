package lesson_24.interfaces;

public class Application {
    public static void main(String[] args) {

        Book book = new Book("The Culture Map", "Erin Meyer");
       /* Object objBook = (Object) book;
        System.out.println("ссылка типа object: " + objBook.toString());
*/
        book.print();

         Journal journal = new Journal("Cosmo", 154);
         journal.test();

         Printable.testStatic("Hello");

        System.out.println("***************");


        Printable book1 = new Book("It ends with us", "Collen Hoover");

        book1.print();
    }
}
