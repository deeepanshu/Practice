l = [ 1, 1, 4, 6, 8, 8, 13, 13, 13, 14, 17, 18, 14 ]


def subUnsort():
    flag = -1
    x = 0
    y = len(l) -1
    for x in range(1,len(l)):
        if l[x-1] > l[x]:
            flag = 1
            break
    x -=1
    if flag == -1:
        return [-1]
    # if x == len(l) -1:
    #     return [-1]
    
    y = len(l)-1
    while y>0:
        if l[y] < l[y-1]:
            break
        y-=1
    ma = mi = l[x]
    for i in range(x+1,y+1):
        ma = max(l[i], ma)
        mi = min(l[i], mi)

    for i in range(x):
        if l[i] > mi:
            x = i
            break
    i = len(l) -1
    while i>=y-1:
        if l[i]<ma:
            y = i
            break
        i-=1
    return [x,y]
print(subUnsort())