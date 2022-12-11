#include<iostream>
#include<stdio.h>

int row, col, input;
char ex;

using namespace std;

int RowMatrix(int row, int col);

int main()
{
    // cout<<"---Select Type Of Matrix---"<<endl;
    // cout<<"(1)  Row Matrix"<<endl;
    // cout<<"(2)  Column Matrix"<<endl;
    // cout<<"(3)  Square Matrix"<<endl;
    // cout<<"(4)  Diagonal Matrix"<<endl;
    // cout<<"(5)  Null Matrix"<<endl;
    // cout<<"(6)  Scalar Matrix"<<endl;
    // cout<<"(7)  Identity Matrix"<<endl;
    // cout<<"(8)  Upper Triangular Matrix"<<endl;
    // cout<<"(9)  Lower Triangular Matrix"<<endl;
    // cout<<"(10) Idempotent Matrix"<<endl;
    // cout<<"(11) Involutory Matrix"<<endl;

    RowMatrix(3, 3);
}

int RowMatrix(int row, int col)
{
    int r[3] = {1, 2, 3};
    int c[3] = {1, 2, 3};
    cout<<r[0]<<" "<<c[0];
}