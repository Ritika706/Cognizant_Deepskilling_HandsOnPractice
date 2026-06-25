import java.util.ArrayList;
import java.util.List;

// 2. Define Subject Interface
interface Stock {
    void register(Observer observer);
    void deregister(Observer observer);
    void notifyObservers();
}

// 4. Define Observer Interface
interface Observer {
    void update(double price);
}

// 3. Implement Concrete Subject
class StockMarket implements Stock {
    private final List<Observer> observers = new ArrayList<>();
    private double price;

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}

// 5. Implement Concrete Observers
class MobileApp implements Observer {
    @Override
    public void update(double price) {
        System.out.println("MobileApp: Stock price updated to $" + price);
    }
}

class WebApp implements Observer {
    @Override
    public void update(double price) {
        System.out.println("WebApp: Stock price updated to $" + price);
    }
}

// 6. Test the Observer Implementation
public class ObserverPattern {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.register(mobileApp);
        stockMarket.register(webApp);

        System.out.println("--- First Price Update ---");
        stockMarket.setPrice(150.50);

        System.out.println("\n--- Removing WebApp Notification ---");
        stockMarket.deregister(webApp);

        System.out.println("\n--- Second Price Update ---");
        stockMarket.setPrice(155.25);
    }
}