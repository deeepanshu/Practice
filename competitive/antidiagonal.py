l = [[1,2,3],[4,5,6],[7,8,9]]
# ll = []
# for i in range(len(l)):
#     li = []
#     for j in range(len(l)):
#         if (i+j)<=(len(l)-1):
#             print(l[i][j])
#             li.append(l[i][j])
#     ll.append(li)
# print(ll)
i = 0
j = 0
while i<len(l):
    t = i
    while i<len(l) and j<len(l):
        print(l[i][j])
        i+=1
        j-=1
    i = t+1