package dao_nguoc_mang;

public class TestMyStack {
    private static int[] reverseIntegerElement(int[] arr){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        for(int i = 0; i < arr.length; i++){
            stack.push(arr[i]);
        }
        int i = 0;
        while(!stack.isEmpty()){
            arr[i] = stack.pop();
            i++;
        }
        return arr;
    }

    private static String reverseString(String str){
        MyGenericStack<String> wStack = new MyGenericStack<>();
        String[] bufferStr = str.split(" ");
        for(int i = 0; i < bufferStr.length; i++){
            wStack.push(bufferStr[i]);
        }
        String result = "";
        for(int i = 0; i < bufferStr.length; i++){
            result += wStack.pop() + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Dao nguoc mang so nguyen: ");
        System.out.println("Mang ban dau: ");
        for(int i : arr){
            System.out.print(i + "\t");
        }
        System.out.println("\nMang sau khi dao: ");
        arr = reverseIntegerElement(arr);
        for(int i : arr){
            System.out.print(i + "\t");
        }

        String str = "mot hai ba bon nam sau";
        System.out.println("\nDao nguoc chuoi String: ");
        System.out.println("Chuoi ban dau: " + str);
        System.out.println("\nChuoi sau khi dao: " + reverseString(str));
    }
}
