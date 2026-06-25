// 2. Define Repository Interface
interface CustomerRepository {
    String findCustomerById(String id);
}

// 3. Implement Concrete Repository
class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(String id) {
        // Simulating data retrieval from a database
        if ("C101".equals(id)) {
            return "Alice Smith";
        } else if ("C102".equals(id)) {
            return "Bob Jones";
        }
        return "Customer Not Found";
    }
}

// 4 & 5. Define Service Class and Implement Dependency Injection
class CustomerService {
    private final CustomerRepository customerRepository;

    // 5. Use constructor injection to inject CustomerRepository into CustomerService
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void displayCustomerName(String id) {
        String name = customerRepository.findCustomerById(id);
        System.out.println("Customer Profile Details [ID: " + id + "]: " + name);
    }
}

// 6. Test the Dependency Injection Implementation
public class DependencyInjection{
    public static void main(String[] args) {
        // Instantiate the concrete dependency
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject the dependency via the constructor
        CustomerService service = new CustomerService(repository);

        // Use the service to find a customer
        service.displayCustomerName("C101");
        service.displayCustomerName("C199");
    }
}