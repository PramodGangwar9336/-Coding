class MyThread extends Thread {
    public void run() {
        for (int i = 0; i <100; i++) {
        System.out.println("Ansh is running...");
        }
    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i <100; i++) {  
        System.out.println("pramod is running...");
    }
}
}
class thrade {
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        MyThread1 t2 = new MyThread1();
        t1.start();
        t2.start();
    }
}