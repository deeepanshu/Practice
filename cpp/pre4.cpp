#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
	cin>>n;
	int *arr = new int[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	for(int i=0;i<n/2;i++){
		int a = *(arr + i);
		int b = *(arr + (n - i - 1));
		cout<<(a+b)/10<<" "(a+b)%10<<endl;
	}
	return 0;
}
