public class LibraryManager {

    public static void main(String[] args) {

        // Step 1: Set up basic classes and add some books and users
        Library library = new Library();
        library.addBook(new Book("1984", "George Orwell", "12345", false));
        library.addBook(new Book("Moby Dick", "Herman Melville", "12346", false));

        User admin = new Admin("Alice", 1);
        library.registerUser(admin);
        User member = new Member("Bob", 2);
        library.registerUser(member);

        // Step 2: Demonstrate inheritance and polymorphism by borrowing and returning books
        library.borrowBook(2, "12345");
        library.returnBook(2, "12345");

        // Step 3: Generate a report
        Report report = new Report();
        report.generateReport(library.getBooks());

        System.out.println(library.getUsers());
    }
}
