package tim_chuoi_con_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.println("Nhap vao 1 chuoi bat ki: ");
        String string = scanner.nextLine();

        for(int i = 0; i < string.length(); i ++){
            if(list.size() > 1 && string.charAt(i) <= list.getLast()
                    && list.contains(string.charAt(i))){
                list.clear();
            }
            list.add(string.charAt(i));

            if(list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
        }

        for(Character ch: max){
            System.out.print(ch);
        }
    }
}
