public class LibBook {
    private String nameBook;
    Author author;

    public LibBook(String nameBook, Author author) {
        this.setNameBook(nameBook);
        this.author = author;
    }
    public String getNameBook() {
        return nameBook;
    }
    public void setNameBook(String name) {
        this.nameBook = name;
    }

}
