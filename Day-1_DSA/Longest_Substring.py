#7. Strings
#Longest Substring Without Repeating Characters
#Given a string, find the length of the longest substring without repeating characters.
st="q34werq567unxq345q1234567890q"
s=[]
for i in st:
    s.append(i)
#print(s)
m=1
l,r=0,1
while r<len(s)+1:
    #print(s[l:r])
    if len(s[l:r])!=len(set(s[l:r])):
        m=max(m,len(s[l:r-1]))
        #print(s[l:r-1])
        l=r-1
        r+=1
    else:
        r+=1
print(m)

#output:
#11
    
    
