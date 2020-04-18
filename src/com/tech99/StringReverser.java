package com.tech99;

import java.util.Stack;
import java.lang.StringBuffer;

public class StringReverser {
    private Stack<Character> stc= new Stack<>();;
    public String reverse(String input){
        for (int i = 0; i < input.length(); i++) {
           stc.push(input.charAt(i));
        }

        StringBuffer reversed=new StringBuffer();
        while (!stc.empty())
            reversed.append(stc.pop());

        return reversed.toString();
    }
}
