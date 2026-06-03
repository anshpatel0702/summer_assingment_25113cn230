#include <stdio.h>
#include <math.h>

int main() {
    int range, temp;
    printf("Enter a range: ");
    scanf("%d", &range);
    printf("Armstrong numbers in the range 0 to %d are: ", range);
    for (int i = 0; i < range; i++) {
        int digit = 0, sum = 0;
        temp = i;
        while (temp != 0) {
            temp /= 10;
            digit++;
        }
        temp = i;
        while (temp != 0) {
            int rem = temp % 10;
            int power = 1;
            for (int j = 0; j < digit; j++)
                power *= rem;
            sum += power;
            temp /= 10;
        }
        if (sum == i)
            printf("%d ", i);
    }
    printf("\n");
    return 0;
}