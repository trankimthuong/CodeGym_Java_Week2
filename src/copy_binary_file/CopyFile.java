package copy_binary_file;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        File sourcefile = new File("D:\\NewCodeGym\\week2\\src\\copy_binary_file\\sourcefile.txt");
        File destfile = new File("D:\\NewCodeGym\\week2\\src\\copy_binary_file\\destfile.txt");

        try{
            InputStream inputStream = new BufferedInputStream(new FileInputStream(sourcefile));
            OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destfile));

            byte[] buffer = new byte[1024];
            while (inputStream.read(buffer) != -1){
                outputStream.write(buffer);
            }
            inputStream.close();
            outputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
