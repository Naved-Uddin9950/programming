// Write a program to print the average of 3 numbers

#include<iostream>

using namespace std;

int main()
{
    float a, b, c;
    cout<<"Enter first number: ";
    cin>>a;
    cout<<"Enter second number: ";
    cin>>b;
    cout<<"Enter third number: ";
    cin>>c;
    cout<<"Average of "<<a<<", "<<b<<" and "<<c<<" is: "<<(a+b+c)/3;
    return 0;
}