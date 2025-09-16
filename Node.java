public class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
    public static int length(Node head){
    int count=0;
    while(head!=null){
        count++;
        head=head.next;
    }
    return count;
}
    public static void main(String[] args){
        Node a=new Node(5);
        // System.out.println(a);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;//5->3->9->8->16
        // System.out.println(a.next);
        // System.out.println(a.data);
        // System.out.println(b.data);
        // System.out.println(a.next.data);
        System.out.println(length(a));
    }
}