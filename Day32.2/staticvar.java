class StaticExample {
    static int staticVariable = 10; // Static variable

    static void staticMethod() { // Static method
        System.out.println("This is a static method: " + staticVariable);
    }
}
 class staticvar{
    public static void main(String[] args) {
        StaticExample s1 = new StaticExample();
        s1.staticMethod(); // Calling static method
    }
}