package IO_product_manager;

import java.io.*;
import java.util.LinkedList;

public class ProductManager {
    public static void main(String[] args) throws IOException {
        LinkedList<Product> products = new LinkedList<>();
        Product product1 = new Product(100, "vios", "toyota", 500, "sx trong nuoc");
        Product product2 = new Product(101, "camry", "toyota", 1000, "xe nhap khau");
        Product product3 = new Product(102, "Vinfast Lux", "Vinfast", 1500, "sx trong nuoc");
        Product product4 = new Product(103, "Vinfast Fadil", "Vinfast", 400, "sx trong nuoc");
        Product product5 = new Product(104, "C200", "Merc", 1400, "xe nhap khau");
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        File file = new File("D:\\NewCodeGym\\week2\\src\\IO_product_manager\\listproducts.txt");
        try{
            FileOutputStream fos = new FileOutputStream(file);
            for(int i = 0; i < products.size(); i++){
                byte[] bytes = products.get(i).toString().getBytes();
                byte[] byteDownLine = "\n".getBytes();
                fos.write(bytes);
                fos.write(byteDownLine);
            }
            System.out.println("Write successful!!!");
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
