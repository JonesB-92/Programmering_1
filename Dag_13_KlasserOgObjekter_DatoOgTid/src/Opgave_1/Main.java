package Opgave_1;

public class Main {
    public static void main(String[] args) {
        //a
        /*BankAccount b1 = new BankAccount(100);
        System.out.println("Number of IDs");
        System.out.println(b1.getID());
        System.out.println("Number of accounts");
        System.out.println(b1.getNumberOfAccounts());

        BankAccount b2 = new BankAccount(5000);
        System.out.println("Number of IDs");
        System.out.println(b2.getID());
        System.out.println("Number of accounts");
        System.out.println(b2.getNumberOfAccounts());

        BankAccount b3 = new BankAccount(500);
        System.out.println("Number of IDs ");
        System.out.println(b3.getID());
        System.out.println("Number of accounts");
        System.out.println(b3.getNumberOfAccounts());*/

        //b
        /*System.out.println(b1.getBalance(5));*/

        //Tester b) ved at lave 10 accounts med et for-loop
        BankAccount[] accounts = new BankAccount[11];
        for (int i = 0; i < 11; i++) {
            accounts[i] = new BankAccount(100);
        }
        System.out.println(accounts[0].getBalance(1));
        System.out.println(accounts[9].getBalance(1));
        System.out.println(accounts[10].getBalance(1));
    }
}
