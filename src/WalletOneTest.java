public class WalletOneTest {

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

        System.out.println("Balance is "+ balance);
    }


    public void GooglePay(double googleWalletAmount)
    {
        if(googleWalletAmount>500){
            System.out.println("Google Wallet Balance =" + googleWalletAmount);
            double googleCashBack=(googleWalletAmount/100)*20;
            System.out.println("Google Cash Back="+googleCashBack);
            double googleWalletNewBal=googleWalletAmount+googleCashBack;
            System.out.println("Google Wallet New Balance="+googleWalletNewBal);
        }
        else{
            System.out.println("Google Wallet Balance =" + googleWalletAmount);
            System.out.println("Google Wallet:Insufficient funds for cash back");
        }

    }

    public void AmazonPay(double amazonWalletAmount)
    {
        if(amazonWalletAmount>1000) {
            System.out.println("Amazon Wallet Balance =" + amazonWalletAmount);
            double amazonCashBack = (amazonWalletAmount / 100) * 20;
            System.out.println("Amazon Cash Back=" + amazonCashBack);
            double amazonWalletNewBal=amazonWalletAmount+amazonCashBack;

            System.out.println("Amazon Wallet New Balance="+amazonWalletNewBal);
        }
        else{
            System.out.println("Amazon Wallet Balance =" + amazonWalletAmount);
            System.out.println("Amazon Wallet:Insufficient funds for cash back");
        }


    }
}
