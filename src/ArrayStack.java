public class ArrayStack<E> implements IStack<E> {
    public static final int CAPACITY = 100;
    private int t = -1;
    private E[] data;

    public ArrayStack()
    {
        this(CAPACITY);
    }
    public ArrayStack(int capacity)
    {
        data = (E[]) new Object[capacity];
    }

    public int size() {return t+1; }
    public boolean isEmpty() {return t==-1;}
    public void push(E el) throws IllegalStateException {
        if(size() == data.length) throw new IllegalStateException("Stack is full");
        data[++t] = el;

    }
    public E pop()
    {
        if(isEmpty()) {return null; }
        var answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }

    public E top()
    {
        if(isEmpty()) {return null;}
        return data[t];
    }

    public void printStack()
    {

        while(size() > 0)
        {
            System.out.print(pop() + " ");
        }
        System.out.println();
    }

    public void reverseStack()
    {
        E[] elements = (E[])new Object[size()];
        int n = size();

        for(int i = 0; i < n; i++)
        {
            elements[i] = pop();
        }

        for(int i = 0; i < n; i++)
        {
            push(elements[i]);
        }
    }


}
