public class LibraryRead {
    public static void main(String[] args) {
        BookDao dao = new BookDao();
        Book book = dao.read(1L);
        System.out.println(book);
        dao.close();
    }
}
