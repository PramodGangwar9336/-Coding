class intheritance {
    public static void main(String[] args){
        dog a = new dog();
        a.eat();
        a.food();

    }
    
}
class animal{
    void food(){
        System.out.println("animal is eating");
    }
}

class dog extends animal{
    void eat(){
        System.out.println("dog is eating");
    }
}