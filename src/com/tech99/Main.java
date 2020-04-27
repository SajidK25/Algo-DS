package com.tech99;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        /*var pq=new ProitityQueue();
        pq.add(2);
        pq.add(3);
        pq.add(5);
        pq.add(1);
        pq.add(6);
        pq.add(4);
        System.out.println(pq);*/
        /*var sQueue=new QueueWithTwoStack();
        sQueue.enqueue(10);
        sQueue.enqueue(20);
        sQueue.enqueue(20);
        var first=sQueue.dequeue();
        System.out.println(first);*/
       /*var arrayQueue=new ArrayQueue(5);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        //var front=
        arrayQueue.enqueue(40);
        arrayQueue.enqueue(50);
        arrayQueue.enqueue(60);*/

//        System.out.println(front);
//        System.out.println(arrayQueue);

//        var queue=new ArrayDeque<Integer>();
        var queue=new ArrayDeque<Integer>();
        queue.add(10);
       queue.add(20);
       queue.add(30);
       queue.add(40);
       queue.add(50);
//       var res=queue.remove();
//        System.out.println(res);
        reverse(queue,3);
        System.out.println(queue);
    }
    public static void reverse(Queue<Integer> q,int k){
        var stack=new Stack<Integer>();
        while (q.isEmpty())
            return;
        for (int i = 0; i < k; i++){
            stack.push(q.peek());
            q.remove();
        }

        while (!stack.isEmpty()){
           q.add(stack.peek()) ;
           stack.pop();
        }

        for (int i = 0; i < q.size()-k; i++) {
            q.add(q.peek());
            q.remove();
        }
    }
}
