public class Author {
    private String authorNameFerst;
    private String authorNameLast;

    public Author(String nameFerst, String nameLast) {
        this.authorNameFerst = nameFerst;
        this.authorNameLast = nameLast;
    }
    public String getAuthorNameFerst() {
        return authorNameFerst;
    }

    public String getAuthorNameLast() {
        return authorNameLast;
    }

    public void setAuthorNameFerst(String authorNameFerst) {
        this.authorNameFerst = authorNameFerst;
    }

    public void setAuthorNameLast(String authorNameLast) {
        this.authorNameLast = authorNameLast;
    }
}
