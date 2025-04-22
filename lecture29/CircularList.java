class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class CircularList {
    Node head;
    public void insert(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            head.next=head;
        }else{
            Node temp= head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=head;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("linked list is empty");
        }else{
            Node temp=head;
            do{
                System.out.print(temp.data);
                if(temp.next!=head){
                    System.out.print("->");
                }
                temp=temp.next;
            }
            while(temp!=head);
            System.out.println();
        }
    }
    public void delete(int data){
        if(head==null){
            System.out.println("linked list is already empty");
            return;
        }
        Node temp=head;
        Node prev=head;
        do{
            if(temp.data==data){
                break;
            }
            prev=temp;
            temp=temp.next;
        }while(temp!=head);
        if(temp==head){
            Node last= head;
            while(last.next!=head){
                last= last.next;
            }
            if(head==last&&head.data==data){
                head=null;
                return;
            }else if(head.data==data){
                head=head.next;
                last.next=head;
            }else{
                System.out.println("data not found");
            }
        }else{
            prev.next=temp.next;
        }
    }
    public static void main(String[] args) {
        CircularList circleLL=new CircularList();
        circleLL.display();
        circleLL.insert(1);
        circleLL.insert(2);
        circleLL.insert(3);
        circleLL.insert(4);
        circleLL.display();
        // deleting first node
        circleLL.delete(1);
        circleLL.display();
        // deleting mid node
        circleLL.delete(3);
        circleLL.display();
        // deleting last node
        circleLL.delete(4);
        circleLL.display();
        // deleting something which is not available
        circleLL.delete(6);
        // deleting single node 
        circleLL.delete(2);
        circleLL.display();
        // try to delete when list is empty
        circleLL.delete(1);
    }
}
