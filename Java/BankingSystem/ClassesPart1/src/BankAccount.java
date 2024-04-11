public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("Brinda", "Brinda@gmail.com", "9884136397", 12435686, 2000000);
        System.out.println("Default constructor");
    }

    public BankAccount(String customerName, String email, String phoneNumber, int accountNumber, int accountBalance){
        System.out.println("Constructor Initialized");
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public BankAccount(double accountBalance, String customerName) {
        this(customerName, "AKSKKSJSJSJ", "1234445",1234,12);
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void withdrawFunds(double withdrawFunds){
        if(accountBalance - withdrawFunds < 0)
            System.out.println("Insufficient funds!!!, Your current balance is " +accountBalance+ " rupees");
        else
            System.out.println("The amount withdrawn is "+withdrawFunds+ "rupees, Your current Balance is "+(accountBalance - withdrawFunds)+" rupees");
    }

    public void depositFunds(double depositFunds){
        accountBalance += depositFunds;
        System.out.println("Amount deposited is "+depositFunds+ " rupees,Your current balance is " +accountBalance+ "rupees");
    }
}
