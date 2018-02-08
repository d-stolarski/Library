public class LibraryDelete {
    public static void main(String[] args) {
        BookDao dao = new BookDao();
        dao.delete(1L);
        dao.close();
    }
}
