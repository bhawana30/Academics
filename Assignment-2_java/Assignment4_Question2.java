import java.util.*;

abstract class Account {
    int accno;
    String name;
    double balance = 0;

    abstract void displayBalance();

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

}

class SavingAccount extends Account {

    String type;
    double interestRate;

    void setData(int accno, String name, String type, double interestRate) {
        this.accno = accno;
        this.name = name;
        this.type = type;
        this.interestRate = interestRate;
    }

    @Override
    void displayBalance() {
        System.out.println("Your Account number is : " + accno);
        System.out.println("Current Balance: " + balance);
    }

    @Override
    void deposit(double amount) {
        balance =balance+ amount;
    }

    @Override
    void withdraw(double amount) {
        if (amount > balance)
            System.out.println("Insufficient Balance");
        else
            balance -= amount;
    }

    void calculateInterest(double time) {
        double interest = (balance * time * interestRate) / 100;

        System.out.println("Interest: Rs." + interest);
    }
}

class CurrentAccount extends Account {

    String type;
    double interestRate;

    void setData(int accno, String name, String type, double interestRate) {
        this.accno = accno;
        this.name = name;
        this.type = type;
        this.interestRate = interestRate;
    }

    @Override
    void displayBalance() {
        System.out.println("Your Account number is : " + accno);
        System.out.println("Currenr Balance: " + balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
    }

    @Override
    void withdraw(double amount) {
        if (amount > balance)
            System.out.println("Insufficient Balance");
        else
            balance -= amount;
    }

    void calculateInterest(double time) {
        double interest = (balance * time * interestRate) / 100;

        System.out.println("Interest: Rs." + interest);
    }
}

class Assignment4_Question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accno;
        String name, type;
        double interestRate, time, amount;
        System.out.println("Savings account");
        System.out.println("Enter account no: ");
        accno = sc.nextInt();
        System.out.println("Enter Name: ");
        name = sc.next();
        System.out.println("Enter account type: ");
        type = sc.next();
        System.out.println("Enter interest rate: ");
        interestRate = sc.nextDouble();
        System.out.println("Enter time (in years): ");
        time = sc.nextDouble();
        System.out.println("Deposit amount: ");
        amount = sc.nextDouble();
        SavingAccount ob = new SavingAccount();
        ob.setData(accno, name, type, interestRate);
        ob.deposit(amount);
        ob.displayBalance();
        ob.calculateInterest(time);
        System.out.println("Current account");
        System.out.println("Enter account no: ");
        accno = ob.nextInt();
        System.out.println("Enter Name: ");
        name = ob.next();
        System.out.println("Enter account type: ");
        type = ob.next();
        System.out.println("Enter interest rate: ");
        interestRate = ob.nextDouble();
        System.out.println("Enter time (in years): ");
        time = ob.nextDouble();
        System.out.println("Deposit amount: ");
        amount = ob.nextInt();
        CurrentAccount ob2 = new CurrentAccount();
        ob2.setData(accno, name, type, interestRate);
        ob2.deposit(amount);
        ob2.displayBalance();
        ob2.calculateInterest(time);
    }

}
