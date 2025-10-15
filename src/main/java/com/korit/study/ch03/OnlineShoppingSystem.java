package com.korit.study.ch03;

import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stock, productPrice, zipCode, deliveryFee, unitPrice, totalPrice;
        String customerId, productCode, productName, deliveryFeeNotice, address;

        System.out.print("고객 ID를 입력하세요: ");
        customerId = scanner.nextLine();
        System.out.print("상품 코드를 입력하세요: ");
        productCode = scanner.nextLine();
        System.out.print("상품명을 입력하세요: ");
        productName = scanner.nextLine();
        System.out.print("수량을 입력하세요: ");
        stock = scanner.nextInt();
        System.out.print("단가를 입력하세요: ");
        productPrice = scanner.nextInt();
        System.out.print("우편번호를 입력하세요: ");
        zipCode = scanner.nextInt();
        System.out.print("배송 주소를 입력하세요: ");
        scanner.nextLine();
        address = scanner.nextLine();

        unitPrice = productPrice * stock;
        deliveryFee = unitPrice < 30000 ? 3000 : 0;
        deliveryFeeNotice = deliveryFee == 3000 ? "3,000원 (3만원 이상 구매시 무료)" : "무료 (3만원 이상 구매)";
        totalPrice = unitPrice + deliveryFee;

        System.out.println("=== 주문 확인서 ===");
        System.out.printf("""
                고객 ID: %s
                상품 정보:
                  - 상품코드: %s
                  - 상품명: %s
                  - 단가: %,d원 × %,d개 = %,d원
                배송 정보:
                  - 우편번호: %d
                  - 주소: %s
                  - 배송비: %s
                총 결제 금액: %,d원
                """,
                customerId, productCode,
                productName, productPrice,
                stock, unitPrice,
                zipCode, address,
                deliveryFeeNotice, totalPrice);

        scanner.close();
    }
}
