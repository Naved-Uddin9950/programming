// Write a program to calculate perimeter of rectangle. Take sides, a & b, from the user

#include<iostream>

using namespace std;

int main()
{
    float a, b;
    cout<<"Enter value of length: ";
    cin>>a;
    cout<<"Enter value of bredth: ";
    cin>>b;
    cout<<"Perimeter of rectangle is: "<<2*(a+b);
    return 0;
}