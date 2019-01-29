#include <bits/stdc++.h>
using namespace std;

int findMissing(vector<int> &arr)
{
    int j = 0, i;
    for (i = 0; i < arr.size(); i++)
    {
        if (arr[i] <= 0)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
    }
    arr.erase(arr.begin(), arr.begin() + j);
    for (i = 0; i < arr.size(); i++)
    {
        cout << arr[i] << " ";
    }
    int size = arr.size();
    for (i = 0; i < arr.size(); i++)
    {
        if (abs(arr[i]) - 1 < size && arr[abs(arr[i]) - 1] > 0)
            arr[abs(arr[i]) - 1] = -arr[abs(arr[i]) - 1];
    }

    for (i = 0; i < size; i++)
        if (arr[i] > 0)
            return (i) + 1;

    return size + 1;
}


int main()
{
    vector<int> v;
    cout << endl
         << "SOL: " << findMissing(v);
}