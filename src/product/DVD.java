package product;

public class DVD extends Item {
    private String barcode;

    public DVD(String name, int price, String description) {
        super(name, price, description);
        this.barcode = "D" + code;
    }

    @Override
    public void setStock(int stock) {
        super.setStock(stock);
    }
}
