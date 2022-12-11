// Write the program to priint the table of any given number with the help of 'Do While' loop

#include<iostream>

using namespace std;

int main()
{
    int num;
    cout<<"Enter any number: ";
    cin>>num;
    int i = 1;
    do{
        cout<<num*i<<endl;
        i++;
    } while (i <= 10);
    return 0;
}