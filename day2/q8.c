#include<stdio.h>
int main()
{
    int n,reverse=0;
    printf("enter a number");
    scanf("%d",&n);
    int temp=n;
    while(temp>0){
        reverse=reverse*10+temp%10;
        temp= temp/10;
    }
   if(n==reverse){
   printf("given no. is palindrome");}

   else{
   printf("given no. is not palindrome");}
   return 0;

}