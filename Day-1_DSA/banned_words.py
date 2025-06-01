'''
Problem 10
Given a string paragraph and a string array of the banned words banned, return the most frequent word 
that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is 
unique.
The words in paragraph are case-insensitive and the answer should be returned in lowercase
'''
import re
from collections import Counter
def banned_words(p,b):
    p=re.findall(r'\w+',p.lower())
    l=[i for i in p if i not in b]
    cnt=Counter(l)
    #print(cnt)
    for i in cnt:
        if cnt[i]==max(cnt.values()):
            return i
            
paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
banned = ["hit"]
print(banned_words(paragraph, banned))

#output
#ball
