package org.sourceit.piduna.homework_4;

/**
 * Created by Valeriu on 03.08.2015.
 */
public interface Stack {

        void push(Object o) throws StackException;

        Object pop() throws StackException;

        void clear();

        void print();

        boolean isEmpty();

        boolean isFull();

        int getSize();

        public static class StackException extends Exception {
            StackException(String msg) {super(msg);}
        }
    }
