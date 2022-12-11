#include<iostream>
#include<string>
#include<windows.h>

using namespace std;

// ------- Windows is throughing an error and stoping working because of this section ---------- //
// I have an idea of reading strings in an array of 'n' numbers and then initializing it in 'book' array
string book[] = {"Python Basics", "Principals Of Programming Language Through C", "C++ Fundamentals", "Java For Everybody", "HTML Guide", "CSS Handbook", "Learn JavaScript in 8 Days"};
// -------- Comment Ends Here --------------- //

int input;

int studentPanel();
int librarianPanel();
int error404();

int main()
{
    int num = 1;

    cout<<"(1) Student"<<endl;
    cout<<"(2) Librarian"<<endl;
    cout<<"(3) Exit"<<endl<<endl;
    cout<<"Your Input :";
    cin>>input;

    if(input==1){
        studentPanel();
    }

    else if(input==2){
        librarianPanel();
    }

    else if(input==3){
        terminate;
    }

    else{
        error404();
    }

    return 0;
}

int studentPanel()
{
    cout<<"(1) Books List"<<endl;
    cout<<"(2) Issue/Borrow Book"<<endl;
    cout<<"(3) Return Book"<<endl;
    cout<<"(4) Request Book"<<endl<<endl;
    cout<<"Your Input :";
    cin>>input;

    if(input == 1){
        int num = 1;
        int i = 0;
        while(book){
            cout<<"("<<num<<") "<<book[i]<<endl;
            num++;
            i++;
        }
    }
}

int librarianPanel()
{
}

int error404()
{
    system("cls");
    cout<<"ERROR: INCORRECT INPUT!"<<endl<<endl;
    system("pause");
    main();
}