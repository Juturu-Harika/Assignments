'''
5. Reorder List
Reorder a linked list from L0 → L1 → … → Ln-1 → Ln to L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → ….
'''

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
            
    def display(self):
        temp=self.head
        print(temp.value,end="->")
        while temp.next!=None:
            temp=temp.next
            print(temp.value,end="->")
        print()
    
    def reorder(self):
        if not self.head or not self.head.next:
            return
        #finding mid point
        temp=self.head
        slow,fast=self.head,self.head
        while fast!=None and fast.next!=None:
            slow=slow.next
            fast=fast.next.next
        #reversing the linkedlist
        curr=slow.next
        prev=None
        slow.next=None
        while curr:
            nex=curr.next
            curr.next=prev
            prev=curr
            curr=nex
        
        #reordering the linkedlist
        first=self.head
        second=prev
        while second:
            t1=first.next
            t2=second.next
            first.next=second
            second.next=t1
            first=t1
            second=t2
        
ll1=ll()
ll1.add(4)
ll1.add(2)
ll1.add(3)
ll1.add(6)
ll1.add(89)
ll1.add(65)
ll1.add(41)
ll1.display()
ll1.reorder()
ll1.display()

#output:
#4->2->3->6->89->65->41->
#4->41->2->65->3->89->6->
