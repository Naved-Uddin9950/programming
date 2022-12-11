// Write a program to print the smallest number of two

#include<iostream>

using namespace std;

int main()
{
    float firstNum, secondNum;
    cout<<"Enter First Number: ";
    cin>>firstNum;
    cout<<"Enter Second Number: ";
    cin>>secondNum;

    if(firstNum>secondNum){
        cout<<"Smallest Number Is: "<<secondNum;
    }
    else if(secondNum>firstNum){
        cout<<"Smallest Number Is: "<<firstNum;
    }
    else if(firstNum == secondNum){
        cout<<"Both Numbers Are Equal";
    }
    else{
        cout<<"ERROR: INCORRECT INPUT";
    }
    cout<<endl;
    return 0;
}