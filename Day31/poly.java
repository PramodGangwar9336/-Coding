//compile time polymorphism
// class poly{
//     public static void main(String []ages){
//         animal a1=new animal();
//         a1.sum(10,20);
//         a1.sum(10,20,30);

//     }

// }
// class animal{
//     void sum(int a,int b){
//         System.out.println("sum of two numbers is "+(a+b));
//     }
//      void sum(int a,int b,int c){
//         System.out.println("sum of three numbers is "+(a+b+c));
//     }
// }


//run time polymorphism
// class poly{
//   public static void main(String []ages){
//     animal a;
//       a=new dog();
//       a.eat();
//       a=new cat();
//       a.eat();
//   }
// }class animal{
//  void eat(){
//     System.out.println("animal is eating");
// }}
// class dog extends animal{
//     void eat(){
//         System.out.println("dog is eating");
//     }
// }
// class cat extends animal{
//     void eat(){
//         System.out.println("cat is eating");
//     }
// }