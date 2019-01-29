l = "01011"
m = []
for i in range(len(l)):
    m.append(int(-1) if l[i] == '1' else int(1))
max_s = -100000000000
curr = 0
left = right = leftAns = rightAns = 0
print(m)
for i in range(len(m)):
    curr += m[i]
    if curr < 0:
        left = i+1
        curr = 0

    if curr > max_s:
        leftAns = left
        rightAns = i
        max_s = curr
        
if max_s <= 0:
    return []
else:
    return [leftAns+1, rightAns+1]

print(max_s)
print(max_end)
