public class MainTest {



    public static void main(String[] args) {

        //int balance ;g
        int amount=200;
        //int money;
        //System.out.println("Hello World!");
        double googleWalletAmt=400.00;
        double amazonWalletAmt=5000.00;
        WalletOneTest trans = new WalletOneTest();
        trans.addAmount(amount);
        trans.withdrawAmount(amount);
        trans.checkBalance();
        trans.GooglePay(googleWalletAmt);
        trans.AmazonPay(amazonWalletAmt);






    }


        //System.out.println("Hello World!");

    }

