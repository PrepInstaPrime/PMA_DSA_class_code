class Node {
    int data;
    Node next;
    Node prev;
    Node(int val){
        this.data=val;
        this.next=null;
        this.prev=null;
    }
}
public class Dlinkedlist {
    Node head;
    Node tail;
    public boolean empty(){
        return head==null;
    }
    public void addstart(int data){
        Node newnode=new Node(data);
        if(empty()){
            head=newnode;
            tail=newnode;
        }else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
    }
    public void addend(int data){
        Node newnode=new Node(data);
        if(empty()){
            head=newnode;
            tail= newnode;
        }else{
            newnode.prev=tail;
            tail.next=newnode;
            tail=newnode;
        }
    }
    public void traverseStart(){
        if(empty()){
            System.out.println("linkedList is empty");
        }else{
            Node temp=head;
            System.out.print("null<-->");
            while(temp!=null){
                System.out.print(temp.data+"<-->");
                temp= temp.next;
            }
            System.out.println("null");
        }
    }
    public void traverseEnd(){
        if(empty()){
            System.out.println("Linked list is empty");
        }else{
            Node temp=tail;
            System.out.print("null<-->");
            while(temp!=null){
                System.out.print(temp.data+"<-->");
                temp= temp.prev;
            }
            System.out.println("null");
        }
    }
    public void delete(int data){
        if(empty()){
            System.out.println("Linked list is empty");
        }else{
            Node temp=head;
            while(temp!=null&&temp.data!=data){
                temp= temp.next;
            }
            if(temp==null){
                System.out.println("data is not found");
            }else if(temp.prev==null&&temp.next==null){
                head=null;
                tail=null;
            }else if(temp.prev==null){
                head= head.next;
                head.prev=null;
            }else if(temp.next==null){
                tail=tail.prev;
                tail.next=null;
            }else{
                temp.next.prev=temp.prev;
                temp.prev.next=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Dlinkedlist dlist= new Dlinkedlist();
        dlist.addstart(1);
        // dlist.traverseStart();
        dlist.addend(2);
        dlist.addend(3);
        dlist.addstart(0);
        // dlist.traverseStart();
        dlist.addend(4);
        // dlist.traverseEnd();
        dlist.delete(0);
        dlist.traverseStart();
        dlist.delete(4);
        dlist.traverseStart();
        dlist.delete(2);
        dlist.traverseStart();
    }
}
