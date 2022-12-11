#include<iostream>

using namespace std;

int main()
{
    int arr[5] = {10, 2, 5, 3, 8};
    int temp = 0;
    bool swap = true;

    while (swap==true)
    {
        swap = false;

        for(int i = 0;i<=4;i++)
        {
            if(arr[i]>arr[i + 1])
            {
                swap = true;
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
    
    for(int i=0;i<=4;i++)
    {
        cout<<arr[i]<<endl;
    }

    return 0;
}