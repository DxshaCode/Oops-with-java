class Book {
    String title;
    String author;
    double price;

    Book() { //no arguments in this constructor
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(String t, String a, double p) { //constructor with parameter a and p
        title = t;
        author = a;
        price = p;
    }

    Book(Book b) { //one object value is copied to other hence copy constructor
        title = b.title;
        author = b.author;
        price = b.price;
    }
    
    void display() {
        System.out.println("title" + title);
        System.out.println("author" + author);
        System.out.println("price" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("atomic habits", "powerless", 500);
        Book b3 = new Book(b2);
      
        b1.display();
        b2.display();
        b3.display();
      
        b3.price = 700;
        b3.title = "reckless";
        
        b2.display();
        b3.display();
    }
}

