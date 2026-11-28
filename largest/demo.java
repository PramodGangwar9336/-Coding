class demo{
    public static void main(String []agrs){
        int[] arr={10,20,30,40,50};

        int largest=arr[0];
        int Smallest=arr[0];


        
         for(int i=1;i<arr.length;i++){
             if(arr[i]>largest){
                 largest=arr[i];
             }
             if(arr[i]<Smallest){
                 Smallest=arr[i];
             }
         }
         System.out.println("Largest element in the array is: " + largest);
         System.out.println("Smallest element in the array is: " + Smallest);
    }
}