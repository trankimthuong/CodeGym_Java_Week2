package count_words;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        String str = "nam dieu bac ho day: yeu to quoc yeu dong bao" +
                " hoc tap tot lao dong tot" +
                " doan ket tot ky luat tot" +
                " giu gin ve sinh that tot" +
                " khiem ton that tha dung cam";
        Map<String, Integer> treeMap = new TreeMap<>();
        String[] bufferStr = str.split(" ");
        for(int i = 0; i < bufferStr.length; i++){
            if(isContains(bufferStr,i)){
                treeMap.put(bufferStr[i], 1);
            }else {
                treeMap.replace(bufferStr[i], treeMap.get(bufferStr[i]) + 1);
            }
        }

        System.out.println(treeMap);
    }

    private static boolean isContains(String[] str, int index){
        for(int i = 0; i < index; i++){
            if(str[i].equals(str[index])){
                return false;
            }
        }
        return true;
    }
}
