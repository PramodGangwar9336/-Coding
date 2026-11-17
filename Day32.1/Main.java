
class Shared {
    boolean pramodTurn = true;

    synchronized void printPramod() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            while (!pramodTurn) {
                wait();
            }

            System.out.println("Pramod is running...");
            pramodTurn = false;
            notifyAll();
        }
    }

    synchronized void printAnsh() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            while (pramodTurn) {
                wait();
            }

            System.out.println("Ansh is running...");
            pramodTurn = true;
            notifyAll();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Shared obj = new Shared();

        Thread t1 = new Thread(() -> {
            try {
                obj.printPramod();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                obj.printAnsh();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        t1.start();
        t2.start();
    }
}
