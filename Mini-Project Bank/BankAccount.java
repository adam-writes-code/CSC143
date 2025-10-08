/**
 * Represents a bank account in a banking system.
 */

public class BankAccount {

    /** customer name*/
    private String name;
    /** balance in dollars */
    private double balance;
    /** identification number */
    private String id;

    /**
     * Constructor
     * @param name      customer name
     * @param balance   balance in $; balance must be non-negative
     * @param id        identification number
     */
    public BankAccount(String name, String id, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.name = name;
        this.balance = balance;
        this.id = id;
    }

    /**
     * Retrieves customer's name
     * @return      returning customer name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets new customer name
     * @param name  customer name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves account balance
     * @return  account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets new account balance
     * @param balance   balance of the account
     */
    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    /**
     * Retrieves the identification number
     * @return      identification number
     */
    public String getId() {
        return id;
    }

    /**
     * Sets new identification number
     * @param id    identification number
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * String representation of the account information
     * @return      account information
     */
    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", id='" + id + '\'' +
                '}';
    }
}
