//college canteen billing system program. 
#include <stdio.h>
#include <stdlib.h>
int main()
{
    int n,i;
    float price,total = 0;
    char type;
    printf("Enter the no. of item:");
    scanf("%d",&n);
    printf("\ncostumer type( T = student,S = staff):");
    scanf(" %c",&type);
    for(i=1;i<=n;i++){
        printf("/nEnter the price of item %d :",i);
        scanf("%f",&price);
        total = total+price;
    }
    if(price>500 && type == 'S'){
        total = total -0.10*total;
    }
    printf("final payble amount:Rs. %.2f",total);
    return 0;
}