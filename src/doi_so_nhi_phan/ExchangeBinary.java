package doi_so_nhi_phan;

import java.util.Scanner;

public class ExchangeBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int temp = number;
        while (temp != 0){
            stack.push(temp % 2);
            temp = temp / 2;
        }

        String result = "";
        while(!stack.isEmpty()){
            result += stack.pop();
        }

        System.out.println("Decimal: " + number + " Binary: " + result);
    }
}
