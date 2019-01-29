#include<bits/stdc++.h>
using namespace std;

int firstIndex(int input[], int size, int x){
    if(size == 0) return -1;
    if(input[0] == x) return 0;
    int ans = firstIndex(input+1, size-1, x);
    if(ans != -1) return ans+1;
    else return ans;
}

int main(){
    int a[] = {1,2,3,4,5,6,7};
    cout<<firstIndex(a, 7, 4);
    return 0;
}