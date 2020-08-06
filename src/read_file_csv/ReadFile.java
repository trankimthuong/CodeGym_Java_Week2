package read_file_csv;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("D:\\NewCodeGym\\week2\\src\\read_file_csv\\sourcefile.txt");
        BufferedReader br = null;
        String line = "";
        try{
            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null){
                String[] str = line.split(",");
                System.out.println("Contry [code = " +
                        str[4] + ", name = " + str[5]);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(br != null){
                try{
                    br.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
