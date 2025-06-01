#4. Linked Lists
#Add Two Numbers
#You are given two non-empty linked lists representing two non-negative integers. Add the two numbers and return the sum as a linked list.
class node:
    def __init__(self,value):
        self.value=value
        self.next=None
class ll:
    def __init__(self):
        self.head=None
    def add(self,value):
        if self.head==None:
            self.head=node(value)
        else:
            temp=self.head
            while temp.next!=None:
                temp=temp.next
            temp.next=node(value)
        print("added")
            
    def display(self):
        temp=self.head
        print(temp.value,end="->")
        while temp.next!=None:
            temp=temp.next
            print(temp.value,end="->")
        print()
ll1=ll()
ll1.add(4)
ll1.add(2)
ll1.add(3)
ll1.display()

ll2=ll()
ll2.add(1)
ll2.add(3)
ll2.add(7)
print(ll2.head.value)
ll2.display()

ll3=ll()

def summll(ll1,ll2,ll3):
    temp1,temp2=ll1.head,ll2.head
    carry=0
    while temp1!=None or temp2!=None:
        temp3=temp1.value+temp2.value+carry
        if temp3>9:
            temp3=temp3-10
            carry=1
        else:
            carry=0
         if temp1 is not None:
            temp1 = temp1.next
        if temp2 is not None:
            temp2 = temp2.next
        ll3.add(node(temp3))
    if carry:
        ll3.add(carry)
    ll3.display()
    
summll(ll1,ll2,ll3)

#output
#5->5->0->1

    
        
    
    
