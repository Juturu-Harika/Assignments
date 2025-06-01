'''
Problem 8
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or 
-1 if needle is not part of haystack.
'''

def haystack(n,h):
    for i in range(len(h)-len(n)+1):
        #print(h[i:i+len(n)])
        if h[i:i+len(n)]==n:
            return i
    return -1
    
h = "sabutsad"
n = "sad"
print(haystack(n,h))

#output
#5
