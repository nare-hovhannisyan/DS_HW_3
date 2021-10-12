public class problem1 {

    public static void main(String[] args)
    {
        DoublyLinkedListNOHeader<Integer> list = new DoublyLinkedListNOHeader<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(4);
        list.addFirst(10);
        list.removeFirst();
        list.removeLast();
        list.print();

    }
}
