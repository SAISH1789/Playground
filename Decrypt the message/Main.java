#include<iostream>
using namespace std;
int main()
{
  int hn,en,num,sum=0,div,i;
  cin>>en>>hn;
  num=hn+en;
  for(i=1;i<num;i++)
  {
    div=num%i;
    if(div==0)
      sum=sum+i;
  }
  if (sum==num)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}