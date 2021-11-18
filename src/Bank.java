import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branches.add(branch);
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTrans){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.newCustomer(customerName, initialTrans);
        }
        return false;

    }
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;

    }

    private Branch findBranch(String branchName){
        for (int i = 0; i < branches.size(); i++){
            if (branches.get(i).getName() == branchName){
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTrans){
        Branch branch = findBranch(branchName);
        boolean success = false;
        if(branch != null){
            System.out.println("Customer details for branch " + branchName);
            ArrayList<Customer> customers = branch.getCustomers();
            if(customers.get(0) != null) {
                for (int i = 0; i < customers.size(); i++) {
                    Customer currentCustomer = customers.get(i);
                    System.out.println("Customer: " + currentCustomer.getName() + "[" + (i + 1) + "]");
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = currentCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(i).doubleValue()); //unbox
                    }
                }
                success = true;
            }
        }
        return success;




    }
}
