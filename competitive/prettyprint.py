A = 4
l = [ [0]*((2*A) - 1) for _ in range(((2*A) - 1)) ]
top = 0;
bottom = len(l) - 1
left = 0
right = len(l[0]) - 1
way = 0

while(top <= bottom and left <= right):
    if way == 0:
        for i in range(left, right + 1 ):
            l[top][i] = A
        top += 1
    elif way == 1:
        for i in range(top, bottom + 1 ):
            l[i][right] = A
        right -= 1
    elif way == 2:
        for i in range(right , left-1, -1):
            l[bottom][i] = A
        bottom -= 1;
    elif way == 3:
        for i in range(bottom , top -1 , -1):
            l[i][left] = A
        left += 1
    way = (way + 1) % 4
    if way == 0:
        A-=1
print(l)