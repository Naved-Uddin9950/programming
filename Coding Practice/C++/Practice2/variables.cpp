#include<iostream>

using namespace std;

int main()
{
    string firstName, lastName;
    int rollNo;
    float marks;
    bool ans;
    char section;

    cout<<"Enter your first name: ";
    cin>>firstName;
    cout<<"Enter your last name: ";
    cin>>lastName;
    cout<<"Enter your roll no: ";
    cin>>rollNo;
    cout<<"Enter your section: ";
    cin>>section;
    cout<<"Enter your marks: ";
    cin>>marks;
    cout<<"Do you want to see your data? Type '1' for yes and '0' for no: ";
    cin>>ans;

    if (ans != true){
        cout<<"\n\n Your Don't want to see your data!";
    }
    else{
        cout<<"\n\nName: "<<firstName<<" "<<lastName<<endl;
        cout<<"Roll no: "<<rollNo<<endl;
        cout<<"Section: "<<section<<endl;
        cout<<"Marks: "<<marks<<endl;
    }
    return 0;
}