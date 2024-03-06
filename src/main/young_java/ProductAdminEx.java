package young_java;

import java.util.Scanner;

public class ProductAdminEx {

    public static class Products{
        String productName;
        int price;
    }

    public static void main(String[] args) {
        int maxProduct = 3;
        Products[] productsArray = new Products[maxProduct];
        int productCount = 0;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1: 상품 입력, 2: 상품목록 출력, 3: 프로그램 종료");
            int option = sc.nextInt();
            if (option == 1) {
                if(productCount>maxProduct-1){
                    System.out.println("상품을 더이상 등록할 수 없습니다.");
                    continue;
                }
                Products product = new Products();
                System.out.print("상품 명을 입력하시오:");
                product.productName = sc.next();
                System.out.print("상품 가격을 입력하시오:");
                product.price= sc.nextInt();
                productsArray[productCount++] = product; // 상품 정보 저장
                continue;
            }else if(option ==2){
                if(productCount<1){
                    System.out.println("상품을 입력해 주세요");
                    continue;
                }
                for (Products products : productsArray) {
                    System.out.println("상품명: " + products.productName + ", 가격: " + products.price);
                }
                continue;
            }else if(option ==3){
                System.out.println("프로그램을 종료합니다");
                break;
            }else {
                System.out.println("정확한 숫자를 입력해주세요");
            }
            sc.close();

        }
    }
}
