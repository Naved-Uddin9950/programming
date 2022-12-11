// Write a function to print "Hot" or "Cold" depending on the temperature user enters

#include<iostream>

using namespace std;

// 36.1 - 37.2 == normal
// temp < 36.1 == cold
// temp > 37.2 == hot

int main()
{
    float temp;
    cout<<"Enter temperature in celsius: ";
    cin>>temp;
    if(temp<36.1){
        cout<<"Cold";
    }
    else if(temp>37.2){
        cout<<"Hot";
    }
    else{
        cout<<"Normal";
    }
}