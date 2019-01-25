#include<bits/stdc++.h>
using namespace std;

void Stock(int *arr, int n){
	int ind = 0;
	int maxProfit = 0;
	int i = 1;
	while(i<n){
		if(arr[i]<arr[ind]){
			ind = i;
		}
		int cp = arr[i] - arr[ind];
		if(cp>maxProfit){
			maxProfit = cp;
		}
		i++;
	}
	cout<<maxProfit;
}
int main(){
	int n;
	cin>>n;
	int *arr = new int[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	Stock(arr,n);
	return 0;
}

