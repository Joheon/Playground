#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a=3,b=4;
  int x,y,l,m,j,r,z,f;
  std::cin>>x>>y;
  l=(x-a);
  m=(y-b);
  j=l*l;
  r=m*m;
  z=j+r;
  f=sqrt(z);
  std::cout<<f;
}