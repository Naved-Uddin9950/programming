#include<stdio.h>
#include<conio.h>

void main()
{
    FILE *fptr;
    fptr = fopen("1.dat", "a");
    char c;

    /* ERROR HANDLING */
    // if(fptr != NULL)
    // {
    //     printf("File exists");
    // }

    // else
    // {
    //     printf("File doesn't exists");
    // }

    c = getchar();   // Get value from user and assign it in "c" variable
    putc(c, fptr);  // Puts assigned value in fptr, which is our file
    fclose(fptr);

    printf("Programme Executed Successfully.....");
}