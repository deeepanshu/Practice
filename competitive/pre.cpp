#include<bits/stdc++.h>
using namespace std;
int main(){
  int n;
  cin>>n;
  int sum=0;
  for(int i = 0; i<n;i++){
    for(int j=0;j<n;j++){
      int ele;
      cin>>ele;
      if(i==j){
        sum += ele;
        continue;
      }
      if((i+j+1)%n == 0){
        sum += ele;
        continue;
      }
      if(i==0 || i==n-1){
        sum+=ele;
        continue;
      }
      if(j==0 || j==n-1){
        sum+=ele;
        continue;
      }
    }
  }
  cout<<sum<<endl;
  return 0;
}
