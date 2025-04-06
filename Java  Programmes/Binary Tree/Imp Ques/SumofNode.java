

public class countNode {
          static class Node{
                    int data;
                    Node left;
                    Node right;
                    Node(int data){
                              this.data=data;
                              this.left=null;
                              this.right=null;
                    }
          }
          static class BinaryTree{
                  static  int idx=-1;
                  public static Node Buildtree(int nodes[]){
                     idx++;
                     if(nodes[idx]==-1){
                              return null;
                     }
                     Node newnode=new Node(nodes[idx]);
                     newnode.left=Buildtree(nodes);
                     newnode.right=Buildtree(nodes);

                     return newnode; 

                  }

                  // node count 

                  

                  public static int  SumOfNode(Node root){
                    if(root==null){
                              return 0;
                    }
                    int leftsum=SumOfNode(root.left);
                    int rightsum=SumOfNode(root.right);

                    return leftsum+rightsum+root.data;

                  }
          }
          public static void main(String[] args) {
                    int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
                    BinaryTree  tree=new BinaryTree();
                    Node root=tree.Buildtree(nodes);
                    System.out.println(root.data);
                    
                    System.out.println("Sum of Binary tree "+BinaryTree.SumOfNode(root));

              
          }
          
}
