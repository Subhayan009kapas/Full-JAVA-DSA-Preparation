

public class Ques1 {
          Node head;
          class Node{
                    int data ;
                    Node next;
                    Node(int  data){
                              this.data=data;
                              this.next=null;
                    }
          }

          //Add first

          public void AddFirst(int data){
                    Node newNode=new Node(data);
                    if(head==null){
                              head=newNode;
                              return;
                    }
                    newNode.next=head;
                    head=newNode;
          }
          //AddLast
          public void AddLast(int data){
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
          public Node  findAndDelete(Node head , int n){
                    if(head.next==null){
                              return null;
                    }

                   
                    int size=0;
                    Node curnode=head;
                    while(curnode!=null){
                              curnode=curnode.next;
                              size++;
                    }

                    if(n==size){
                              return  head.next;
                    }


                    int targetIndex_prev=size-n;
                    Node prev=head;
                    for(int i=1;i<targetIndex_prev ;i++){
                              prev=prev.next;
                              
                    }
                    prev.next=prev.next.next;
                    return  head;

          }

     


          public static void main(String[] args) {
              Ques1 list=new Ques1();
              
            
              System.out.println();
              list.AddLast(1);
              list.AddLast(2);
              list.AddLast(3);
              list.AddLast(4);
              list.AddLast(5);
              list.print();
              System.out.println();
              list.head=list.findAndDelete(list.head, 3);
              list.print();
              System.out.println();

            


              
              

          }
}
