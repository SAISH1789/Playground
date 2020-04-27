#include<iostream>
using namespace std;
int main(){
  int n,i,result=1;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    result=result*i;
  }
  cout<<result;
} 