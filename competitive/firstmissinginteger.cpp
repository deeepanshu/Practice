#include <bits/stdc++.h>
using namespace std;

int firstMissing(vector<int> A)
{
    vector<int> vect(A.size(), 0);
    int max = 0;
    int x = 0;
    for (x = 0; x < A.size(); x++)
    {
        if (A[x] > max)
            max = A[x];
        if (A[x] > 0)
            vect[A[x]] = 1;
    }
    for (x = 1; x < vect.size(); x++)
    {
        if (vect[x] == 0)
        {
            return x;
        }
    }
    return max + 1;
}

int main()
{
    vector<int> v;
    cout<<"INSERTED";
    cout << firstMissing(v);
    return 0;
}