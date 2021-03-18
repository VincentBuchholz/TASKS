package CphBusiness;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Account {
    boolean loggedIn = false;
   private String transactionDate;
    private int cardNumber;
    private double initialBalance;
    private String owner;
    private String accountCreated;
    private String lastLogin;
    Date date = new Date();




    public Account(String owner, double initialBalance){
        this.owner = owner;
        this.initialBalance = initialBalance;
        this.accountCreated = date.getTimeNow();
    }

    public void login(){
        loggedIn = true;
        this.lastLogin = date.getTimeNow();
    }
    public void logOut(){
        loggedIn = false;
    }

    public void setCardNumber(int cardNumber) {

        //TODO Luhn algorithm
        this.cardNumber = cardNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void withdraw(int amountToWithdraw){
        if (loggedIn == true) {
            this.initialBalance -= amountToWithdraw;
            System.out.println("Balance: " + initialBalance);
        } else {
            System.out.println("You need to be logged in to withdraw from account");
        }
    }

    public void deposit(int amountToDeposit) {
        if (loggedIn == true) {
            this.initialBalance += amountToDeposit;
            System.out.println("Balance: " + initialBalance);
        } else {
            System.out.println("You need to be logged in to deposit into account");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                "balance= " + initialBalance + '\'' +
                ", accountCreated='" + accountCreated + '\'' +
                ", last login='" + lastLogin + '\'' +
                '}';
    }
}
