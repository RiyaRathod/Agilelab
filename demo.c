#include<stdio.h>

void main()
{
    int a=3,b=4,c;

    __asm__("addl %%eax, %%ebx;" : "=b"(c) : "a"(a),"b"(b));

    printf("%d",c);
}
