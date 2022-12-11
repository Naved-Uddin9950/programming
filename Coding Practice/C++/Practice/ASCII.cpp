#include<iostream>
#include<conio.h>

using namespace std;

int main()
{
    char c = 0;

    for(int i=0;i<=255;i++)
    {
        cout<<"ASCII value of character "<<c<<": "<<i<<endl;
        c++;
    }
    return 0;
}