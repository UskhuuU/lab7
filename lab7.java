import java.util.Date;

// Бараа класс
class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void decreaseQuantity(int amount) {
        this.quantity -= amount;
    }
}

// Зарлагын мэдээлэл
class Expense {
    private String productName;
    private int amount;
    private String receiver;
    private Date date;

    public Expense(String productName, int amount, String receiver, Date date) {
        this.productName = productName;
        this.amount = amount;
        this.receiver = receiver;
        this.date = date;
    }

    public void printInfo() {
        System.out.println("=== ЗАРЛАГА ===");
        System.out.println("Бараа: " + productName);
        System.out.println("Тоо: " + amount);
        System.out.println("Хүлээн авсан хүн: " + receiver);
        System.out.println("Огноо: " + date);
    }
}

// Агуулах
class Warehouse {

    public static void zarlagaGargah(Product product, int amount, String receiver) {
        
        // Шалгалт
        if (amount <= 0) {
            System.out.println("Алдаа: Тоо буруу байна!");
            return;
        }

        if (product.getQuantity() < amount) {
            System.out.println("Алдаа: Хангалттай үлдэгдэл алга!");
            return;
        }

        // Зарлага хийх
        product.decreaseQuantity(amount);

        // Бүртгэл үүсгэх
        Expense z = new Expense(
                product.getName(),
                amount,
                receiver,
                new Date()
        );

        // Хэвлэх
        z.printInfo();

        System.out.println("Үлдэгдэл: " + product.getQuantity());
    }
}