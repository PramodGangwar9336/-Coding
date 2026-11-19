class demo {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("Task 1 - Iteration " + i);
                try {
                    Thread.sleep(500); // Sleep for 500 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Task 1");
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("Task 2 - Iteration " + i);
                try {
                    Thread.sleep(500); // Sleep for 500 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Task 2");
        });     
    

        t1.start();
        t2.start();
    }
}