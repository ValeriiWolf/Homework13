package homework13;

import java.util.Objects;

public class Book {
    private String nameBook;
    private Author nameAuthor;
    private int creatYear;

    public Book(String nameBook, Author nameAuthor, int creatYear) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.creatYear = creatYear;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getNameAuthor() {
        return nameAuthor;
    }

    public int getCreatYear() {
        return creatYear;
    }

    public void setCreatYear(int creatYear) {
        this.creatYear = creatYear;
    }

    @Override
    public String toString() {
        return "Название книги " + this.nameBook + " " + this.nameAuthor + " дата создания книги " + getCreatYear();
    }

   /* @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book2 = (Book) other;
        if (nameBook.equals(book2.nameBook) && nameAuthor.equals(book2.nameAuthor) && creatYear==(book2.creatYear)) {
            return true;
        } else {
            return false;
        }
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return creatYear == book.creatYear && Objects.equals(nameBook, book.nameBook) && Objects.equals(nameAuthor, book.nameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, nameAuthor, creatYear);
    }
}
