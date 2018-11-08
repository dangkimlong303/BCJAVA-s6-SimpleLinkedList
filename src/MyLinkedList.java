public class MyLinkedList<T> {
    private Node head;
    private int numNode;

    public MyLinkedList(T t){
        head = new Node(t);
    }
    public class Node<T>{
        private Node next;
        private T t;

        public Node(T t) {
            this.t = t;
        }

        public Object getData() {
            return t;
        }
    }

    public void add(int index, T t){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index-1 && temp.next != null; i++){
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(t);
        temp.next.next = holder;
        numNode++;
    }

    public void addFirst(T t){
        Node temp = head;
        head = new Node(t);
        head.next = temp;
        numNode++;
    }

    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.t);
            temp = temp.next;
        }
    }
}
