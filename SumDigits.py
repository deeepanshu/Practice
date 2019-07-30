
n = int(input())

for _ in range(n):
    s = str(input())
    su = 0
    for i in range(len(s)):
        su += int(s[i])
    print(su)
    

