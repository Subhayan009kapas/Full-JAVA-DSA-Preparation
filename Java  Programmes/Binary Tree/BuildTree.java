class BuildTree{
          static class Node {
                    int data;
                    Node left ;
                    Node right;

                    Node(int data){
                              this.data=data;
                              this.left=null;
                              this.right=null;
                    }
          }
          static class BinaryTree{
                    static int idx=-1;
                    public static Node treeBuild(int nodes[]){
                              idx++;
                            if(nodes[idx]==-1){
                              return null;
                            }

                            Node newnode=new Node(nodes[idx]);
                            newnode.left=treeBuild(nodes);
                            newnode.right=treeBuild(nodes);

                            return newnode;




                    }

                    public static void preorder(Node root){
                              if(root==null){
                                        return;
                              }
                              System.out.print(root.data+" ");
                              preorder(root.left);
                              preorder(root.right);

                    }

                    public static void Inorder(Node root){
                              if(root==null){
                                        return;
                              }
                              Inorder(root.left);
                              System.out.print(root.data+" ");
                              Inorder(root.right);
                    }

                    public static void Postorder(Node root){
                              if(root==null){
                                        return ;
                              }
                              Postorder(root.left);
                              Postorder(root.right);
                              System.out.print(root.data+" ");
                    }
          }
          public static void main(String[] args) {
                    int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
                    BinaryTree tree=new BinaryTree();
                    Node root=tree.treeBuild(nodes);
                    System.out.println(root.data);
                    
                    System.out.println("Preorder traversal");
                   BinaryTree.preorder(root);

                   System.out.println();
                   System.out.println("Inorder traversal");
                   BinaryTree.Inorder(root);

                   System.out.println();
                   System.out.println("Postorder traversal");
                   BinaryTree.Postorder(root);
                    


              
          }
}