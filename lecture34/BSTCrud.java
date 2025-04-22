class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class BSTCrud {
    TreeNode root;
    // insertion // Creation
    public void insert(int data){
        root=insertPosition(root,data);
    }
    public TreeNode insertPosition(TreeNode node, int data){
        if(node==null) return new TreeNode(data);
        if(data<node.data){
            node.left=insertPosition(node.left, data);
        }else if(data>node.data){
            node.right=insertPosition(node.right, data);
        }
        return node;
    }
    // Read
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
    public static void main(String args[]){
        BSTCrud bst= new BSTCrud();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(16);
        bst.insert(4);
        bst.insert(1);
        bst.inorder(bst.root);
    }
}
