#include<bits/stdc++.h>
using namespace std;

int recurse(int n){

    if (n< 5){
        return 0;
    }
    return (n/5 + (recurse(n/5)));
}
int main(){
    cout<<recurse(125);
}