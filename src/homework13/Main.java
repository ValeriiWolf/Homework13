package homework13;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Lev", "Tolstoiy");
        Book book1 = new Book("War and Peace", author1, 1798);
        Author author2 = new Author("Nikolai", "Gogol");
        Book book2 = new Book("Dead Souls", author2, 1830);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(book2.equals(book1));
        System.out.println(author2.equals(author1));
        boolean booleanAutorHash=author1.hashCode()==author2.hashCode();
        System.out.println(booleanAutorHash);
        boolean booleanBookHash=book1.hashCode()==book2.hashCode();
        System.out.println(booleanBookHash);
    }
}