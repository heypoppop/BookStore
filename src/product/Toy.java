package product;

public class Toy extends Item {


    private String barcode;


    public Toy(String name, int price, String description) {
        super(name, price, description);
        this.barcode = "T" + code;
    }

    public Toy(String name, int price, String description, Integer stock) {
        super(name, price, description, stock);
        this.barcode = "T" + code;

    }
}
