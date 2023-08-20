package product;

public abstract class Item {
    static int code;
    String name;
    int price;
    String description;
    int stock = 1;

    public Item(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
        Item.code++;
    }

    public Item(String name, int price, String description, Integer stock) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
        Item.code++;

    }
}
