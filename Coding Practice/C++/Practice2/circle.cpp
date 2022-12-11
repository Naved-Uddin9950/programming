#include<iostream>

using namespace std;

int main()
{
    const float pi = 3.14;
    float r;
    cout<<"Enter radius of a circle: ";
    cin>>r;
    cout<<"Area of the circle is: "<<pi*r*r<<endl;
    cout<<"Circumference of the circle is: "<<2*pi*r<<endl;
    return 0;
}