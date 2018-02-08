public class LibraryUpdate {
    public static void main(String[] args) {
        BookDao dao = new BookDao();
        Book book = dao.read(1L);
        book.setTitle("Krzyzacy");
        dao.update(book);
        dao.close();
    }
}
