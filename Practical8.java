class Product {
    String productName;
    double price;
    int quantity;
    Product() {
        productName = "Unknown";
        price = 0.0;
        quantity = 0;
    }

    Product(String name) {
        productName = name;
        price = 0.0;
        quantity = 0;
    }
    
    Product(String name, double p) {
        productName = name;
        price = p;
        quantity = 0;
    }

    Product(String name, double p, int q) {
        productName = name;
        price = p;
        quantity = q;
    }

    double calculateTotalCost() {
        return price*quantity;
    }

    void display() {
        System.out.println("name" + productName);
        System.out.println("price" + price);
        System.out.println("quantity" + quantity);
        System.out.println("total cost" + calculateTotalCost());
    }
}

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mobile", 15000);
        Product p4 = new Product("Headphones", 2000, 3);
        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}

