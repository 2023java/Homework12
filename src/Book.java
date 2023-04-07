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
}

