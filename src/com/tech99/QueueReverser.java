package com.tech99;

import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
    public void reverse(Queue<Integer> queue ,int k){
        Stack<Integer> stack=new Stack<>();
        while (!queue.isEmpty())
            stack.add(queue.remove());
        while (!stack.isEmpty())
            stack.pop();
    }
}
