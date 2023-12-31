package product;

public class Toy extends Item {


    private String barcode;


    public Toy(String name, int price, String description) {
        super(name, price, description);
        this.barcode = "T" + code;
    }

    @Override
    public void setStock(int stock) {
        super.setStock(stock);
    }

    @Override
    public String getBarcode() {
        return this.barcode;
    }

    @Override
    public String toString() {
        return "바코드 : " + this.barcode +", " + super.toString();
    }
}
