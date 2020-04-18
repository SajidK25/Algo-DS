package com.tech99;

import java.util.Arrays;

public class Stack {
    private int[] items=new int[5];
    public int count=0;

    public void push(int item){
        if (count==items.length)
            throw new StackOverflowError();
        items[count++]=item;
    }

    public int pop(){
        if (count==0)
            throw new IllegalStateException();
        return items[--count];
    }

    @Override
    public String toString(){
        var content=Arrays.copyOfRange(items,0,count);
        return Arrays.toString(content);
    }
}
