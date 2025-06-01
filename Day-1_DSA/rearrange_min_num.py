#9. Rearrange a no to find min possible no in o(n) and constant space.
 
#for eg input 
#1. 324 -> output 234
#2. 50221 - 01225

def find_min(num):
    count=[0]*10
    for i in str(num):
        count[int(i)] += 1
    res=[]
    '''
    for i in range(10):
        while count[i]>0:
            res+=str(i)
            count[i]-=1
    return (res)
    '''
    for i in range(10):
        res.extend([str(i)] * count[i])
    return ("".join(res))
print(find_min(5022221))

#output:
#0122225
