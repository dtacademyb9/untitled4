import java.util.ArrayList;
import java.util.List;

class Library implements LibraryOperations {
   private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    @Override
    public void borrowBook(Integer userID, String ISBN) {
        User user = findUserByID(userID);
        if (user != null) {
            Book bookToBorrow = findBookByISBN(ISBN);
            if (bookToBorrow != null && !bookToBorrow.isBorrowed()) {
                bookToBorrow.setBorrowed(true);
                System.out.println(user.getName() + " borrowed the book: " + bookToBorrow.getTitle());
            } else if (bookToBorrow == null) {
                System.out.println("Book with ISBN " + ISBN + " not found.");
            } else {
                System.out.println("Book with ISBN " + ISBN + " is already borrowed.");
            }
        } else {
            System.out.println("Borrowing operation failed. Either user not found or user is not a member.");
        }
    }

    @Override
    public void returnBook(Integer userID, String ISBN) {
        User user = findUserByID(userID);
        if (user != null ) {
            Book bookToReturn = findBookByISBN(ISBN);
            if (bookToReturn != null && bookToReturn.isBorrowed()) {
                bookToReturn.setBorrowed(false);
                System.out.println(user.getName() + " returned the book: " + bookToReturn.getTitle());
            } else if (bookToReturn == null) {
                System.out.println("Book with ISBN " + ISBN + " not found.");
            } else {
                System.out.println("Book with ISBN " + ISBN + " was not borrowed.");
            }
        } else {
            System.out.println("Returning operation failed. Either user not found or user is not a member.");
        }
    }

    private Book findBookByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }

    private User findUserByID(Integer userID) {
        for (User user : users) {
            if (user.getUserID().equals(userID)) {
                return user;
            }
        }
        return null;
    }
}