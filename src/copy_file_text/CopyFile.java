package copy_file_text;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int count = 0;
        try{
            FileInputStream sourceFile = new FileInputStream("D:\\NewCodeGym\\week2\\src\\copy_file_text\\sourcefile.txt");
            FileOutputStream destFile = new FileOutputStream("D:\\NewCodeGym\\week2\\src\\copy_file_text\\destfile.txt");

            int check;
            while ((check = sourceFile.read()) != -1){
                destFile.write(check);
                count++;
            }
            sourceFile.close();
            destFile.close();
        }catch (IOException e){
            System.out.println("Error!!!");
            e.printStackTrace();
        }
        System.out.println("So ky tu trong tep la: " + count);
    }
}
