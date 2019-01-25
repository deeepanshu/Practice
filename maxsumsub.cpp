#include<bits/stdc++.h>
using namespace std;

vector<int> maxset(vector<int> &A){
	int s = 0;
	int max_sum = INT_MIN;
	int max_i=0,max_j;
	vector<int> vect; 
	for(int i = 0; i<A.size();i++){
		max_i = i;
		while(i < A.size() && A[i]>=0){
			s += A[i];
			i++;
		}
		if(s>= max_sum){
			max_sum = s;
			max_j = i-1;
		}
		s = 0;
	}
	cout<<max_i<<" "<<max_j;
	for(int ii = max_i;ii<=max_j;ii++){
		vect.push_back(A[ii]); 
	}
	return vect;
}
int main(){
	int n = 6;
	// int *A = new int[n];
	vector<int> A;
	A.push_back(0);
	A.push_back(0);
	A.push_back(-1);
	A.push_back(0);
	vector<int> B = maxset(A);
	for(int x=0; x<B.size();x++){
		cout<<B[x]<<" ";
	}
	return 0;
}

[1,2,3,-2,4,9,9,-2]