package product;

public class Book extends Item {

    private String barcode;


    public Book(String name, int price, String description) {
        super(name, price, description);
        this.barcode = "B" + code;
    }

    @Override
    public void setStock(int stock) {
        super.setStock(stock);
    }

}
