public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        System.out.println("author.firstname = " + author.firstname);
        System.out.println("author.surname = " + author.surname);

        Book book = new Book("Война и мир", author,  2000);
        System.out.println("book.titleOfTheBook = " + book.titleOfTheBook);
        System.out.println("book.yearPublication = " + book.yearPublication);

        Author author1 = new Author("Николай", "Гоголь");
        System.out.println("author1.firstname = " + author1.firstname);
        System.out.println("author1.surname = " + author1.surname);

        Book book1 = new Book("Мертвые души", author1, 1980);
        System.out.println("book1.titleOfTheBook = " + book1.titleOfTheBook);
        System.out.println("book1.yearPublication = " + book1.yearPublication);
        book.setYearPublication(1990);
        System.out.println("book.yearPublication = " + book.yearPublication);


    }
}