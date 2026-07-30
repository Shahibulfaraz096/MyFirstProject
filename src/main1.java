public class main1 {
    public static void main(String[] args) {

        Book book1 = new Book("The fellow of rings", 423);
        Book book2 = new Book("The two towers", 423);
        Book book3 = new Book("The return of the king", 423);

        Book[] books = { book1, book2, book3 };

        for (Book book : books) {
            System.out.println(book.displayinfo());
        }

    }
}
