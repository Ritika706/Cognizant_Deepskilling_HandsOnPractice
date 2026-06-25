// 2. Define Strategy Interface
interface PaymentStrategy {
    void pay(double amount);
}

// 3. Implement Concrete Strategies
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

// 4. Implement Context Class
class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method first.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}

// 5. Test the Strategy Implementation
public class StrategyPattern {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Select and use Credit Card
        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(250.00);

        // Switch strategy to PayPal at runtime
        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment(45.50);
    }
}