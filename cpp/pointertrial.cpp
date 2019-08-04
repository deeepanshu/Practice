#include<bits/stdc++.h>
using namespace std;
/*
        if(size == 0) return -1;
    if(input[0] == x) return 0;
    int ans = firstIndex(input+1, size-1, x);
    if(ans != -1) return ans+1;
    else return ans;*/

int findAllIndexes(int input[], int size, int x, int found[]){

    if(size == 0) return -1;
    if(input[0] == x) return 0;
    int ans = findAllIndexes(input+1, size-1, x, found);
    if(ans != -1) {*found = ans+1; found++;};
    cout<<*found<<endl;
    return ans;
}

int main(){
    int arr[2];
    arr[0] = 5;
    arr[1] = 10;
    arr[2] = 5;
    arr[3] = 15;
    arr[4] = 20;
    int found[5];
    findAllIndexes(arr, 5, 5, found);
    for(int i=0;i<5;i++){
        cout<<found[i]<<" ";
    }
    return 0;
}
