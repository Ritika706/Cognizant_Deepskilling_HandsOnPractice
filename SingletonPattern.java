class Logger {

    // Private static instance
    private static Logger instance;

    // Private constructor
    private Logger() {
        System.out.println("Logger Instance Created");
    }

    // Public method to get single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

public class SingletonPattern {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First Message");
        logger2.log("Second Message");

        if (logger1 == logger2) {
            System.out.println("Only one instance exists.");
        } else {
            System.out.println("Multiple instances created.");
        }
    }
}