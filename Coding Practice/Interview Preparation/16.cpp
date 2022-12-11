// Make your own pow function

#include<iostream>

using namespace std;

int pow(int num, int p);

int main()
{
    int num, p;
    cout<<"Enter number: ";
    cin>>num;
    cout<<"Enter power: ";
    cin>>p;
    cout<<pow(num, p);
}

int pow(int num, int p)
{
    int power;
    for (int i = 1; i <= p; i++)
    {
        power += num * i;
    }
    
}