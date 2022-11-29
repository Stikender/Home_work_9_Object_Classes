import java.util.Objects;

public class Book {
    private final String titleOfTheBook;
    Author author = new Author("Лев", "Толстой"); //Указать в объекте переменные с класса Author не удается т.к. они private, поэтому сразу присвоила переменные.
    public int yearPublication;
    public Book (String titleOfTheBook, Author author, int yearPublication) {
        this.titleOfTheBook = titleOfTheBook;
        this.yearPublication = yearPublication;
        this.author = author;
    }

    public String getTitleOfTheBook() {
        return titleOfTheBook;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {

        return titleOfTheBook + " " + author + " " + yearPublication;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return titleOfTheBook.equals(c2.titleOfTheBook);
    }
    @Override
    public int hashCode() {
        return Objects.hash(titleOfTheBook);
    }
}


