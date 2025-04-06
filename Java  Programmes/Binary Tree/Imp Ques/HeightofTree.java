

public class HeightofTree {
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

                  public static int height(Node root){
                    if(root==null){
                              return 0;
                    }
                    int leftHeight=height(root.right);
                    int rightHeight=height(root.left);

                    int max=Math.max(leftHeight , rightHeight)+1;
                    return max;
                  }

                 
          }
          public static void main(String[] args) {
                    int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
                    BinaryTree  tree=new BinaryTree();
                    Node root=tree.Buildtree(nodes);
                    System.out.println(root.data);
                    System.out.println("Height of the tree"+ BinaryTree.height(root));

              
          }
}
