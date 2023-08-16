public class LibBook {
    private String nameBook;
    private int yearPublication;
    Author author;

    public LibBook(String nameBook, int yearPublication, Author author) {
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

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
