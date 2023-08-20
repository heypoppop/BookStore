import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 환영인사
        System.out.println("어서오세요. 찬영이네 책방입니다.");
        // Menu
        while (true) {
            System.out.println("-------------------------------------------------");
            System.out.println("<숫자로 메뉴 선택>\n1. Item 등록\n2. Item 전체 조회\n3. Item 검색\n4. Item구매\n5. 탈출하기");
            System.out.println("-------------------------------------------------");
            System.out.print("선택 : ");
            int userInput = sc.nextInt();
            if (userInput == 5) {System.out.println("안녕히 가세요!!!"); break;}
            switch (userInput) {
                case 1: // TODO 1.Item 등록
                    System.out.println("판매상품 등록 메뉴 입니다.");
                    break;
                case 2: // TODO 2.Item 전체 조회
                    System.out.println("전체 조회 메뉴 입니다.");
                    break;
                case 3: // TODO 3.Item 검색
                    System.out.println("특정 상품을 검색합니다.");
                    break;
                case 4: // TODO 4.Item 구매
                    System.out.println("상품을 구매합니다.");
                    break;
                default:
                    System.out.println("여기서 이러시면 곤란합니다. 숫자로 선택해주세요 제발요");
                    break;
            }
        }

    }
}
