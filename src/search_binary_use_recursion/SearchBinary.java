package search_binary_use_recursion;

public class SearchBinary {
    static int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};
    static int binarySearch(int[] list, int l , int r, int key){

        if(r >= l){
            int mid = (r + l) / 2;
            if(list[mid] == key){
                return mid;
            }else if(list[mid] < key){
                return binarySearch(list, mid + 1, r,key);
            }else{
                return binarySearch(list, l, mid -1, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,0, list.length - 1, 2));  /* 0 */
        System.out.println(binarySearch(list,0, list.length - 1, 11)); /* 4 */
        System.out.println(binarySearch(list,0, list.length - 1, 79)); /*12 */
        System.out.println(binarySearch(list,0, list.length - 1, 1));  /*-1 */
        System.out.println(binarySearch(list,0, list.length - 1,5));  /*-1 */
        System.out.println(binarySearch(list,0, list.length - 1, 80)); /*-1 */
    }
}
