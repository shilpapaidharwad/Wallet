public class WalletOne {

    int balance=1000;


    public void addAmount(int amt) {
        balance = balance + amt;
        System.out.println("Available balance:" + balance);
    }

    public void withdrawAmount(int amt)
    {if (balance>500)
        balance=balance-amt;
    else
        System.out.print("No available amount");
    }
    public void checkBalance()
    {

        System.out.print("Balance is "+ balance);
    }

}
