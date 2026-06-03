#include <stdio.h>
int main(){
    int n,fibo,a=0,b=1;
    printf("enter a number");
    scanf("%d",&n);
    for(int i=2;i<n;i++){
        fibo=a+b;
        a=b;
        b=fibo;
    }
    printf("the %dth term of the Fibonacci series is %d",n,fibo);
    return 0;
}