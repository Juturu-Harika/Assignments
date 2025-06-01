'''
Problem 9
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
'''

def last_wpord(s):
    s=s.strip()
    l=s.split(" ")
    return l[-1]
    
s = " fly me to the moon "
print(last_wpord(s))

#output
#moon
