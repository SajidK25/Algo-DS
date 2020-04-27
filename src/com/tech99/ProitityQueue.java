package com.tech99;

import java.util.Arrays;

public class ProitityQueue {
    int[] items=new int[5];
    int count;

    public void add(int item){
        int i;
        for ( i = count-1; i >=0; i--) {
            if (items[i]>item)
                items[i+1]=items[i];
            else break;
        }
        items[i+1]=item;
        count++;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
