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
public class BinaryTreeEx {
    static void preorder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" "); // first root node
        preorder(root.left);
        preorder(root.right);
    }
    static void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);  // left 
        System.out.print(root.data+" "); // first root node
        inorder(root.right); // right
    }
    static void postorder(TreeNode root){
        if(root==null){
            return;
        }
        postorder(root.left);  // left 
        postorder(root.right); // right
        System.out.print(root.data+" "); // first root node
    }
    public static void main(String[] args) {
        TreeNode root= new TreeNode(1);
        root.left= new TreeNode(2);
        root.right= new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        System.out.println("Created Tree: ");
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
    }
}
