#include<bits/stdc++.h>
using namespace std;
int fun(vector<int> arr){
    int n = arr.size();
    for(int i = 0; i<n;i++){
        if(arr[abs(arr[i]) - 1] > 0){
            arr[abs(arr[i]) - 1] = -arr[abs(arr[i]) - 1];
        }
        else
        {
            cout<<abs(arr[i])<<" ";
        }
        
    }
    for(int i=0;i<n;i++){
        if (arr[i]>0){
            cout<<i+1;
        }
    }
}

int main(){
    vector<int> vect;
    vect.push_back(4);
    vect.push_back(3);
    vect.push_back(6);
    vect.push_back(2);
    vect.push_back(1);
    vect.push_back(1);
    fun(vect);
    return 0;
}