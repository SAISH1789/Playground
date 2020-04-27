#include<iostream>
int main()
{
  int a,b,c;
  std::cout<<"Enter first number : Enter second number : Menu";
  std::cout<<"\n1.Addition"<<"\n2.Subtraction"<<"\n3.Multiplication"<<"\n4.Division"<<"\n5.Remainder"<<"\n";
  std::cin>>a>>b>>c;
  switch(c)
  {
    case 1:
      a=a+b;
      std::cout<<a;
      break;
    case 2:
      a=a-b;
      std::cout<<a;
      break;
    case 3:
      a=a*b;
      std::cout<<a;
      break;
    case 4:
      a=a/b;
      std::cout<<a;
      break;
    case 5:
      a=a%b;
      std::cout<<a;
      break;
    default:
      std::cout<<"Invalid operation";
  }
}
      
      



