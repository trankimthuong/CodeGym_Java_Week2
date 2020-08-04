package kiem_tra_dau_ngoac;

import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) throws Exception {
        String str = "s * ((s – a) * s – b) * (s – c)  ";
        MyStack<Character> stack = new MyStack<Character>(3);
        char[] word = str.toCharArray();
        System.out.println(Arrays.toString(word));
        stack = new MyStack<Character>(word.length);
        boolean check = false;
        for(char w : word){
            if(w == '(')
                stack.push(w);
            if(w == ')'){
                if(stack.size() == 0) {
                    check = false;
                    System.out.println("bieu thuc sai");
                    System.exit(0);
                }
                else
                    stack.pop();
            }
        }
        if(stack.size() == 0)
            check = true;
        if(check)
            System.out.println("bieu thuc dung");
        else
            System.out.println("bieu thuc sai");
    }
}
