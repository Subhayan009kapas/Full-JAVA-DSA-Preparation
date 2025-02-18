



public class Single_LinkedList_01 {
          Node head;
          class Node{
                    String data ;
                    Node next;

                    Node(String data){
                              this.data=data;
                              this.next=null;
                    }
          }
          //add first position
          public void addFirst(String data){
                    Node newNode=new Node(data);
                    if(head==null){
                              head=newNode;
                              return;
                              

                    }
                    newNode.next=head;
                    head=newNode;


          }

          //ad last 
          public void addLast(String data){
                    Node newNode=new Node(data);
                    if(head==null){
                              head=newNode;
                              return;
                    }
                    Node curNode=head;
                    while(curNode.next!=null){
                              curNode=curNode.next;
                    }
                    curNode.next=newNode;
                    

          }
          public void printList(){

                    if(head==null){
                              System.out.println("List is empty");
                              return;
                    }

                    Node curNode=head;
                    while(curNode!=null){
                              System.out.print(curNode.data+"->");
                              curNode=curNode.next;
                    }
                    System.out.println("Null");

          }
          public static void main(String[] args) {
              Single_LinkedList_01 s1=new Single_LinkedList_01();
              //insert  print  delete  size check
              s1.addFirst("a");
              s1.addFirst("is");
              s1.printList();
              s1.addLast("bad boy");
              s1.printList();



          }
          
}
