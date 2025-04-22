class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class DCLL {
    Node head;
    public void addEnd(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            newNode.next=head;
            newNode.prev=head;
        }else{
            Node tail= head.prev;
            tail.next=newNode;
            newNode.prev=tail;
            newNode.next=head;
            head.prev=newNode;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("linked list is empty");
        }else{
            Node temp= head;
            do{
                System.out.print(temp.data);
                if(temp.next!=head){
                    System.out.print("<-->");
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
        }else{
            Node temp=head;
            do{
                if(temp.data==data){
                    break;
                }
                temp=temp.next;
            }while(temp!=head);
            if(temp==head){
                if(temp==temp.next&&head.data==data){
                    head=null;
                }else if(head.data==data){
                    Node tail= head.prev;
                    head= head.next;
                    head.prev= tail;
                    tail.next=head;
                }else{
                    System.out.println("Data not found");
                    return;
                }
            }else{
                temp.prev.next=temp.next;
                temp.next.prev= temp.prev;
            }
        }
    }
    public static void main(String[] args) {
        DCLL DClist= new DCLL();
        DClist.addEnd(1);
        DClist.addEnd(2);
        DClist.display();
        DClist.delete(1);
        DClist.display();
        DClist.delete(4);
        DClist.delete(2);
        DClist.display();

    }
}
