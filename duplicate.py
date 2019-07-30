
def MissingNumber(arr):
    n = len(arr)
    su = ((n-1)*(n-2))//2
    return (sum(arr)-su)


n = int(input())
arr = list(int(i) for i in input().strip().split(' '))
ans = MissingNumber(arr)
print(ans)
