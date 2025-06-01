#8. Group Anagrams
#Given an array of strings, group the anagrams together.

def groupAnagrams(l):
    d={}
    for i in l:
        x="".join(sorted(i))
        if (x) in d:
            d[x].append(i)
        else:
            d[x]=[i]
    return list(d.values())
    
strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
print(groupAnagrams(strs))

#output:
#[['eat', 'tea', 'ate'], ['tan', 'nat'], ['bat']]
