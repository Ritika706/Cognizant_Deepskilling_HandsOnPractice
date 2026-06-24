
public class Main {
    public static void main(String[] args) {

        LibraryManagementSystem library = new LibraryManagementSystem();

        library.addBook(101, "Java Programming", "James Gosling");
        library.addBook(102, "Data Structures", "Mark Allen");
        library.addBook(103, "Python Basics", "Guido Van Rossum");
        library.addBook(104, "Operating Systems", "Galvin");

        System.out.println("Linear Search:");
        library.linearSearch("Python Basics");

        System.out.println("\nBinary Search:");
        library.binarySearch("Python Basics");
    }
}