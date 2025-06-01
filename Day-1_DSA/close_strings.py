'''
Two strings are considered close if you can swap letters or change the frequency of any 
letter to match the other string. Determine if two given strings are close.
Example 1:
• Input: word1 = "abc", word2 = "bca"
• Output: true
'''
from collections import Counter
def close_strings(w1,w2):
    if len(w1)!=len(w2):
        print('false')
    else:
        w1_count=Counter(w1)
        w2_count=Counter(w2)
        if Counter(w1_count.values())==Counter(w2_count.values()) and set(w1_count.keys())==set(w2_count.keys()):
            print('true')
        else:
            print('false')
w1,w2='aabbcc','xxyyzz'
close_strings(w1,w2)

#output:
#false
        
