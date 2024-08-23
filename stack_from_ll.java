
public class stack_from_ll 
{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        
        static class stack{
            static Node head=null;
            static Node secondLast=null;
            static Node currNode=null;
            
            public void push(int data){
                Node newnode=new Node(data);
                if(head==null){
                    head=newnode;
                    return;
                }
                
                currNode=head;
                while(currNode.next!=null){
                    secondLast=currNode;
                    currNode=currNode.next;
                }
                
                secondLast=currNode;
                currNode.next=newnode;
            }
            public void pop(){
                if(head==null){
                    System.out.println("stack is empty ");
                }
                else{
                    System.out.println("popped element is "+currNode.next.data);
                    secondLast.next=null;
                }
            }
            
            public void printAll(){
                Node curr=head;
                while(curr!=null){
                    System.out.print(curr.data+"->");
                    curr=curr.next;
                }
            }
            public void pushBottom(int data){
                Node newnode=new Node(data);
                if(head==null){
                    head=newnode;
                    return;
                }
                else{
                    newnode.next=head;
                    head=newnode;
                    return;
                }
            }
        }
	public static void main(String[] args) {
		stack s=new stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.printAll();
		System.out.println();

		s.pop();
		s.printAll();
		System.out.println();
		s.pushBottom(5);
		
		s.printAll();
	}
}
