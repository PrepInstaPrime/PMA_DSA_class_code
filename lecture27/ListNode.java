class Node{
    int data;
    Node next;
    Node(int value){
        this.data=value;
        this.next=null;
    }
}

public class ListNode {
    Node head;
    public void append(int data){
        Node newnNode= new Node(data);
        if(head==null){
            head= newnNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnNode;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }else{
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp= temp.next;
            }
            System.out.println("null");

        }
    }
    public void prepend(int data){
        Node newNode= new Node(data);
        newNode.next= head;
        head=newNode;
    }
    public void delete(int data){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }else if(head.data==data){
            head=head.next;
        }else{
            Node temp=head;
            while(temp.next!=null&&temp.next.data!=data){
                temp=temp.next;
            }
            if(temp.next!=null){
                temp.next=temp.next.next;
            }else{
                System.out.println("data not found");
            }
        }
    }
    public static void main(String[] args) {
        ListNode list= new ListNode();
        list.append(1);
        list.append(2);
        list.append(4);
        list.append(5);
        list.display();
        list.prepend(0);
        list.display();
        list.delete(2);
        list.display();
        list.delete(0);
        list.display();
        list.delete(5);
        list.display();
    }
}
