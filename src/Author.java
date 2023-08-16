import java.util.Objects;

public class Author {
    public static final boolean FIO_RIGHT = false;
    public static final boolean FIO_LEFT = true;
    private String authorName; // name - для имени
    private String authorNameLast; // lastName - для фамилии
    private String authorNameMidle; // middleName - для отчества
    public Author(String name, String nameLast, String nameMidle) {
        this.setAuthorName(name);
        this.setAuthorNameLast(nameLast);
        this.setAuthorNameMidle(nameMidle);
    }
    private String upCharName(String Name) {
        char firstChar = Name.charAt(0); // получаем первый символ
        char upperFirstChar = Character.toUpperCase(firstChar); // преобразуем его в нижний регистр
        return upperFirstChar + Name.substring(1);
    }

    public String getAuthorName() { return authorName; }
    public String getAuthorNameLast() {
        return authorNameLast;
    }
    public String getAuthorNameMidle() {
        return authorNameMidle;
    }
    public String getAuthorFIO(boolean flag) {
        if (flag) { return authorName.charAt(0) + ". " + authorNameMidle.charAt(0) + ". " + authorNameLast;
        } else return authorNameLast + " " + authorName.charAt(0) + ". " + authorNameMidle.charAt(0) + ".";
    }

    public void setAuthorName(String authorName) {
        this.authorName = upCharName(authorName);
    }
    public void setAuthorNameLast(String authorNameLast) {
        this.authorNameLast = upCharName(authorNameLast);
    }
    public void setAuthorNameMidle(String authorNameMidle) {
        this.authorNameMidle = upCharName(authorNameMidle);
    }
    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorNameLast='" + authorNameLast + '\'' +
                ", authorNameMidle='" + authorNameMidle + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;
        return Objects.equals(getAuthorName(), author.getAuthorName()) &&
                Objects.equals(getAuthorNameLast(), author.getAuthorNameLast()) &&
                Objects.equals(getAuthorNameMidle(), author.getAuthorNameMidle());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getAuthorName(), getAuthorNameLast(), getAuthorNameMidle());
    }
}





