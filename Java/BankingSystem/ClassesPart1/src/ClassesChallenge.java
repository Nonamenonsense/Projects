public class ClassesChallenge {

    public static void main(String[] args) {

//        BankAccount bankAccount = new BankAccount("Ajay", "AK@gmasil.com", "8825715314",
//                1234, 1000);

        BankAccount bankAccount = new BankAccount();


        System.out.println(bankAccount.getCustomerName());
        System.out.println(bankAccount.getPhoneNumber());
        System.out.println(bankAccount.getEmail());
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getAccountBalance());

        bankAccount.withdrawFunds(2300);
        bankAccount.depositFunds(5000);
        bankAccount.withdrawFunds(250.87);

        BankAccount timsAccount = new BankAccount(12232, "SK");
        System.out.println("AccountNo: " + timsAccount.getCustomerName() +
                "; name " + timsAccount.getAccountBalance());

    }
}
