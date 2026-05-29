#include<stdio.h>
int main(){
    int n,i,digit=0;
    printf("enter a number");   
    scanf("%d",&n);
    while(n>0){
        n=n/10;
        digit++;
    }
    printf("number of digit of given nunber is %d",digit);

}