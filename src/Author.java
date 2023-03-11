import java.util.Objects;

public class Author {
    private final String name;
    private final String Surname;

    public Author(String name, String surname){
        this.name = name;
        this.Surname = surname;
    }

    public String getName (){
        return name;
    }

    public String getSurname () {
        return Surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && Surname.equals(author.Surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Surname);
    }

    @Override
    public String toString () {
        return  this.name + " " + this.Surname;
    }
}
