'''Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input 
string is valid.
A string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.
'''
def valid_brackets(l):
    stack=[]
    for i in l:
        if i=='(' or i=="[" or i=='{':
            stack.append(i)
            #print(stack)
        elif i==')':
            if stack[-1]=='(':
                stack.pop()
            else:
                print('()')
                return False
        elif i==']':
            if stack[-1]=='[':
                stack.pop()
            else:
                print('[]')
                return False
        elif i=='}':
            if stack[-1]=='{':
                stack.pop()
            else:
                print('{}')
                return False
    if stack:
        return False
    return True
    
s="()[]{}"
print(valid_brackets(s))

#output:
#True
    
