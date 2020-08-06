package practice_bubble_sort;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list){
        boolean needNextPass = true;

        for(int k = 1; k < list.length - 1; k++){
            needNextPass = false;
            for(int i = 0; i < list.length - k; i++){
                if(list[i] > list[i + 1]){
                    needNextPass = true;
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }

            if(needNextPass == false)
                break;
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for(int i = 0; i < list.length; i++)
            System.out.print(list[i] + "\t");
    }
}
