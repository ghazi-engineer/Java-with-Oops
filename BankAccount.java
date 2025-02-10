interface MeezanBank {
    void show();

    void interest();
}

class SavingAccount implements MeezanBank {

    private int balance = 10000;
    double interest_rate = 0.04;
    int time_of_periods = 1; // per year..
    double interest;

    SavingAccount() {

        balance = 10000;
        interest_rate = 0.04;
        time_of_periods = 1;
        interest = balance * interest_rate * time_of_periods;
    }

    public void show() {
        System.out.println("Balance = $" + balance);
    }

    public void interest() {
        System.out.println("Interest per year = " + interest);
    }
}

public class BankAccount {
    public static void main(String[] args) {

        MeezanBank profit = new SavingAccount();

        profit.show();
        profit.interest();
    }
}
