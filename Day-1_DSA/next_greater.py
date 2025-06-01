#3. Next Greater Element
#Given a circular array, find the next greater number for every element.
#231 -> 312

def greater(n):
    s = list(map(int, str(n)))
    length = len(s)
    for i in range(length - 2, -1, -1):
        if s[i] < s[i + 1]:
            break
    else:
        print(n)
        return
    for j in range(length - 1, i, -1):
        if s[j] > s[i]:
            s[i], s[j] = s[j], s[i]
            break
    s[i + 1:] = s[i + 1:][::-1]
    result = int("".join(map(str, s)))
    print(result)
greater(967)

#output:
#976
            
