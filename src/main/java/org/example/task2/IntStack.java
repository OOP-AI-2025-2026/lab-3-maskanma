package org.example.task2;

public class IntStack {
    private static int[] elements = new int[100_000];
    private static int top = 0;

    public static void push(int value) {
        if (top < elements.length) {
            elements[top++] = value;
        }
    }

    public static int pop() {
        if (top == 0) {
            return 0;
        }
        return elements[--top];
    }

    public static int peek() {
        if (top == 0) {
            return 0;
        }
        return elements[top - 1];
    }

    public static int size() {
        return top;
    }

    public static boolean isEmpty() {
        return top == 0;
    }

    public static void clear() {
        top = 0;
    }
}
