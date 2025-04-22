import java.util.LinkedList;
import java.util.Queue;
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
public class TreeInsertDelete {
    TreeNode root;
    public void insert(int data){
        TreeNode newNode= new TreeNode(data);
        if(root==null){
            root=newNode;
            return;
        }
        // BFS
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp= q.poll();
            if(temp.left==null){
                temp.left=newNode;
                return;
            }else{
                q.add(temp.left);
            }
            if(temp.right==null){
                temp.right=newNode;
                return;
            }else{
                q.add(temp.right);
            }
        }
    }
    public void delete(int data){
        if(root==null){
            System.out.println("Tree is already empty");
        }
        if(root.left==null&&root.right==null){
            if(root.data==data){
                root=null;
                return;
            }else{
                System.out.println("Data not found");
            }
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        TreeNode temp=null;
        TreeNode delNode= null;
        while(!q.isEmpty()){
            temp=q.poll();
            // System.out.println(temp);
            if(temp.data==data){
                delNode=temp;
            }
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        // System.out.println("checking");
        if(delNode!=null){
            int x= temp.data;
            delLastNode(temp);
            delNode.data=x;
        }else{
            System.out.println("Data not found");
        }
    }
    public void delLastNode(TreeNode deepest){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode Iter= q.poll();
            if(Iter.left==deepest){
                Iter.left=null;
                return;
            }else if(Iter.left!=null){
                q.add(Iter.left);
            }
            if(Iter.right==deepest){
                Iter.right=null;
                return;
            }else if(Iter.right!=null){
                q.add(Iter.right);
            }
        }
    }
    public void inorder(TreeNode root){
        // DFS
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        TreeInsertDelete tree= new TreeInsertDelete();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        System.out.println("Before deletion: ");
        tree.inorder(tree.root);
        tree.delete(2);
        System.out.println("After deletion");
        tree.inorder(tree.root);
    }
}
