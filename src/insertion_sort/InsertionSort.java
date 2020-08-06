package insertion_sort;

public class InsertionSort {
    static int[] list = {-1, 9, 7, 1, 5,8, 13, 21, 6};

    public static void insertionSort(int[] list){
        for(int i = 1; i < list.length; i++){
            int currentElement = list[i];
            int k;
            for(k = i - 1; k >= 0 && list[k] > currentElement; k--){
                list[k + 1] = list[k];
            }

            list[k+1] = currentElement;

            System.out.println("\nSau vong lap " + i + ": ");
            display(list);
        }
    }

    public static void display(int[] list){
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + "  ");
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
    }
}
