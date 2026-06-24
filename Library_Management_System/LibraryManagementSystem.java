
import java.util.Arrays;
import java.util.Comparator;

class Book {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
}

public class LibraryManagementSystem {

    private Book[] books = new Book[100];
    private int count = 0;

    public void addBook(int id, String title, String author) {
        books[count++] = new Book(id, title, author);
    }

    public void linearSearch(String title) {

        for (int i = 0; i < count; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                System.out.println("Book Found");
                System.out.println("ID : " + books[i].bookId);
                System.out.println("Title : " + books[i].title);
                System.out.println("Author : " + books[i].author);
                return;
            }
        }

        System.out.println("Book Not Found");
    }

    public void binarySearch(String title) {

        Book[] sortedBooks = Arrays.copyOf(books, count);

        Arrays.sort(sortedBooks, Comparator.comparing(book -> book.title));

        int left = 0;
        int right = count - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int result = sortedBooks[mid].title.compareToIgnoreCase(title);

            if (result == 0) {
                System.out.println("Book Found");
                System.out.println("ID : " + sortedBooks[mid].bookId);
                System.out.println("Title : " + sortedBooks[mid].title);
                System.out.println("Author : " + sortedBooks[mid].author);
                return;
            }

            if (result < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Book Not Found");
    }
}