n = int(input())
li = {}
for _ in range(n):
    l = input()
    name = l.split(" ")[0]
    marks = int(l.split(" ")[1])+int(l.split(" ")[2])+int(l.split(" ")[3])
    if marks in li:
        li[marks].append(name)
    else:
        li[marks] = [name]
c = 1
for k in list(reversed(sorted(li.keys()))):
    for i in li[k]:
        print(str(c)+" "+i)
        c+=1
