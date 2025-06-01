'''
Given two strings ss and tt, determine if tt is an anagram of a substring of ss. In other 
words, check if there exists a substring in ss that is an anagram of t
'''
from collections import Counter
def anagram_substring(s,t):
    td=Counter(t)
    for i in range(len(s)-len(t)+1):
        if Counter(s[i:i+len(t)])==td:
            return True
    return False

s = "abacbabc"
t = "abc"
print(anagram_substring(s,t))

#output:
#True
    
    
            
            
            
