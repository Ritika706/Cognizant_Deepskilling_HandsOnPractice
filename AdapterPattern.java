interface PaymentProcessor {
    void processPayment(double amount);
}

// Adaptee Class 1
class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " processed via PayPal.");
    }
}

// Adaptee Class 2
class StripeGateway {
    public void payAmount(double amount) {
        System.out.println("Payment of Rs." + amount + " processed via Stripe.");
    }
}

// Adapter for PayPal
class PayPalAdapter implements PaymentProcessor {
    private final PayPalGateway paypal;

    public PayPalAdapter(PayPalGateway paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processPayment(double amount) {
        paypal.makePayment(amount);
    }
}

// Adapter for Stripe
class StripeAdapter implements PaymentProcessor {
    private final StripeGateway stripe;

    public StripeAdapter(StripeGateway stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        stripe.payAmount(amount);
    }
}

public class AdapterPattern {
    public static void main(String[] args) {

        PaymentProcessor paypal =
                new PayPalAdapter(new PayPalGateway());

        PaymentProcessor stripe =
                new StripeAdapter(new StripeGateway());

        paypal.processPayment(1000);
        stripe.processPayment(2000);
    }
}