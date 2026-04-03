public class Bank1 {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    Bank bpbsAccount = new Bank();
    
    public void withDrawFunds(double withDrawAmount) {
        if (withDrawAmount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else if (balance - withDrawAmount < 0) {
            System.out.println("Insufficient balance. Withdrawal not allowed.");
        } else {
            balance -= withDrawAmount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }

    public void depositFunds(double depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
        } else {
            balance += depositAmount;
            System.out.println("Deposit successful. New balance: " + balance);
        }
    }

    // Getters and Setters
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
