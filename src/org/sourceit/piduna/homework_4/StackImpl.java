package org.sourceit.piduna.homework_4;

/**
 * Created by Valeriu on 03.08.2015.
 */
public class StackImpl implements Stack{

    private int capacity;
    private int size;
    private Object[] arraystack;

    public StackImpl(int n) {
        capacity = n;
        arraystack = new Object[n];
        size = -1;
    }

    public boolean isEmpty() {
        return size == -1;
    }

    public boolean isFull() {
        return size == capacity -1 ;
    }

    public int getSize() {
        return size + 1;
    }

    public void push(Object o) throws StackException {
        if(size + 1 >= capacity) throw new StackException("Overflow");
        if(size + 1 < capacity)
        arraystack[++size] = o;
    }

    public Object pop () throws StackException {
        if (size < 0) throw new StackException("Underflow");
        return arraystack[size--];
    }

    public void clear() {
        size = -1;
    }

    public void print() {
        {
            System.out.print("\nStack = ");
            if (size == -1)
            {
                System.out.print("Empty\n");
                return ;
            }
            for (int i = size; i >= 0; i--)
                System.out.print(arraystack[i]+" ");
            System.out.println();
        }
    }
}
