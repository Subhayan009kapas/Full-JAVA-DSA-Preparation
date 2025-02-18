



public class LinkedList02 {
          Node head;
          private int size;

    public LinkedList02() {
          size=0;
    }
          

          class Node{
                    String data;
                    Node next;

                    Node(String data){
                              this.data=data;
                              this.next=null;
                              size++;

                    }



          }

          //add first

          public void addFirst(String data){
                    Node newNode=new Node(data);
                    if(head==null){
                              head=newNode;
                              return;
                    }
                    newNode.next=head;
                    head=newNode;
          }
          public void print(){
                    Node curnode=head;
                    if(head==null){
                              System.out.println("Empty");
                              return;
                    }
                    while(curnode!=null){
                              System.out.print(curnode.data+" ->");
                              curnode=curnode.next;
                    }
                    System.out.println("Null");
          }
          public void addLast(String data){

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

          //delete from first

          public void deleteFirst(){
                    if(head==null){
                              System.out.println("Empty list");
                              return;
                    }
                    head=head.next;
                    size--;
          }

          //delete from last

          public void deleteLast(){
                    if(head==null){
                              System.out.println("Empty list");
                              return;
                    }
                    Node p=head;
                    Node q=head.next;
                    size--;
                    if(head.next==null){
                              head=null;
                              return;
                    }
                    while(q.next!=null){
                              p=p.next;
                              q=q.next;
                    }
                    p.next=null;
                    
          }

          // mid elemet delete
          public void deleteAtIndex(int index){
                    if(head==null){
                              System.out.println("Null");
                              return;
                    }
                    Node p=head ;
                    Node q=head.next;
                    for(int i=0 ;i<index-1 ; i++){
                              p=p.next;
                              q=q.next;


                    }
                    p.next=q.next;
                    size--;
          }

          public int size(){
                    return size;

          }




          public static void main(String[] args) {
              LinkedList02 list=new LinkedList02();
              list.addFirst("A");
              list.addFirst("B");
              list.addFirst("C");
              list.print();
              list.addLast("e");
              list.print();
              list.deleteFirst();
              list.print();
              list.deleteLast();
              list.print();
              list.addLast("x");
              list.addLast("y");
              list.addLast("z");
              list.print();
              list.deleteAtIndex(2);
              list.print();
              System.out.println(list.size());



          }
          
}
