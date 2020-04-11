package com.tech99;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList linkedList=new LinkedList();
//        System.out.println(linkedList.size);
        linkedList.addLast(10);
//        System.out.println(linkedList.size);

        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.addLast(50);
        System.out.println(Arrays.toString(linkedList.toArray()));
        var kth=linkedList.getKthNodeFromEnd(3);
        System.out.println(kth);
//        System.out.println(linkedList.size);

//        linkedList.removeFirst();
//        System.out.println(linkedList.size);
//        linkedList.removeLast();
//        System.out.println(linkedList.size);
//        linkedList.reverse();
//        var arr=linkedList.toArray();
//        System.out.println(Arrays.toString(arr));

        /*
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
//        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(60);
        numbers.insert(40);
//        System.out.println(numbers.indexOf(40));
//        numbers.removeAt(3);
//        System.out.println(numbers.max());
//        int[] num={20,30,70,60};


//     numbers.intersect(num);
        numbers.print();
//        numbers.reverse();
        System.out.println();
        numbers.insertAt(40,3);
        numbers.print();
*/
        
    }
}
