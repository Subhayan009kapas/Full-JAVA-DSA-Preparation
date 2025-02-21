

public class Ques2Another {
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
          public Node findmidddle(Node head){
                    Node hare=head;
                    Node turtle=head;
                    while(hare.next!=null && hare.next.next!=null){
                              hare=hare.next.next;
                              turtle=turtle.next;
                    }

                    return  turtle;

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
                    return  prev;
          }
          public boolean  palindrome(){
                    if(head==null || head.next==null){
                              return true;
                    }
                    //Middle
                    Node middle=findmidddle(head);
                    //2nd half reverse 
                    Node secHalf_firstElement=reverse(middle.next);
                    Node firstHalf_firstElement=head;
                    while(secHalf_firstElement.next!=null){
                              if(firstHalf_firstElement.data!=secHalf_firstElement.data){
                                        return  false;

                              }
                              firstHalf_firstElement=firstHalf_firstElement.next;
                              secHalf_firstElement=secHalf_firstElement.next;
                    }
                    return  true;
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
                              System.out.println("Yes it si palindrome");
                    }else{
                              System.out.println("Not palin drome ");
                    }
                  



          }
}
