package com.study.code;

public class ThreadFriendly {
    ThreadLocal<Value> threadLocalPart = new ThreadLocal<Value>();

    class Value {
        final int i;

        Value(int i) {
            this.i = i;
        }
    }

    ThreadFriendly setThreadVal(int i) {
        threadLocalPart.set(new Value(i));
        return this;
    }

    int getThreadVal() {
        return threadLocalPart.get().i;
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = -500000; i <= 500000; i++) {
            sum += new ThreadFriendly().setThreadVal(i).getThreadVal();
        }
        System.out.println(sum);
    }
}