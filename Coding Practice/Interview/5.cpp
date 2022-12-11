//  Write a program to check if given character is digit or not

#include<iostream>

using namespace std;

int main()
{
    char dig;
    cout<<"User Input: ";
    cin>>dig;
    if(isdigit(dig) == true){
        cout<<"Character is a digit";
    }
    else{
        cout<<"Character is not a digit";
    }

    return 0;
}