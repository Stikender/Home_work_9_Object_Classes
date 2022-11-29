public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        System.out.println("author.firstname = " + author.getFirstname());
        System.out.println("author.lastname = " + author.getLastname());

        Book book = new Book("Война и мир", author,  2000);
        System.out.println("book.titleOfTheBook = " + book.getTitleOfTheBook());
        System.out.println("book.yearPublication = " + book.getYearPublication());

        Author author1 = new Author("Николай", "Гоголь");
        System.out.println("author1.firstname = " + author1.getFirstname());
        System.out.println("author1.lastname = " + author1.getLastname());

        Book book1 = new Book("Мертвые души", author1, 1980);
        System.out.println("book1.titleOfTheBook = " + book1.getTitleOfTheBook());
        System.out.println("book1.yearPublication = " + book1.getYearPublication());
        book.setYearPublication(1990);
        System.out.println("book.yearPublication = " + book.getYearPublication());
        book1.setYearPublication(2010);
        System.out.println("book1.yearPublication = " + book1.getYearPublication());

        System.out.println("author = " + author);
        System.out.println("author1 = " + author1);
        System.out.println("book = " + book);
        System.out.println("book1 = " + book1);


    }
}