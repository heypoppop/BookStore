import product.Book;
import product.DVD;
import product.Item;

import java.util.ArrayList;

public class Testmain {
    public static void main(String[] args) {
        Store store = new Store("찬영이네");
        Item book1 = new Book("자바의 정석", 50000, "재밌음");
        System.out.println(book1.getBarcode());
    }
}

