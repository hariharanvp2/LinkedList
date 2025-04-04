
public class Linkedlist {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        public int value;
        public Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Linkedlist(int value) {
        Node newnode = new Node(value);
        head = newnode;
        tail = newnode;
        length++;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void gethead() {
        if (head == null) {
            System.out.println("empty list" + head);
        }
        System.out.println("Here is the Head" + head);
    }

    public void gettail() {
        if (tail == null) {
            System.out.println("empty list" + head);
        }
        System.out.println("Here is the tail" + tail);
    }

    public void getlength() {
        System.out.println("Here is the length" + length);
    }

    public void append(int value) {
        Node newnode = new Node(value);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
            length++;
        }
    }

    public void prepend(int value) {
        Node newnode = new Node(value);
        newnode.next = head;
        head = newnode;
        length++;
    }

    public void removeLast() {
        if (length == 1) {
            head = null;
            tail = null;
        } else if (length == 2) {
            tail = head;
            head.next = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            length--;
        }
    }
    public Node Get(int index){
        if (index < 0 || index > length){
            return null;
        }
        Node temp = head;
        for (int i=0;i<index;i++){
            temp = temp.next;
        }
    return temp;
    }
    public boolean set(int index, int value){
        Node temp = Get(index);
        if (temp != null){
            temp.value = value;
            return true;
        }
    return false;
    }
    public boolean insert(int index,int value){
        if (index<0 || index>length) return false;
        if (index == 0){
            prepend(value);
            return true;
        }
        if (index == length){
            append(value);
            return true;
        }
        Node newnode = new Node(value);
        Node temp = Get(index-1);
        newnode.next = temp.next;
        temp.next = newnode;
        length++;
        return true;
    }
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after = temp.next;

        for (int i=0;i<length;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
            //after = temp.next;
        }
    }

}
