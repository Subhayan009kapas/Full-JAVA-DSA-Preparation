
public class CircularQueueUsingArray {
          static class Queue{
                    static int arr[];
                    static int size;
                    static int front=-1;
                    static int rear=-1;

                    Queue(int size){
                              arr=new int[size];
                              this.size=size;

                    }

                    public static boolean  isEmpty(){
                              return rear==-1 && front==-1;
                    }
                    public static boolean isFull(){
                              return (rear+1)%size == front;
                    }

                    public static void add(int data){
                              if(isFull()){
                                        System.out.println("Queue is full");
                                        return;
                              }
                              if(front==-1){
                                        front=0;
                              }
                              rear=(rear+1)%size;
                              arr[rear]=data;
                    }

                    public static int deque(){
                             
                              if(isEmpty()){
                                        System.out.println("empty");
                                        return -1;
                              }
                              int res=arr[front];
                              if(front==rear){
                                        front=-1;
                                        rear=-1;
                              }else{
                                        front=(front+1)%size;
                              }

                              return res;
                    }

                    public static int peek(){
                              if(isEmpty()){
                                        return -1;
                              }
                              return arr[front];
                    }

                    
          }
          public static void main(String[] args) {
                    Queue q=new Queue(4);
                    q.add(1);
                    q.add(2);
                    q.add(3);
                    q.add(4);
                   System.out.println("Deleted element "+q.deque());
                   q.add(5);
                   System.out.println("delete "+q.deque());
                   q.add(6);
                  

                    while(!q.isEmpty()){
                              System.out.println(q.peek());
                             q.deque();
                    }
              
          }
}
