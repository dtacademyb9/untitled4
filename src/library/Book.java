package library;

class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean borrowed;

    public Book(String title, String author, String ISBN, boolean borrowed) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.borrowed = borrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "library.Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", borrowed=" + borrowed + "]";
    }
}