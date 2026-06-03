#include <stdio.h>
int main(){
    int n,fibo,a=0,b=1;
    printf("enter a number");
    scanf("%d",&n);
    printf("Fibonacci series: ");
    for(int i=0;i<n;i++){
        if(i<=1)
            fibo=i;
        else{
            fibo=a+b;
            a=b;
            b=fibo;
        }
        printf("%d ",fibo);
    }
    return 0;
}