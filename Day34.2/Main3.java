class MyThraed implements Runnable {
    public void run() {
        
        System.out.println("Thread is running...");
    }
}
class Main3 {
    public static void main(String args[]) {
        MyThraed t1 = new MyThraed();
        Thread t2 = new Thread(t1);
        t2.start();
    }
}