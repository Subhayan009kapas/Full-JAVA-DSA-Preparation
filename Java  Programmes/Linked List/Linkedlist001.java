public class Linkedlist001 {
          Node head;
          class Node{
                    String data ;
                    Node next;
                    Node(String data){
                              this.data=data;
                              this.next=null;
                    }
          }

          //Add first

          public void AddFirst(String data){
                    Node newNode=new Node(data);
                    if(head==null){
                              head=newNode;
                              return;
                    }
                    newNode.next=head;
                    head=newNode;
          }
          //AddLast
          public void AddLast(String data){
                    Node newnode=new Node(data);
                    if(head==null){
                              head=newnode;
                              return;
                    }
                    Node curnode=head;
                    while(curnode.next!=null){
                              curnode=curnode.next;
                    }
                    curnode.next=newnode;
                    newnode.next=null;

          }
          //Reverse 
          public void Reverse(){

                    if(head==null){
                              return;
                    }
                    Node prev=head;
                    Node cur=head.next;
                    while(cur!=null){
                              Node next=cur.next;
                              cur.next=prev;

                              prev=cur;
                              cur=next;
                    }
                    head.next=null;
                    head=prev;

          }
          public Node RecursiveReverse(Node head){
                    if(head==null || head.next==null){
                              return head;
                    }
                    Node newhead=RecursiveReverse(head.next);
                    head.next.next=head;
                    head.next=null;
                    return newhead;

          }
          public void print(){
                    if(head==null){
                              System.out.println("Empty list ");
                              return;
                    }

                    Node curnode=head;
                    while(curnode!=null){
                              System.out.print(curnode.data+" ->");
                              curnode=curnode.next;
                    }
                    System.out.print("null");

          }

          public static void main(String[] args) {
              Linkedlist001 list=new Linkedlist001();
              list.AddFirst("A");
              list.AddFirst("B");
              list.AddFirst("C");
              list.print();
              System.out.println();
              list.AddLast("SK");
              list.print();
              System.out.println();
              list.Reverse();
              list.print();
              System.out.println();
              System.out.println("Result of Recursive Reverse ");
              list.head=list.RecursiveReverse(list.head);
              list.print();
              

          }
}
