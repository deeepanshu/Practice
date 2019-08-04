#include<bits/stdc++.h>
using namespace std;

int min(int a, int b){
    return a<b?a:b;
}
int max(int a, int b){
    return a>b?a:b;
}
int main(){
    int n;
    cin>>n;
    int *arr = new int[n];
    for(int i=0; i<n; i++) {
        cin>>arr[i];
    }
    for(int i=0; i<n; i++) {
        for(int j = (i+1);j<n;j++){
            if(arr[i]+arr[j] == 0){
                cout<<min(arr[i], arr[j])<<" "<<max(arr[i], arr[j])<<endl;
            }
        }
    }
    return 0;
}