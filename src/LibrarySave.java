public class LibrarySave {
    public static void main(String[] args) {
        Book book1 = new Book("Potop", "Henryk Sienkiewicz", 1979, "87665665553");
        BookDao bookDao = new BookDao();
        bookDao.save(book1);
        bookDao.close();
    }
}
