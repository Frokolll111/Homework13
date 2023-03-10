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
    public String toString () {
        return  this.name + " " + this.Surname;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author name1 = (Author) other;
        return name.equals(name1.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
