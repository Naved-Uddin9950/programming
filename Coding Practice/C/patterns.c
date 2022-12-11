#include<stdio.h>
#include<conio.h>

int rect(int row, int col);
int rects(int row, int col);
int hrect(int row, int col);
int pyra(int n);
int invpyra(int n);
int sqr(int a);
int sqrs(int a);
int hpyra180(int n);
int hline(int n);
int vline(int n);

void main()
{
    // hpyra180(5);
}

// 180 degree Half Pyramid ------ Still in Development
// int hpyra180(int n)
// {
//     for(int i=n;i>0;i--)
//     {
//         for(int j=1;j<=i;j++)
//         {
//             printf(" ");
//         }
//         printf("\n");
//     }
//     return 0;
// }

// Vertical Line
int vline(int n)
{
    for(int i=1;i<=n;i++)
    {
        printf("* \n");
    }
    return 0;
}

// Horizontal Line
int hline(int n)
{
    for(int i=1;i<=n;i++)
    {
        printf("*");
    }
    return 0;
}

// Square / Filled Square / Full Square
int sqr(int a)
{
    for(int i=1;i<=a;i++)
    {
        for(int j=1;j<=a;j++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}

// Square 2 / Filled Square 2 / Full Square 2
int sqrs(int a)
{
    for(int i=1;i<=a;i++)
    {
        for(int j=1;j<=a;j++)
        {
            printf("* ");
        }
        printf("\n");
    }
    return 0;
}

// Inverted Pyramid
int invpyra(int n)
{
    for(int i=n;i>0;i--)
    {
        for(int j=1;j<=i;j++)
        {
            printf("* ");
        }
        printf("\n");
    }
    return 0;
}

// Pyramid
int pyra(int n)
{
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            printf("* ");
        }
        printf("\n");
    }
    return 0;
}

// Hollow Rectangle
int hrect(int row, int col)
{
    for(int i=1;i<=row;i++)
    {
        for(int j=1;j<=col;j++)
        {
            if(i==1 | i==row | j==1 | j==col)
            {
                printf("*");
            }
            
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }
    return 0;
}

// Rectangle / Filled Rectangle / Full Rectangle
int rect(int row, int col)
{
    for(int i=1;i<=row;i++)
    {
        for(int j=1;j<=col;j++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}

// Rectangle 2 / Filled Rectangle 2 / Full Rectangle 2
int rects(int row, int col)
{
    for(int i=1;i<=row;i++)
    {
        for(int j=1;j<=col;j++)
        {
            printf("* ");
        }
        printf("\n");
    }
    return 0;
}