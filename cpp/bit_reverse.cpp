#include<bits/stdc++.h>
using namespace std;

int main() {
    unsigned int a = 3;
    unsigned int b = 0;
    while (a) {
        unsigned int d = a & 1;
        cout<<"A "<< d<<"\n";
        a  = b >> 1;
        cout<< "Remaining A"<<a
        b = b << d;
        cout<<b;
    }
}