#6. Remove Nth Node From End of List
#Given a linked list, remove the nth node from the end and return its head.

class node:
    def __init__(self,value):
        self.value=value
        self.next=None
class ll:
    def __init__(self):
        self.head=None
        self.len=0
        
    def add(self,value):
        self.len+=1
        if self.head==None:
            self.head=node(value)
        else:
            temp=self.head
            while temp.next!=None:
                temp=temp.next
            temp.next=node(value)
            
    def addn(self,n,value):
        target=self.len-n
        temp=self.head
        new_node=node(value)
        for i in range(target-2):
            temp=temp.next
        new_node.next=temp.next
        temp.next=new_node
    
    def remn(self,n):
        target=self.len-n
        temp=self.head
        for i in range(target-1):
            temp.next=temp.next.next
            
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
ll1.addn(1,5)
ll1.display()
ll1.remn(1)
ll1.display()

