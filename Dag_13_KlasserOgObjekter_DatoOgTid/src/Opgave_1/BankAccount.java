package Opgave_1;

public class BankAccount {
    private static int numberOfAccounts = 0;

    private int id;
    private double balance;

    public BankAccount(double initialBalance) {
        this.id = numberOfAccounts;
        balance = initialBalance;
        numberOfAccounts++;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public double getBalance(int years) {

        double interestRate = id < 10 ? 5.0 : 3.5;

        /* Ovenstående er det samme som:
        double interestRate;
        if( id < 10 ){
            interestRate = 5;
        } else {
            interestRate = 3.5;
        }
        */

        double futureBalance = balance;
        for (int i = 0; i < years; i++)
            futureBalance += balance * (interestRate / 100);
        return futureBalance;
    }

    public int getID() {
        return id;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }
    /*a) Tilføj til klasen et felt id af typen int og en getId() metode (hver konto har et entydigt
    nummer). Brug en statisk felt i klassen til at generere det entydige id for kontoen. Det
    statiske felt skal huske, hvor mange gange BankAccount er blevet instantieret (dvs. hvor mange gange
    constructoren er blevet kaldt). Lav også en statisk get-metode der returnerer antallet */

    /*b) En bank har ført en kampagne for at tiltrække nye kunder. Her har man lovet, at de ti
første, der opretter en konto i banken får en årlig indlånsrente på 5% imens alle øvrige
kunder får en rente på 3,5%. Implementer et overload på metoden getBalance(…), der
tager et argument years af typen int, og som returnerer den mulige fremtidige saldo ved rentetilskrivning efter antal år.
*/
}


