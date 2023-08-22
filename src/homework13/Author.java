package homework13;

import java.util.Objects;

public class Author {
    private String lastNameAuthor;
    private String ferstNameAuthor;

    public Author(String ferstNameAuthor, String lastNameAuthor) {
        this.ferstNameAuthor = ferstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }

    public String getFerstNameAuthor() {
        return this.ferstNameAuthor;
    }

    public String getLastNameAuthor() {
        return this.lastNameAuthor;
    }

    public String toString() {
        return "Имя автора " + this.getFerstNameAuthor() + " Фамилия автора " + this.getLastNameAuthor();
    }
  /*  @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author book2 = (Author) other;
        if (ferstNameAuthor.equals(book2.ferstNameAuthor) && lastNameAuthor.equals(book2.lastNameAuthor)) {
            return true;
        } else {
            return false;
        }
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(lastNameAuthor, author.lastNameAuthor) && Objects.equals(ferstNameAuthor, author.ferstNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastNameAuthor, ferstNameAuthor);
    }
}
