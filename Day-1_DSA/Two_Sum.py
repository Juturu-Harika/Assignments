#1. Two Sum II - Input array is sorted
#Given a sorted array of integers, return the indices of the two numbers such that they add up to a specific target.

l=[int(i) for i in input().split()]
k=int(input("Enter the sum value:"))

def two_sum(l,k):
    d={}
    for i in range(0,len(l)):
        d[k-l[i]]=i
    for i in range(0,len(l)):
        if l[i] in d.keys():
            #print(d)
            return (i,d[l[i]])
            
print(two_sum(l,k))
