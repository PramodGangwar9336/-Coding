


class demo{
    public static void main(String args[]){
        try{
            System.out.println("try first try block");

       try{
        System.out.println("try second try block");
        System.out.println(10/0);
        System.out.println("fully printing");


       }catch(ArithmeticException e){
            System.out.println("10 not divided by 0");


       }
       System.out.println("first try block and");

        }catch(ArithmeticException e){
            System.out.println("10 not divided by 0");
        }
     System.out.println("second try block and");

    }

}









 