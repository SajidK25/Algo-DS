package com.tech99;

import java.util.NoSuchElementException;

public class LinkedList {
    public class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
    }
    private Node first;
    private Node last;
    public int size;

    // addLast
    public void addLast(int item){
        var node=new Node(item);
        if (first ==null){
            first=last=node;
        }else {
            last.next=node;
            last=node;
        }
        size++;
    }
    //addFirst
    public void addFirst(int item){
        var node=new Node(item);
        if (isEmpty()){
            first=last=node;
        }
        else {
            node.next=first;
            first=node;
        }
        size++;
    }
    // removeFirst
    public void removeFirst(){
        // [10 -> 20 -> 30]
        if (isEmpty())
            throw new NoSuchElementException();
        if (first==last){
            first=last=null;
        }
        else {
            var second = first.next;
            first.next=null;
            first=second;
        }
        size--;
    }
    // removeLast
    public void removeLast(){
        // [10 -> 20 -> 30]
        // previos -> 20
        // last -> 20
        if (isEmpty())
            throw new NoSuchElementException();
        if (first==last)
            first=last=null;
        else {
            var previous=getPrvious(last);
            last=previous;
            last.next=null;
        }
        size--;
    }

    private Node getPrvious(Node node){
        var current=first;
        while (current!=null){
            if(current.next==node) return current;
            current=current.next;
        }
        return null;
    }
    // contains
    public boolean contains(int item){
        return indexOf(item)!=-1;
    }
    // indexOf
    public int indexOf(int item){
        int index=0;
        var current=first;
        while (current!=null){
            if (current.value==item)
                return index;
            current=current.next;
            index++;
        }
        return -1;
    }

    public int[] toArray(){
        var array=new int[size];
        var current=first;
        var index=0;
        while (current!=null){
            array[index]=current.value;
            current=current.next;
            index++;
        }
        return array;
    }

    public void reverse(){
        //  f
        // [10 -> 20 -> 30]
        //  p     c      n

        // --- 1st iteration ---
        //  f
        // [10 <- 20   30]
        //        p     c      n
        //  n=c.next
        //  c.next=p

        // ---- 2nd iteration ---
        //  f
        // [10 <- 20   30]
        //        p     c      n
        //  n=c.next
        //  c.next=p

        // ---- 3rd iteration ---
        //               f
        // [10 <- 20 <- 30]
        //              p     c      n
        //  n=c.next
        //  c.next=p
        var previous=first;
        var current=previous.next;
        last=first;
        last.next=null;
        while (current!=null){
            var next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        first=previous;
    }

    public  int getKthNodeFromEnd(int k){
        if (isEmpty())
            throw new IllegalStateException();
        var a=first;
        var b=first;
        for (int i = 0; i < k-1; i++) {
            b=b.next;
            if (b==null)
                throw new IllegalArgumentException();
        }
        while (b!=last){
            a=a.next;
            b=b.next;
        }
         return a.value;
    }

    private boolean isEmpty(){
        return first==null;
    }
}
