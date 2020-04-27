package com.tech99;

import java.util.Arrays;

public class ArrayQueue {
    int[] items;
    int rear;
    int front;
    int count;
    public ArrayQueue(int capacity){
        items=new int[capacity];
    }

    public void enqueue(int item){
        if (count==items.length)
            throw new IllegalStateException();
        items[rear]=item;
        rear++;
        count++;
    }
    public int dequeue(){
        var item=items[front];
        items[front]=0;
        front++;
        count--;
        return item;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
