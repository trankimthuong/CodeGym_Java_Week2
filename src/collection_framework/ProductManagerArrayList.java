package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManagerArrayList implements Comparator<Product> {
    public ArrayList<Product> products = new ArrayList<>();

    public void add(Product product){
        products.add(product);
    }

    public int count(){
        return products.size();
    }

    public void repair(int id){
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getId() == id){
                products.set(i, this.repair());
            }
        }
    }

    public Product repair(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new Name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new Id: ");
        int newId = scanner.nextInt();
        System.out.println("Enter new Cost: ");
        int newCost = scanner.nextInt();
        return new Product(newName, newCost, newId);
    }

    public void delete(int id){
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getId() == id){
               products.remove(i);
            }
        }
    }

    public void display(){
        System.out.println(products.toString());
    }

    public void search(String name){
        int index = -1;
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getProductName().equals(name)){
                index = i;
            }
        }
        if(index >= 0){
            System.out.println("Thong tin san pham can tim kiem: ");
            System.out.println(products.get(index).toString());
        }else{
            System.out.println("Khong tim thay san pham");
        }
    }

    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getCost() > o2.getCost()){
            return 1;
        }else if(o1.getCost() == o2.getCost()){
            return 0;
        }else{
            return -1;
        }
    }

    public void increaseSort(){
        ProductManagerArrayList productManagerArrayList = new ProductManagerArrayList();
        Collections.sort(products, productManagerArrayList);
    }
}
