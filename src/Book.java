import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Название книги - " + this.title + ", Автор книги - " + this.author + ", год издания - " + this.year;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book title1 = (Book) other;
        return title.equals(title1.title);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
