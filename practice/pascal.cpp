#include<iostream>
using namespace std;
int main()
{
    for(int i=0;i<5;i++)
    {
        int first=1;
        for(int k=0;k<5-i;k++)
        {
            cout<<" ";
        }
        for(int j=0;j<=i;j++)
        {
            cout<<first<<" ";
            first=first*(i-j)/(j+1);
        }
        cout<<endl;
    }
}