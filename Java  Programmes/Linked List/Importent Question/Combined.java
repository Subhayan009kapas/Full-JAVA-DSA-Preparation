// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Combined {
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
             Node newnode=new Node(data);
             
             if(head==null){
                 head=newnode;
                 return;
                 
             }
             newnode.next=head;
             head=newnode;
         }
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
            
         }
         public Node findmid(Node head){
             Node hare=head;
             Node turtle=head;
             while(hare.next!=null && hare.next.next!=null){
                 hare=hare.next.next;
                 turtle=turtle.next;
             }
             return turtle;
         }
         
         public Node reverse_second_half(Node head){
             Node prev=null;
             Node cur=head;
             while(cur!=null){
                 Node next=cur.next;
                 cur.next=prev;
                 
                 prev=cur;
                 cur=next;
             }
            return prev; 
         }
         
      //   public boolean paliandrome(){
             
             
      //       if(head==null){
      //           return true;
      //       }
      //       Node middle=findmid( head);
      //       Node First_element_of_2nd_half=reverse_second_half(middle.next);
             
      //       Node First_elemnt_of_1st_half=head;
             
      //       while(First_element_of_2nd_half.next!=null){
      //           if(First_elemnt_of_1st_half.data!=First_element_of_2nd_half.data){
      //               return false;
      //           }
      //           First_elemnt_of_1st_half=First_elemnt_of_1st_half.next;
      //           First_element_of_2nd_half=First_element_of_2nd_half.next;
                 
      //       }
      //       return true;
             
             
      //   }
      
      //   public void reverse(){
      //       if(head==null || head.next==null){
      //           return ;
      //       }
      //       Node prev=head;
      //       Node cur=head.next;
      //       while(cur!=null){
      //           Node next=cur.next;
      //           cur.next=prev;
                 
      //           prev=cur;
      //           cur=next;
      //       }
      //       head.next=null;
      //       head=prev;
      //   }
      
      public void createCycle(){
          if(head==null){
              return;
          }
          
          Node p=head;
          Node q=head;
          int i=0;
          while(i<2){
              p=p.next;
              i++;
          }
        
          while(q.next!=null){
              q=q.next;
          }
          q.next=p;
          
          
      }
      public boolean checkCycle(){
          if(head==null){
              return false;
          }
          Node hare=head;
          Node turtle=head;
          
          while(hare.next!=null && hare.next.next!=null){
              hare=hare.next.next;
              turtle=turtle.next;
              
              if(hare==turtle){
                  return true;
              }
          }
          return false;
      }
         public void print(){
             if(head==null){
                 System.out.println("Empty list");
                 return;
             }
             Node curnode=head;
             while(curnode!=null){
                 System.out.print(curnode.data+" ->");
                 curnode=curnode.next;
             }
             System.out.print("null");
         }
         public static void main(String args[]){
             Main list=new Main();
            
             list.AddLast("a");
               list.AddLast("b");
                 list.AddLast("c");
                  list.AddLast("d");
               list.AddLast("e");
                 list.AddLast("f");
          //   list.print();
          //   System.out.println();
          //   list.reverse();
          //   list.print();
             
          //      System.out.println();
          //   if(list.paliandrome()){
          //       System.out.println("Palindrome String");
          //   }else{
          //       System.out.println("Not a apalindrome String");
          //   }
          list.print();
          list.createCycle();
          System.out.println();
          if(list.checkCycle()){
              System.out.println("Cycle is present");
          }else{
              System.out.println("Cycle is not presest");
          }
          
          
          
             
         }
      }