l = [[1,2,3],[4,5,6],[7,8,9]]
for i in range(len(l[0])):
    for j in range(len(l[0])-1,(len(l[0])//2) , -1):
        for k in range(len(l[0])):
            temp = l[i][j]
            l[i][j] = l[j][k]
            l[j][k] = temp
for i in range(len(l[0])):
    for j in range(len(l[0])):
        print(l[i][j], end=" ")
    print()