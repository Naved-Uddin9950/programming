#include<iostream>

using namespace std;

int fact(int n);

int main()
{
    int n;

    cout<<"Enter value of n: ";
    cin>>n;
    cout<<fact(n);
    return 0;
}

// I don't understand this problem
// I have to practice it atleast 100 times
int fact(int n)
{
    int tempFact, facto;
    for(int i=1;i<n;i++)
    {
        tempFact = n-1;
        facto = n * tempFact;
        n--;
    }
    return facto;
}