import java.util.Objects;

public class Book {
    String bookName;
    Author authorN;
    int publishingYear;



    public Book(String bookName, Author authorN, int publishingYear) {
        this.bookName = bookName;
        this.authorN = authorN;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthorN() {
        return authorN;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String toString() {
        return "Название книги - " + bookName + "; Автор - " + authorN +  "; Год публикации - " + publishingYear + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName) && authorN.equals(book.authorN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorN);
    }
}

