import java.time.LocalDate;
import java.util.Objects;

public class LibBook {
    private String nameBook;
    private int yearPublication;
    Author author;

    public LibBook(String nameBook, String yearPublication, Author author) {
        this.setNameBook(nameBook);
        this.setYearPublication(yearPublication);
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }
    public void setNameBook(String name) {
        this.nameBook = name;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(String yearPublication) {
        int i;
        try {
            i = Integer.parseInt(yearPublication);
        } catch (Exception e) {
            throw new IllegalArgumentException("Год публикации введенн не верно.");
        }
        if ((i < 1000 || i >= LocalDate.now().getYear())) {
            System.out.println("В современном мире книги начали издаваться значительно позже - в Европе и Северной Америке в XVI-XVII веках, а в России - в XVIII веке.");
        }
        this.yearPublication = i;
    }

    @Override
    public String toString() {
        return "LibBook{" +
                "nameBook='" + nameBook + '\'' +
                ", yearPublication=" + yearPublication +
                ", author=" + author +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibBook libBook)) return false;
        return getYearPublication() == libBook.getYearPublication() && Objects.equals(getNameBook(), libBook.getNameBook()) && Objects.equals(author, libBook.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameBook(), getYearPublication(), author);
    }
}
