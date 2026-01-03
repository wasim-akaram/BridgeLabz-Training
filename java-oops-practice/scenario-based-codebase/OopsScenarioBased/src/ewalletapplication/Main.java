package ewalletapplication;

public class Main
{

    public static void main(String[] args) 
    {

        User user1 = new User("Wasim", new IndividualWallet(100));
        User user2 = new User("Vishal", new IndividualWallet(200));

        user1.loadMoney(3000);
        user2.loadMoney(5000);

        user1.getWallet().transfer(user2, 2000);
        user2.getWallet().transfer(user1, 1000);

        System.out.println("\nWasim Balance: Rs " + user1.getWallet().getBalance());
        System.out.println("Vishal Balance: Rs " + user2.getWallet().getBalance());

        System.out.println("\nWasim Transactions:");
        user1.getWallet().showTransaction();

        System.out.println("\nVishal Transactions:");
        user2.getWallet().showTransaction();
    }
}
