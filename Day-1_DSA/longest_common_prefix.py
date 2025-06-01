'''
Problem 7
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
'''

def longest_common_prefix(l):
    st=l[0]
    res=""
    for i in range(len(st)):
        for j in l[1:]:
            if i > len(j) or st[i] != j[i]: 
                return res
        res += st[i]
    return res
print(longest_common_prefix(["flower","flow","flight"]))

#output:
#fl
