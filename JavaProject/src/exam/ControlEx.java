package exam;

import java.util.Scanner;

public class ControlEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int productNo;
        String productName = "";
        int price = 0;
        int quantity;
        int orderPrice;
        int discount = 0;
        int totalPrice;

        System.out.println("******** 상품 정보 ********");
        System.out.println("1 노트북 : 1,200,000 원");
        System.out.println("2 디지털카메라 : 400,000 원");
        System.out.println("**************************");

        System.out.print("상품번호 입력 : ");
        productNo = sc.nextInt();

        if (productNo == 1) {
            productName = "노트북";
            price = 1200000;
        } else if (productNo == 2) {
            productName = "디지털카메라";
            price = 400000;
        } else {
            System.out.println("잘못 입력하였습니다. 종료합니다.");
            return;
        }

        System.out.print("주문 수량 입력 : ");
        quantity = sc.nextInt();

        orderPrice = price * quantity;

        if (orderPrice >= 1000000) {
            discount = orderPrice * 10 / 100;
        } else if (orderPrice >= 500000) {
            discount = orderPrice * 5 / 100;
        } else {
            discount = 0;
        }

        totalPrice = orderPrice - discount;

        System.out.println();
        System.out.println("******** 주문 내용 ********");
        System.out.println("상품명 : " + productName);
        System.out.println("가격 : " + price + " 원");
        System.out.println("주문 수량 : " + quantity + " 개");
        System.out.println("주문액 : " + orderPrice + " 원");
        System.out.println("할인액 : " + discount + " 원");
        System.out.println("총지불액 : " + totalPrice + " 원");

        sc.close();
    }
}
