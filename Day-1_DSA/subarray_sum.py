#2. Subarray Sum Equals K
#Given an array of integers and a target sum k, return the total number of continuous subarrays whose sum equals to k.

a=[int(i) for i in input().split()]
k=int(input('Enter the input value: '))
count=0
l,r=0,1
while r<len(a):
    x=sum(a[l:r+1])
    #print(sum(a[l:r+1]))
    if x==k:
        count+=1
        l+=1
        r+=1
    elif x>k:
        l+=1
    else:
        r+=1
print(count+a.count(k))
