#include<iostream>
#include<string>
#include<windows.h>

using namespace std;

int error404();
int exit();
int dev();
int admin();
int user();
int lib();

int input;

int main()
{
	system("cls");
	cout<<"\t\t\tLibrary Management System"<<endl<<endl;
	cout<<"(1) Admin Panel"<<endl;
	cout<<"(2) User Panel"<<endl;
	cout<<"(3) About Developer"<<endl;
	cout<<"(4) Exit"<<endl<<endl;
	cout<<"Your Input :";
	cin>>input;

	if(input==1){
		admin();
	}
	else if(input==2){
		user();
	}
	else if(input==3){
		dev();
	}
	else if(input==4){
		exit();
	}
	else{
		error404();
	}

	return 0;
}

// This (Admin) function is still in development
int admin()
{
	system("cls");
	cout<<"\t\t\tLibrary Management System --- Admin"<<endl<<endl;
}

// This (User) function is still in development
int user()
{
	system("cls");
	cout<<"\t\t\tLibrary Management System --- User"<<endl<<endl;
	cout<<"(1) Show Books List"<<endl;
	cout<<"(2) Issue/Borrow Book"<<endl;
	cout<<"(3) Return Book"<<endl;
	cout<<"(4) Request Book"<<endl;
	cout<<"(5) Back"<<endl;
	cout<<"(6) Exit"<<endl<<endl;
	cout<<"Your Input :";
	cin>>input;

	if(input==1){
		lib();
	}
	else if(input==2){

	}
	else if(input==3){
		
	}
	else if(input==4){
		
	}
	else if(input==5){
		main();
	}
	else if(input==6){
		exit();
	}
	else{
		error404();
	}
}

// Library Function --- To manage book list
// This function is also in development
int lib()
{
	string books[100] = {"C", "C++", "Python", "HTML", "CSS", "JavaScript", "C#", "Django", "NodeJs", "ReactJs"};
	for(int i=0;i<=100;i++){
		if(books[i] != NULL){
			cout<<books[i]<<endl;
		}
	}
}




int error404()
{
	system("cls");
	cout<<"\t\t\tSomething Went Wrong"<<endl<<endl;
	cout<<"ERROR: INCORRECT INPUT"<<endl<<endl;
	system("pause");
	main();
}

int exit()
{
	system("exit");
}

int dev()
{
	system("cls");
	cout<<"\t\t\tAbout Developer"<<endl<<endl;
	cout<<"Name    : Naved Uddin"<<endl;
	cout<<"D.O.B   : 29 May 2003"<<endl;
	cout<<"Position: Founder, CEO"<<endl;
	cout<<"Contact : naveduddin83@gmail.com"<<endl<<endl<<endl;
	cout<<"(1) Back"<<endl;
	cout<<"(2) Exit"<<endl<<endl;
	cout<<"Your Input :";
	cin>>input;

	if(input==1){
		main();
	}
	else if(input==2){
		exit();
	}
	else{
		error404();
	}
}