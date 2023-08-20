package product;

public class Book extends Item {

    private String barcode;


    public Book(String name, int price, String description) {
        super(name, price, description);
        this.barcode = "B" + code;
    }

    public Book(String name, int price, String description, Integer stock) {
        super(name, price, description, stock);
        this.barcode = "B" + code;
    }

}
