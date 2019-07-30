#include<bits/stdc++.h>
using namespace std;

int index(int t){
    int m = t%100;
    t = t/100;
    m = m + (t*60);
    return m;
}

int main(){
    vector<int> vec(1440, 0);
    int n,size;
    cin>>n;
    size = n;
    int max = 0;
    int *a1 = new int[size];
    int *a2 = new int[size];
    for(int i=0; i<n;i++){
        cin>>a1[i];
    }
    for(int i=0; i<n;i++){
        cin>>a2[i];
    }
    for(int i=0;i<n;i++){
        int s = index(a1[i]);
        int e = index(a2[i]);
        for(int j = s; j <= e; j++){
            vec[j] = vec[j]+1;
            if(max<vec[j]){
                max = vec[j];
            }
        }
    }
    cout<<max;
    return 0;
}