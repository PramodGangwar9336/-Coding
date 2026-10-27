class Box<T> {
    private T value;
    public void setValue(T value) {
     this.value = value;
    }
    public T getValue() {
     return value;
    }
}
public class Main {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.setValue("Pramod");
        System.out.println(b1.getValue());

        Box<Integer> b2 = new Box<>();
        b2.setValue(100);
        System.out.println(b2.getValue());
    }
}
