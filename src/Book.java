public class Book {
    String titleOfTheBook;
    Author author;
    int yearPublication;

    public Book (String titleOfTheBook, Author author, int yearPublication) {
        this.titleOfTheBook = titleOfTheBook;
        this.yearPublication = yearPublication;
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
}


