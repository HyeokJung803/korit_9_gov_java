

package com.korit.study.ch08;

import java.util.Scanner;

public class Array05 {
    public static String[] names = new String[] {"잭 다니엘", "조니워커 블랙", "에반 윌리엄스 블랙", "히비키 하모니", "야마자키 12년", "와일드 터키", "시바스 리갈 18년"};
    public static int[] prices = new int[] {37000, 42000, 24900, 158000, 420000, 50400, 129000};
    static void main(String[] args) {
        // 추가(Create), 조회(Read), 수정(Update), 삭제(Delete)
        System.out.println("[ 주류 관리 시스템 ]");
        showMainMenuView();
    }

    public static void showMainMenuView() {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            System.out.println("1. 이름 추가");
            System.out.println("2. 이름 조회");
            System.out.println("3. 이름 수정");
            System.out.println("4. 이름 삭제");
            System.out.println("0. 종료");
            System.out.print("선택 : ");
            int selectedNumber = scanner.nextInt();
            scanner.nextLine();

            if (selectedNumber == 0) {
                isExit = true;
            } else if (selectedNumber == 1) {
                register();
            } else if (selectedNumber == 2) {
                showNameList();
            }
        }
    }
    public static void register() {
        Scanner scanner = new Scanner(System.in);
        String newName = null;
        int newPrice = 0;
        while (true) {
            System.out.println("[이름 추가 기능]");
            System.out.print("이름 입력 : ");
            newName = scanner.nextLine();
            System.out.print("가격 입력 : ");
            newPrice = scanner.nextInt();
            if(findByName(newName) == null) {
                break;
            }
            System.out.println("이미 존재하는 이름입니다. 다시 입력하세요.");
        }
        add(newName, newPrice);
        System.out.println("이름 추가 완료");
    }
    public static String findByName(String name) {
        for (String n : names) {
            if (n.equals(name)) {
                return n;
            }
        }
        return null;
    }
    public static void add(String name, int price) {
        String[] newNameArray = new String[names.length + 1];
        int[] newPriceArray = new int[prices.length + 1];
        for (int i = 0; i < names.length; i++) {
            newNameArray[i] = names[i];
        }
        newNameArray[newNameArray.length - 1] = name;
        names = newNameArray;
        for (int i = 0; i < prices.length; i++) {
            newPriceArray[i] = prices[i];
        }
        newPriceArray[newPriceArray.length - 1] = price;
        prices = newPriceArray;
    }
    public static void showNameList() {
        Scanner scanner = new Scanner(System.in);
        int size = 4;
        while (true) {
            System.out.println("주류 정보 조회");
            System.out.println("뒤로가려면 0을 입력하세요.");
            System.out.printf("페이지 번호 입력(1 ~ %d) :", getLastPage(size));
            int selectedPage = scanner.nextInt();
            scanner.nextLine();
            if (selectedPage == 0) {
                break;
            } else if (selectedPage > getLastPage(size) || selectedPage < 0) {
                System.out.println("해당 페이지는 찾을 수 없습니다.");
            } else {
                String[] nameOfPagination = Namepagination(selectedPage, size);
                int[] priceOfPagination = Pricepagination(selectedPage, size);
                for (int i = 0; i < nameOfPagination.length; i++) {
                    System.out.printf("%d. 이름 : %s | 가격 : %,d원\n", i + 1, nameOfPagination[i],priceOfPagination[i]);
                }
                System.out.println();
            }
        }

    }
    public static int getLastPage(int size) {
        return names.length % size == 0 ? names.length /size : names.length / size + 1;
    }
    public static String[] Namepagination(int page, int size) {
        int startIndex = (page - 1) * size; // (1 - 1) * 10 => 0, (2 - 1) * 10 => 10
        int lastPage = getLastPage(size);
        boolean isLast = page == lastPage;
        int paginationArraySize = isLast && names.length % size != 0 ? names.length % size : size;
        String[] paginationArray = new String[paginationArraySize];
        for (int i = startIndex; i < startIndex + paginationArraySize; i++) {
            paginationArray[i - startIndex] = names[i];
        }
        return paginationArray;
    }
    public static int[] Pricepagination(int page, int size) {
        int startIndex = (page - 1) * size; // (1 - 1) * 10 => 0, (2 - 1) * 10 => 10
        int lastPage = getLastPage(size);
        boolean isLast = page == lastPage;
        int paginationArraySize = isLast && prices.length % size != 0 ? prices.length % size : size;
        int[] paginationArray = new int[paginationArraySize];
        for (int i = startIndex; i < startIndex + paginationArraySize; i++) {
            paginationArray[i - startIndex] = prices[i];
        }
        return paginationArray;
    }
}
