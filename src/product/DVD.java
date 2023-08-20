package product;

public class DVD extends Item {
    private String barcode;

    public DVD(String name, int price, String description) {
        super(name, price, description);
        this.barcode = "D" + code;
    }

    public DVD(String name, int price, String description, Integer stock) {
        super(name, price, description, stock);
        this.barcode = "D" + code;
    }
}
