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

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // 상품 정보 출력
    public String toString() {
        return "상품명 : " + this.name + ", 가격 : " + this.price + ", 내용 : " + this.description + ", 재고 : " + this.stock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public abstract String getBarcode();
}
