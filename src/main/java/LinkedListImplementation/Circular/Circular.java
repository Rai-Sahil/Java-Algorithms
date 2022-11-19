package LinkedListImplementation.Circular;


public class Circular {
    static Node head;
    Node tail;
    int size = 0;

    void insertHead(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
            tail.next = head;
            size++;
            return;
        }
        node.next = head;
        head = node;
        tail.next = head;
        size++;
    }

    void insertTail(int data){
        Node node = new Node(data);
        if(head == null){
            insertHead(data);
            return;
        }
        tail.next = node;
        tail = node;
        tail.next = head;
        size++;
    }

    void insertAt(int index, int data){
        Node node = new Node(data);
        if(head == null || index % size == 0){
            insertHead(data);
            return;
        }
        Node n = head;
        while(index > 1){
            n = n.next;
            index--;
        }
        Node temp = n.next;
        n.next = node;
        node.next = temp;
    }

    void traverse(){
        Node n = head;
        while(n.next != head){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    public static void main (String[] args){
        Circular c = new Circular();

        c.insertTail(13);
        c.insertHead(34);
        c.insertTail(193);
        c.insertHead(83);

        c.insertAt(2, 132);

        c.traverse();

    }
}
