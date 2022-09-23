public class Account {
    private int accountID;
    private double balance;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    // Default Constructor
    public Account() {
        this(1, 0.0, "FirstName", "LastName", "placeholder@email.com", "000-000-0000");
        System.out.println("Default Account Created");
    }

    public Account(int accountID, double balance, String firstName, String lastName, String email, String phoneNumber) {
        this.accountID = accountID;
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("New Account Created");
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double deposit (double amount) {
        this.balance = this.balance + amount;
        return this.balance;
    }

    public double withdraw (double amount) {
        this.balance = this.balance - amount;
        return this.balance;
    }

    public double getBalance () {
        return this.balance;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
