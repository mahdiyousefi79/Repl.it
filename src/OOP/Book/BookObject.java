package OOP.Book;

public class BookObject {
    public static void main(String[] args) {


        Book book1 = new Book();
        System.out.println(book1);        // Book[author=null, title=null, id=0, pages=0]

       // Shelf.addBook(book1);


        Book book2 = new Book(100, "mAhdi yousEfi", "MaruF The cool", 200);
        Book book3 = new Book(50, "sAmiRa", "the Chronicles OF TrumP", 300);
        Book book4 = new Book(150, "SeliN", "", 200);


        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);

        System.out.println("==================================================================");




        System.out.println(Shelf.isShelfEmpty()); //true


        Shelf.addBook(120,"ShaHriar","sheeR",80);

        Shelf.addBook(book2);
        Shelf.addBook(book3);
        Shelf.addBook(book4);



        System.out.println(Shelf.getTheBooks());




    }

}
