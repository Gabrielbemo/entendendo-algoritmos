package Leetcode.Stack.StackImplementQueueUsingStacks232;

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementQueueUsingStacks {
    static void main(String[] args) {
        var queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.peek());
        while (!queue.empty()){
            System.out.println(queue.pop());
        }
    }

    static class MyQueue {

        private Deque<Integer> inputStack = new ArrayDeque<>();
        private Deque<Integer> outputStack = new ArrayDeque<>();

        public void push(int x) {
            inputStack.push(x);
        }

        public int pop() {
            moveIfNeeded();
            return outputStack.pop();
        }

        public int peek() {
            moveIfNeeded();
            return outputStack.peek();
        }

        public boolean empty() {
            return inputStack.isEmpty() && outputStack.isEmpty();
        }

        private void moveIfNeeded() {
            if (outputStack.isEmpty()) {
                while (!inputStack.isEmpty()) {
                    outputStack.push(inputStack.pop());
                }
            }
        }
    }
}
