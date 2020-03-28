package com.tech99;

import java.util.Arrays;

public class Array {
    private int[] items;
    private int count;
    private int max, min;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        //if array is full resize it
        if (items.length == count) {
            //Create new array(twice the size)
            int[] newItems = new int[count * 2];
            //copy all existing items
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
        }
        //insert item at last position of array
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        // shift the items to the left to fill the whole
        // [10,20,30]
        // 1 <- 2
        // 2 <- 3
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }

    public int max() {
        max = items[0];
        for (int i = 0; i < count; i++) {
            if (max < items[i])
                max=items[i];
        }
        return max;
    }

    public void intersect(int[] arr2){
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (items[i]==arr2[j]){
                    System.out.println(arr2[j]);
                }
            }
        }
    }

    public void reverse(){
        int temp;
        for (int i = 0; i < count/2; i++) {
            temp=items[i];
            items[i]=items[count-i-1];
            items[count-i-1]=temp;
        }
        System.out.println(Arrays.toString(items));
    }

    public void insertAt(int item, int index){
        for (int i = 0; i < count; i++) {
            if (items[i]==items[index])
                items[i]=item;
        }
    }
    public void print() {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }
}
