// JUST DEBUG THIS CODE ALREADY!

#include<iostream>

using namespace std;

int sort(int arr[]);

int main()
{
    int arr[] = {10, 2, 4, 6, 3};
    
    for(int i=0;i<=4;i++)
    {
        cout<<sort(arr[i])<<endl;
    }
}

int sort(int arr[])
{
    bool swap = true;
    while (swap==true)
    {
        swap = false;
        for(int i=0;i<=4;i++)
        {
            if(arr[i]>arr[i + 1])
            {
                swap = true;
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
    return arr[];
}