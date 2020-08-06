package sum_text_file;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tong = " + sum);
        } catch (Exception e) {
            System.err.println("File khong ton tai hoac noi dung loi!!!");
        }
    }

    public static void main(String[] args) {
        String path = "D:\\NewCodeGym\\week2\\src\\sum_text_file\\sourcefile.txt";

        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(path);
    }
}
