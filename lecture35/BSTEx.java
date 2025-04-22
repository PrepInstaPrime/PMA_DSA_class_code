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
public class BSTEx {
    TreeNode root;
    public void insert(int data){
        root=insertPosition(root,data);
    }
    public TreeNode insertPosition(TreeNode root,int data){
        if(root==null){
            return new TreeNode(data);
        }
        if(data<root.data){
            root.left=insertPosition(root.left,data);
        }else if(data>root.data){
            root.right=insertPosition(root.right,data);
        }
        return root;
    }
    public void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    } 
    public void delete(int data){
        root=deleteNode(root,data);
    }
    public TreeNode deleteNode(TreeNode root, int data){
        if(root==null){
            return root;
        }
        if(data<root.data){
            root.left=deleteNode(root.left,data);
        }else if(data>root.data){
            root.right=deleteNode(root.right,data);
        }else{
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            root.data=minValue(root.right);
            root.right= deleteNode(root, data);
            }
        return root;
    }
    public int minValue(TreeNode root){
        int minValue=root.data;
        while(root.left!=null){
            minValue=root.left.data;
            root=root.left;
        }
        return minValue;
    }

    public static void main(String[] args) {
        BSTEx bst=new BSTEx();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60); 
        bst.inorder(bst.root);

    }
}
