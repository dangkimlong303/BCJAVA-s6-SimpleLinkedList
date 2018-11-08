public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList("long");
        myLinkedList.addFirst("dang");
        myLinkedList.addFirst("kim");
        myLinkedList.addFirst("a");
        myLinkedList.addFirst("z");

        myLinkedList.add(0,"lol");
        myLinkedList.add(4,"nice");
        myLinkedList.print();
    }
}
