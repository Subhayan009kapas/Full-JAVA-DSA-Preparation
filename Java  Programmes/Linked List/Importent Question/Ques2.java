



public class Ques2 {
          Node head;
          class Node{
                    int data ;
                    Node next ;
                    Node(int data){
                              this.data=data;
                              this.next=null;
                    }
          }
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
                              System.out.println("Empty list");
                              return;
                    }
                    Node curnode=head;
                    while(curnode!=null){
                              System.out.print(curnode.data+" -> ");
                              curnode=curnode.next;
                    }
                    System.out.print("null");
          }
       
          public Node reverse(Node head){
                    Node prev=null;
                    Node cur=head;
                    while(cur!=null){
                              Node next=cur.next;
                              cur.next=prev;
                              prev=cur ;
                              cur=next;
                    }
                    return prev;
          }
          public Node findMiddle(Node head){
                    Node hare=head;
                    Node turtle=head;
                    while(hare.next!=null && hare.next.next!=null){
                              turtle= turtle.next;
                              hare=hare.next.next;

                    }
                    return  turtle;
          }

          public boolean  isPalindrome(){
                    if(head==null || head.next==null){
                              return true;
                    }
                    Node middle=findMiddle(head);//1st half end 
                    Node Secone_half_first=reverse(middle.next);

                    Node First_half_first=head;
                    while(Secone_half_first.next!=null){
                              if(First_half_first.data!=Secone_half_first.data){
                                        return false;
                              }
                              First_half_first=First_half_first.next;
                              Secone_half_first=Secone_half_first.next;
                    }
                    return true;
          }
          public static void main(String args[]){
                    Ques2 list=new Ques2();
                    list.AddLast(1);
                    list.AddLast(0);
                    list.AddLast(0);
                    list.AddLast(0);
                    list.AddLast(1);
                    list.print();
                    System.out.println();
                  

                    if(list.isPalindrome()){
                              System.out.println("yes it's a plaindrome number ");
                    }else{
                              System.out.println("Not apalindrom number  ");
                    }


          }
}
