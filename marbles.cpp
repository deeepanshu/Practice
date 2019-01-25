#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
	cin>>n;
	// n = 10;
	int sum ;
	cin>>sum;
	int *arr = new int[n];
	// int arr[] = {9,1,2,3,4,5,5,16,17,19};
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	int f = -1;
	for(int i=0;i<n;i++){
		int s = 0;
		for(int j=i;j<n;j++){
			for (int k = i; k <= j; k++){
				s += arr[k];
				if (s == sum){
					f = 1;
					cout<<"true"<<endl;
					for(int ii = i;ii<=j;ii++){
						cout<<arr[ii];
					}
					return 0;
				}
			}
			s=0;
		}
	}
	if(f == -1){
		cout<<"false";
	}
	return 0;
}
