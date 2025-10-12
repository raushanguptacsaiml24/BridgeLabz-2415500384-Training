class BankAccount{
    String accountHolder;
    int accountNumber;
    float balance;

    public void deposite(float amount){
        balance = balance + amount;
        //System.out.println("Your balance is " + balance);
    }

    public void withdraw(float amount){
        if(amount<=balance){
            balance = balance - amount;
        }
        else{
            System.out.println("Your balance is insufficient" + balance);
        }
    }

    public void displayBalance(){
        System.out.println("your current balance " + balance);
    }

    public BankAccount(String name , int number , float balance){
        this.accountHolder = "name";
        this.accountNumber = number;
        this.balance = balance;
    }

}



public class AtmSimulation {
    public static void main(String[] arge){
        BankAccount b1 = new BankAccount("Arun" , 123456789 , 5000);
        b1.deposite(200);
        b1.withdraw(1000);
        b1.displayBalance();
    }
}
