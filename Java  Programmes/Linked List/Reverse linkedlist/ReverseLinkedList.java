



public class ReverseLinkedList {
          Node head;
          class Node{
                    String data;
                    Node next;
                    Node(String data){
                              this.data=data;
                              this.next=null;
                    }
          }
          public void AddFirst(String data){
                    Node curNode=new Node(data);
                    if(head==null){
                              head=curNode;
                              return;

                    }
                    curNode.next=head;
                    head=curNode;
          }
          public void AddLast(String data){
                    Node newnode=new Node(data);
                    if(head==null){
                              head=newnode;
                              return;

                    }
                    Node curNode=head;
                    while(curNode.next!=null){
                              curNode=curNode.next;
                    }
                    curNode.next=newnode;
                    newnode.next=null;
          }
          public void newReverse(){
                    if(head==null || head.next==null){
                              return;
                    }
                    Node prev=head;
                    Node curr=head.next;
                    while(curr!=null){
                              Node next=curr.next;
                              curr.next=prev;

                              //update
                              prev=curr;
                              curr=next;
                    }
                    head.next=null;
                    head=prev;
          }

          public void reverse(){
                    if(head==null || head.next==null){
                              return;
                    }
                    Node prevnode=head;
                    Node curnode=head.next;

                    while(curnode !=null){
                              Node nextnode=curnode.next;
                              curnode.next=prevnode;

                              prevnode=curnode;
                              curnode=nextnode;
                    }
                    head.next=null;
                    head=prevnode;
                    

          }
          public Node reverseRecursive(Node head){
                    if(head==null || head.next==null){
                              return head;
                    }
                    Node newHead=reverseRecursive(head.next);
                    head.next.next=head;
                    head.next=null;

                    return newHead;

          }
          public void print(){
                    if(head==null ){
                              System.out.println("empty");
                              return;
                    }
                    Node curNode=head;
                    while(curNode!=null){
                              System.out.print(curNode.data+" -> ");
                              curNode=curNode.next;
                    }
                    System.out.println("Null");

          }
          public static void main(String[] args) {
              ReverseLinkedList s1=new ReverseLinkedList();
              s1.AddFirst("a");
              s1.print();
              s1.AddLast("b");
              s1.AddLast("c");
              s1.AddLast("d");
              s1.AddLast("e");
              s1.print();
              s1.reverse();
              s1.print();
          
              s1.newReverse();
              s1.print();



          }
}
