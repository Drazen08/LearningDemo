package com.study.code;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class AbstractIterator<T> implements Iterator<T> {
    T next = nextElement();

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public T next() {
        if (next == null) {
            throw new NoSuchElementException();
        }
        T result = next;
        next = nextElement();
        return result;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    protected abstract T nextElement();

    private static Iterator<Character> test(final String s) {
        return new AbstractIterator<Character>() {
            private int cursor = 0;

            @Override
            protected Character nextElement() {
                return cursor == s.length() ? null : s.charAt(cursor++);
            }
        };
    }

    public static void main(String[] args) {
        for (Iterator<Character> i = test("OPS"); i.hasNext(); ) {
            System.out.print(i.next());
        }
    }
}