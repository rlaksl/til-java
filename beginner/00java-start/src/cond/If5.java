package cond;

public class If5 {
    public static void main(String[] args) {
        // if-else: 서로 연돤된 조건일 때 if-else로 묶어서 사용
        // 조건이 서로 영항을 주지 안호 각각 수행해야 하는 경우에는 분리해서 사용해야 함

        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10,000원 이상 구매, 1,000원 할인");
        }

        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1,000원 할인");
        }

        System.out.println("총 할인 금액: " + discount + "원");
    }
}
