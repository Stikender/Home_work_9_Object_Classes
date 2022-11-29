import java.util.Objects;

public class Author {
    private String firstname;
    private String lastname;
    public Author(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    @Override
    public String toString() {
        return firstname + " " + lastname;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return firstname.equals(c2.firstname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }
}
