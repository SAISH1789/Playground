#include<iostream>
int main()
{
  int num,n;
  std::cin>>num;
  std::cin>>n;
  if(n>0)
  {
    std::cout<<num<<" is eligible for reward.";
  }
  else
  {
    std::cout<<" ";
  }
  return 0;
}