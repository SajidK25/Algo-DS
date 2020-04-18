package com.tech99;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var stack=new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(60);
        stack.pop();
        stack.pop();
        System.out.println(stack);
        /*
        var str="((1+2])[]<>{}";
        var exp=new Expression();
        var result=exp.isBalanced(str);
        System.out.println(result);*/
        /*
        var str="sajid";
        var reverser=new StringReverser();
        var result=reverser.reverse(str);
        System.out.println(result);*/
    }
}
