public class problem2 {
    public static void main(String[] args)
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.removeLast();
        list.removeLast();
        list.print();
    }
}
