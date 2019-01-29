import sys
l = [-2, -3, 4, -1, -2, 1, 5, -3]
max_sum = -sys.maxint
max_ending_here = 0
for i in range(len(l)):
    max_ending_here = max_ending_here + l[i]
    if max_sum < max_ending_here:
        max_sum = max_ending_here
    
    if max_ending_here < 0:
        max_ending_here = 0

print(max_sum)