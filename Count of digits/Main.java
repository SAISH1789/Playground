#include<iostream>
using namespace std;
int main()
{
  int input,flag=0;
  cin>>input;
  do
  {
    input=input/10;
    flag++;
  }
  while(input!=0);
  cout<<flag;
}