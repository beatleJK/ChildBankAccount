public class ChildBankAccount {
    private double balance;
    private double maxBalance;
    public ChildBankAccount(){
        balance = 0.0;
        maxBalance = 10000;
    }
    public ChildBankAccount(double maxBalance){
        this();
        this.maxBalance = maxBalance;
    }
    public boolean depositMoney (double value){
        if((value > 0) && ((balance + value) <= maxBalance)){
        balance = balance + value;
        return true;
        }
        else {
        return false;
            }
        }
    public boolean debitMoney (double value){
        if((value > 0) && ((balance-value)>=0)){
            balance = balance-value;
            return true;
        }
        else {
        return false;
        }
    }
    public double getBalance(){
        return balance;
    }
}
