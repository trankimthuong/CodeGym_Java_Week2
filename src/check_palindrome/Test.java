package check_palindrome;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MyQueue<Character> queue = new MyQueue<>();
        MyStack<Character> stack = new MyStack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String str = scanner.nextLine();

        String str1 = str.trim();
        str1 = str1.toUpperCase();
        for(int i = 0; i < str1.length(); i++){
            str1.charAt(i);
            queue.enqueue(str1.charAt(i));
            stack.push(str1.charAt(i));
        }

        boolean check = true;
        while (!stack.isEmpty() && queue.tail != null){
            if(!stack.pop().equals(queue.dequeue().key)){
                check = false;
                break;
            }
        }


        if(check){
            System.out.println("String: " + str + " is a palindrome string");
        }else{
            System.out.println("String: " + str + " is not a palindrome string");
        }
    }
}
