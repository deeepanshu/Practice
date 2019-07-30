#include<bits/stdc++.h>
using namespace std;
int digitSum(int n){
  if(n==0) return 0;
  return (n%10 + digitSum((int)(n/10)));
}
int main() {
	int n;
  cin>>n;
  int *arr = new int[n];
  for(int i=0;i<n;i++){
    cin>>arr[i];
  }
  for(int i=0;i<n;i++){
    cout<<digitSum(arr[i])<<endl;
  }
	// Write your code here
}