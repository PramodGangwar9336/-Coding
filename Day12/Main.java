
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class BankAccount {
    private int balance;
    private final List<String> transactions = new ArrayList<>();

    public BankAccount(int balance) {
        this.balance = balance;
    }

    // Thread-safe deposit
    public synchronized void deposit(int amount, String name) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
            return;
        }

        balance += amount;

        String message = name + " deposited Rs." + amount
                + " | Balance: Rs." + balance;

        transactions.add(message);
        System.out.println(message);
    }

    // Thread-safe withdrawal
    public synchronized void withdraw(int amount, String name) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
            return;
        }

        if (amount > balance) {
            System.out.println(name + ": Insufficient balance!");
            return;
        }

        balance -= amount;

        String message = name + " withdrew Rs." + amount
                + " | Balance: Rs." + balance;

        transactions.add(message);
        System.out.println(message);
    }

    public synchronized int getBalance() {
        return balance;
    }

    public synchronized void showTransactions() {
        System.out.println("\n===== TRANSACTION HISTORY =====");

        for (String transaction : transactions) {
            System.out.println(transaction);
        }

        System.out.println("Final Balance: Rs." + balance);
    }
}

// Customer task
class Customer implements Runnable {
    private final BankAccount account;
    private final String name;
    private final int amount;
    private final boolean isDeposit;

    public Customer(BankAccount account, String name,
                    int amount, boolean isDeposit) {
        this.account = account;
        this.name = name;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " started transaction.");

            Thread.sleep(500);

            if (isDeposit) {
                account.deposit(amount, name);
            } else {
                account.withdraw(amount, name);
            }

            System.out.println(name + " completed transaction.");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(name + " was interrupted.");
        }
    }
}

// Background report thread
class ReportTask implements Runnable {
    private final BankAccount account;

    public ReportTask(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        System.out.println(
                "\n[REPORT] Current balance: Rs."
                        + account.getBalance()
        );
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(10000);

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        System.out.println("===== BANK MANAGEMENT SYSTEM =====");
        System.out.println("Starting Balance: Rs.10000");

        try {
            boolean running = true;

            while (running) {
                System.out.println("\n1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Transaction History");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");

                if (!sc.hasNextInt()) {
                    System.out.println("Enter a valid number!");
                    sc.next();
                    continue;
                }

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                    case 2:
                        System.out.print("Enter amount: ");

                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid amount!");
                            sc.next();
                            break;
                        }

                        int amount = sc.nextInt();

                        System.out.print("Enter customer name: ");
                        String name = sc.next();

                        executor.submit(
                                new Customer(
                                        account,
                                        name,
                                        amount,
                                        choice == 1
                                )
                        );
                        break;

                    case 3:
                        System.out.println(
                                "Balance: Rs." + account.getBalance()
                        );
                        break;

                    case 4:
                        account.showTransactions();
                        break;

                    case 5:
                        running = false;
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }
            }
        } finally {
            executor.shutdown();

            try {
                if (!executor.awaitTermination(
                        10, TimeUnit.SECONDS)) {
                    executor.shutdownNow();
                }
            } catch (InterruptedException e) {
                executor.shutdownNow();
                Thread.currentThread().interrupt();
            }

            account.showTransactions();
            sc.close();

            System.out.println("Bank system closed.");
        }
    }
}
