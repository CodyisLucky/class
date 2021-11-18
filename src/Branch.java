import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTrans){
        Customer customer = findCustomer(customerName);
        if (customer == null){
            customer = new Customer(customerName, initialTrans);
            customers.add(customer);
            return true;
        }
        return false;

    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        Customer customer = findCustomer(customerName);
        if (customer != null){
            customer.addTransaction(transaction);
            return true;
        }
        return false;

    }

    private Customer findCustomer(String customerName){
        for (int i = 0; i < customers.size(); i++){
            if (customers.get(i).getName() == customerName){
                return customers.get(i);
            }
        }
        return null;

    }
}
