import java.util.ArrayList;
import java.util.List;

class Report {
    public void generateReport(List<Book> books) {
        StringBuilder report = new StringBuilder();
        report.append("Library Report\n");
        report.append("==============\n");

        for (Book book : books) {
            report.append(book.toString()).append("\n");
        }

        System.out.println(report.toString());
    }
}
