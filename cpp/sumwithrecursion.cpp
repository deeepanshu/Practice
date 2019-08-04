#include<bits/stdc++.h>
using namespace std;
int recurse(int a[], int n){
    // cout<<*(a)<<" ";
    if(n==0) return 0;
    return *(a) + recurse(a+1,n-1);
}

int main(){
    int a[] = {1,2,3,4,5,6,7};
    cout<<recurse(a,7);
}