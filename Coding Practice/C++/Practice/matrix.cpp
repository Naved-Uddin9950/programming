#include<iostream>
#include<windows.h>

using namespace std;

int main()
{
    system("cls");
    int mat1[2][2];
    int mat2[2][3];
    int mat3[3][2];
    int mat4[3][3];
    int input;

    cout<<"Choose the type of Matrix: "<<endl;
    cout<<"(1) 2x2 Matrix"<<endl;
    cout<<"(2) 2x3 Matrix"<<endl;
    cout<<"(3) 3x2 Matrix"<<endl;
    cout<<"(4) 3x3 Matrix"<<endl<<endl;

    cout<<"Your choice: ";
    cin>>input;

    if(input==1)
    {
        system("cls");
        cout<<"Enter value of row 1 column 1: ";
        cin>>mat1[0][0];
        cout<<"Enter value of row 1 column 2: ";
        cin>>mat1[0][1];
        cout<<"Enter value of row 2 column 1: ";
        cin>>mat1[1][0];
        cout<<"Enter value of row 2 column 2: ";
        cin>>mat1[1][1];
        cout<<endl<<endl;

        cout<<"Matrix: "<<endl;
        cout<<mat1[0][0]<<" "<<mat1[0][1]<<endl;
        cout<<mat1[1][0]<<" "<<mat1[1][1]<<endl<<endl;
        system("pause");
        main();
    }

    else if(input==2)
    {
        system("cls");
        cout<<"Enter value of row 1 column 1: ";
        cin>>mat2[0][0];
        cout<<"Enter value of row 1 column 2: ";
        cin>>mat2[0][1];
        cout<<"Enter value of row 1 column 3: ";
        cin>>mat2[0][2];
        cout<<"Enter value of row 2 column 1: ";
        cin>>mat2[1][0];
        cout<<"Enter value of row 2 column 2: ";
        cin>>mat2[1][1];
        cout<<"Enter value of row 2 column 3: ";
        cin>>mat2[1][2];
        cout<<endl<<endl;

        cout<<"Matrix: "<<endl;
        cout<<mat2[0][0]<<" "<<mat2[0][1]<<" "<<mat2[0][2]<<endl;
        cout<<mat2[1][0]<<" "<<mat2[1][1]<<" "<<mat2[1][2]<<endl<<endl;
        system("pause");
        main();
    }

    else if(input==3)
    {
        system("cls");
        cout<<"Enter value of row 1 column 1: ";
        cin>>mat3[0][0];
        cout<<"Enter value of row 1 column 2: ";
        cin>>mat3[0][1];
        cout<<"Enter value of row 2 column 1: ";
        cin>>mat3[1][0];
        cout<<"Enter value of row 2 column 2: ";
        cin>>mat3[1][1];
        cout<<"Enter value of row 3 column 1: ";
        cin>>mat3[2][0];
        cout<<"Enter value of row 3 column 2: ";
        cin>>mat3[2][1];
        cout<<endl<<endl;

        cout<<"Matrix: "<<endl;
        cout<<mat3[0][0]<<" "<<mat3[0][1]<<endl;
        cout<<mat3[1][0]<<" "<<mat3[1][1]<<endl;
        cout<<mat3[2][0]<<" "<<mat3[2][1]<<endl<<endl;
        system("pause");
        main();
    }

    else if(input==4)
    {
        system("cls");
        cout<<"Enter value of row 1 column 1: ";
        cin>>mat4[0][0];
        cout<<"Enter value of row 1 column 2: ";
        cin>>mat4[0][1];
        cout<<"Enter value of row 1 column 3: ";
        cin>>mat4[0][2];
        cout<<"Enter value of row 2 column 1: ";
        cin>>mat4[1][0];
        cout<<"Enter value of row 2 column 2: ";
        cin>>mat4[1][1];
        cout<<"Enter value of row 2 column 3: ";
        cin>>mat4[1][2];
        cout<<"Enter value of row 3 column 1: ";
        cin>>mat4[2][0];
        cout<<"Enter value of row 3 column 2: ";
        cin>>mat4[2][1];
        cout<<"Enter value of row 3 column 3: ";
        cin>>mat4[2][2];
        cout<<endl<<endl;

        cout<<"Matrix: "<<endl;
        cout<<mat4[0][0]<<" "<<mat4[0][1]<<" "<<mat4[0][2]<<endl;
        cout<<mat4[1][0]<<" "<<mat4[1][1]<<" "<<mat4[1][2]<<endl;
        cout<<mat4[2][0]<<" "<<mat4[2][1]<<" "<<mat4[2][2]<<endl<<endl;
        system("pause");
        main();
    }

    else
    {
        system("cls");
        cout<<"ERROR: INCORRECT INPUT! TRY ANOTHER ONE....."<<endl;
        system("pause");
        main();
    }

    // This program is still in development
    // It also needs better improvements --- Algoriths

    return 0;
}