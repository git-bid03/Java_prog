public class QueueLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class QueueClass{
        Node head=null;
        Node tail=null;

        public boolean isEmpty(){
        return head==null && tail==null;
    }
    public void add(int data){
       Node newnode=new Node(data);
       if(tail==null){
        tail=head=newnode;
        return;
       }
       tail.next=newnode;
        newnode=tail;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1; 
        }
         int front=head.data;
        if(head==tail){
            tail=null;
        }
        head=head.next;
         return front;
        }
       
    public int peek(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1; 
        }
        return head.data;
        }
    }
    public static void main(String args[]){
        QueueClass q=new QueueClass();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
