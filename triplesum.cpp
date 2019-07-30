#include<bits/stdc++.h>
using namespace std;
#include<bits/stdc++.h>
// arr - input array
// size - size of array
// x - sum of triplets

void FindTriplet(int arr[], int n, int sum) {
    /* Don't write main().
     * Don't read input, it is passed as function argument.
     * Print output and don't return it.
     * Taking input is handled automatically.
     */
  
	for (int i = 0; i < n - 1; i++) { 
        unordered_set<int> s; 
        for (int j = i + 1; j < n; j++) { 
            int x = sum - (arr[i] + arr[j]); 
            if (s.find(x) != s.end()){
              int si = x+arr[i]+arr[j];
              int mi = min(x,arr[i],arr[j]);
              int ma = max(x,arr[i],arr[j]);
              int md = si - mi - ma;
              printf("%d %d %d\n", mi, md, ma); 
            }
            else
                s.insert(arr[j]); 
        } 
    }
}



int min(int a, int b, int c){
  if(a < b && a < c)
	{
		return a;
	}
	else if(b < c)
	{
		return b;
	}
	else
	{
		return c;
	}
}
int max(int a, int b, int c){
  if(a > b && a > c)
	{
		return a;
	}
	else if(b > c)
	{
		return b;
	}
	else
	{
		return c;
	}
}
int main(){
    int n, x;
    cin>>n;
    int *arr = new int[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cin>>x;
    findTriplets(arr, n, x);
    return 0;
}