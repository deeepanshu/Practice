#include<bits/stdc++.h>
using namespace std;
int sum(int arr[], int n){
	if(n<0) return 0;
	return arr[n - 1] + sum(arr, n-1);
}
int checknumber(int arr[], int n, int x){
	if (n<0) return -1;
	if (arr[n - 1] == x) return n-1;
	return checknumber((arr+1), n, x); 
}

int main(){

}