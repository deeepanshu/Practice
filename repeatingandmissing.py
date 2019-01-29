l1 = [2,2]
l = [0 for i in range(len(l1))]
for i in l1:
    if l[i - 1] < 0:
        print(i)
    else:
        l[i-1] = -1
print(l)
for i in range(len(l)):
    if l[i] == 0:
        print(i+1)
        break