import product.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    ArrayList<Item> itemArrayList = new ArrayList<>();
    String storeName = "찬영이네 서점";

    Item item;
    Item[] items;

    public Store(String storeName) {
        this.storeName = storeName;
        System.out.println("안녕하세요. " + storeName + "입니다.");
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void createItem(String type) {
        System.out.println(type + "등록 메뉴입니다. ");
        Scanner sc = new Scanner(System.in);
        System.out.println(type + "의 제목을 입력하세요.");
        String title = sc.nextLine();
        System.out.println(type + "의 가격을 입력하세요.");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.println(type + "의 내용을 입력하세요.");
        String desc = sc.nextLine();
        if (type.equals("Book")) {
            itemArrayList.add(new Book(title, price, desc));
            System.out.println(itemArrayList.get(itemArrayList.size() - 1) + "\t등록되었습니다.");
        } else if (type.equals("Toy")) {
            itemArrayList.add(new Toy(title, price, desc));
            System.out.println(itemArrayList.get(itemArrayList.size() - 1) + "\t등록되었습니다.");
        } else {
            itemArrayList.add(new DVD(title, price, desc));
            System.out.println(itemArrayList.get(itemArrayList.size() - 1) + "\t등록되었습니다.");
        }
    }

    public void allItems() {
        for (int i = 0; i < itemArrayList.size(); i++) {
            System.out.println((i + 1) + ". " + itemArrayList.get(i));
        }
    }

    public void searchItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 상품명 혹은 바코드를 입력해주세요.");
        String name = sc.nextLine();
        for (Item item1 : itemArrayList) {
            if (item1.getName().equals(name) || item1.getBarcode().equals(name)) {
                System.out.println(item1);
            }
        }
    }

    public void setStock() {
        Scanner sc = new Scanner(System.in);
        System.out.println("재고 수정 메뉴입니다.");
        System.out.println("재고를 수정할 상품명 혹은 바코드를 입력하세요.");
        String name = sc.nextLine();
        for (Item item1 : itemArrayList) {
            if (item1.getName().equals(name) || item1.getBarcode().equals(name)) {
                System.out.println("현재 재고는 " + item1.getStock() + "입니다.");
                System.out.println("재고를 몇개로 수정하시겠습니까?");
                int stock = sc.nextInt();
                item1.setStock(stock);
                System.out.println(item1.getStock() + "개로 재고가 변경되었습니다.");
                System.out.println("현재 상품 정보 : " + item1);
            }
        }
    }

    public void setPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("가격 수정 메뉴입니다.");
        System.out.println("가격을 수정할 상품명 혹은 바코드를 입력하세요.");
        String name = sc.nextLine();
        for (Item item1 : itemArrayList) {
            if (item1.getName().equals(name) || item1.getBarcode().equals(name)) {
                System.out.println("현재 가격은 " + item1.getPrice() + "입니다.");
                System.out.println("가격을 얼마로 수정하시겠습니까?");
                int price = sc.nextInt();
                item1.setPrice(price);
                System.out.println(item1.getPrice() + "개로 가격이 변경되었습니다.");
                System.out.println("현재 상품 정보 : " + item1);
            }
        }
    }

    public void buyItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("상품 구매 메뉴입니다.");
        System.out.println("구매할 상품명 혹은 바코드를 입력해주세요.");
        String name = sc.nextLine();
        for (Item item1 : itemArrayList) {
            if (item1.getName().equals(name) || item1.getBarcode().equals(name)) {
                System.out.println("해당 상품의 가격은 " + item1.getPrice() + "원, 보유재고는 "+ item1.getStock() +" 입니다.");
                System.out.println("몇 개를 구매하시겠습니까?");
                int itemPcs = sc.nextInt();
                if (item1.getStock() < itemPcs) {
                    System.out.println("현재 해당 상품의 재고는 " + item1.getStock() + "개 입니다.");
                    System.out.println("해당 상품의 보유 재고 수량이 부족합니다.");
                } else {
                    System.out.println("구매에 성공하셨습니다.");
                    item1.setStock((item1.getStock() - itemPcs));
                }
            }
        }
    }
}
// 인터페이스란 도대체 무엇인가.
// 도대체 코드가 이것이 맞는가?
// 어떻게 해야 더 간결해질 것인가??????????????

