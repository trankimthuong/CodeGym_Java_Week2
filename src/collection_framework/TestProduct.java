package collection_framework;

public class TestProduct {
    public static void main(String[] args) {
        Product product1 = new Product("apple", 55000, 1);
        Product product2 = new Product("orange", 50000, 2);
        Product product3 = new Product("strawberry", 100000, 3);
        Product product4 = new Product("cherry", 110000, 4);

        ProductManagerArrayList products = new ProductManagerArrayList();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        System.out.println("Danh sach san pham: ");
        products.display();

        products.delete(2);
        products.repair(1);
        System.out.println("Danh sach san pham sau khi xoa va sua: ");
        products.display();

        products.search("cherry");
        products.increaseSort();
        System.out.println("Danh sach san pham sau khi sap xep tang: ");
        products.display();
    }
}
