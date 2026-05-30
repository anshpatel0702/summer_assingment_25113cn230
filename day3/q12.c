#include<stdio.h>
int gcd(int a,int b){
    if(b==0) 
      return a;
    if (a==0) 
      return b; 
        
    return gcd(b,a%b);
}
int main(){
    int a,b;
    printf("Enter two numbers: ");
    scanf("%d %d",&a,&b);
    printf("LCM of %d and %d is %d\n",a,b,a* b/gcd(a,b));
    return 0;
}