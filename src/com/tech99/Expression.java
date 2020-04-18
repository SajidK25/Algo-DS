package com.tech99;

import java.util.Stack;

public class Expression {
    Stack<Character> stk=new Stack<Character>();
    public boolean isBalanced(String input){
        for(char ch:input.toCharArray()){
            if (leftBracket(ch))
                stk.push(ch);
            if (rightBracket(ch)) {
                if (stk.empty())
                    return false;
                var top=stk.pop();
                if (!bracketMatched(ch,top)) return false;
            }
        }

        return stk.empty();
    }

    private boolean leftBracket(char ch){
        return ch=='(' || ch=='<' || ch == '[' || ch=='{';
    }

    private boolean rightBracket(char ch){
        return ch==')' || ch=='>' || ch == ']' || ch=='}';
    }
    private boolean bracketMatched(char left,char right){
        return (right ==')' && left!='(') ||
                (right =='>' && left!='<') ||
                (right ==']' && left!='[') ||
                (right =='}' && left!='{');
    }
}
