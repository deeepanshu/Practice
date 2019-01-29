l = [1,3,-1]
max_diff = -1000000000
for i in range(len(l)):
    for j in range(i):
        if i>=j:
            x = abs(l[i] - l[j]) + abs(i - j)
            if x > max_diff:
                max_diff = x
print(max_diff)

'''
max1 = -2147483648
    min1 = +2147483647
    max2 = -2147483648
    min2 = +2147483647
   
    for i in range(len(array)): 
  
   
        # Updating max and min variables 
        # as described in algorithm. 
        max1 = max(max1, array[i] + i) 
        min1 = min(min1, array[i] + i) 
        max2 = max(max2, array[i] - i) 
        min2 = min(min2, array[i] - i) 
      
   
    # Calculating maximum absolute difference. 
    return max(max1 - min1, max2 - min2) 
    '''