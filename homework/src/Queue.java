/**
 * Created by Qwhying on 2018/10/12
 */
public class Queue {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY=8;

    //construct a queue with the default capacity 8
    public Queue()
    {
        this(DEFAULT_CAPACITY);
    }
    public Queue(int capacity)/**construct a new queue*/
    {
        elements=new int[capacity];
    }
    /**push a new integer to the end queue*/
    public void enqueue(int v)
    {
        if(size>=elements.length)
        {
            int [] temp=new int[elements.length*2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements=temp;
        }
        elements[size++]=v;
    }
    /**移除一个元素*/
    public int dequeue()
    {
        int tempint=elements[0];
       int []temp=new int[elements.length];
       System.arraycopy(elements,1,temp,0,elements.length-1);
       System.arraycopy(temp,0,elements,0,elements.length);
       size--;
       return tempint;
    }
    public boolean empty()
    {
        return size==0;
    }
    public int getSize()
    {
        return size;
    }

}
