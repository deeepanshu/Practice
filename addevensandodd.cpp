#include<bits/stdc++.h>
using namespace std;
int main()
{

  int a = 0, b = 0, c;
  int n;
  cin>>n;
  for(int i=0;i<n;i++){
    cin>>c;
    if(i%2==0 && c%2==0){
      a = a + c;
      //cout<<"EVEN"<<a<<" "<<c<<endl;
    }
    else if (i%2!=0 && c%2!=0){
      b = b + c;
      //cout<<"ODD"<<b<<" "<<c<<endl;
    }
  }
  cout<<a<<" "<<b;
	return 0;
}
