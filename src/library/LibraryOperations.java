package library;

interface LibraryOperations {
    void borrowBook(Integer userID, String ISBN);
    void returnBook(Integer userID, String ISBN);
}