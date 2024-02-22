// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Node  head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node tail = new Node(5);
        head.next=node1;
        node1.next=node2;
        node1.prev=head;
        node2.next=node3;
        node2.prev=node1;
        node3.next=node4;
        node3.prev=node2;
        node4.next=tail;
        node4.prev=node3;
        tail.prev=node4;

        System.out.println(findNode(head));
    }
    static int findNode (Node head){
       int sum = 0;
       if (head==null){
           return sum;
       }
       else {
           sum = sum + head.head + findNode(head.next);
       }
       return  sum;

    }
}