public class LibBook {
    private String nameBook;
    Author author;

    public LibBook(String nameBook, Author author) {
        this.nameBook = nameBook;
        this.author = author;
    }
    public String getNameBook() {
        return nameBook;
    }
    public void setNameBook(String name) {
        this.nameBook = name;
    }

}
