import product.Book;
import product.Item;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 환영인사
        Store store = new Store("찬영이네");
        // Menu
        while (true) {
            System.out.println("-------------------------------------------------");
            System.out.println("<숫자로 메뉴 선택>\n1. 상품 등록\n2. 상품 수정\n3. Item 전체 조회\n4. 상품 검색\n5. 상품 구매\n6. 탈출하기");
            System.out.println("-------------------------------------------------");
            System.out.print("선택 : ");
            int userInput = sc.nextInt();
            if (userInput == 5) {System.out.println("안녕히 가세요!!!"); break;}
            switch (userInput) {
                case 1: // TODO 1.Item 등록
                    System.out.println("판매상품 등록 메뉴 입니다.");
                    System.out.println("어떤 상품을 등록하시겠습니까?");
                    System.out.println("1. 책\n2. DVD\n3. 장난감");
                    userInput = sc.nextInt();
                    switch (userInput) {
                        case 1: // Book 등록
                            store.createItem("Book");
                            break;
                        case 2: // DVD 등록
                            store.createItem("DVD");
                            break;
                        case 3: // Toy 등록
                            store.createItem("Toy");
                            break;
                    }
                    break;
                case 2: // TODO 2. 상품 수정
                    System.out.println("상품 수정 메뉴입니다.");
                    System.out.println("1. 재고 수정하기 \n2. 가격 수정하기");
                    userInput = sc.nextInt();
                    switch (userInput) {
                        case 1: // 재고 수정하기
                            store.setStock();
                            break;
                        case 2: // 가격 수정하기
                            store.setPrice();
                            break;
                    }
                    break;
                case 3: // TODO 3. 상품 전체 조회
                    System.out.println("전체 조회 메뉴 입니다.");
                    store.allItems();
                    break;
                case 4: // TODO 4.상품 검색
                    System.out.println("검색할 상품명을 입력해주세요.");
                    String userStrInput = sc.nextLine();
                    sc.nextLine();
                    store.searchItem(userStrInput);
                    break;
                case 5: // TODO 5.상품 구매
                    System.out.println("상품을 구매합니다.");
                    store.buyItem();
                    break;
                default:
                    System.out.println("여기서 이러시면 곤란합니다. 숫자로 선택해주세요 제발요");
                    break;
            }
        }

    }
}
