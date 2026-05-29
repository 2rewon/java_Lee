package ch07;

public class SwitchTest2 {
    public static void main(String [] args) {
        int price = 10000;
        double lastPrice = price;
        char grade = 'A';
        double discountRate = 0;

        // if
        if ( grade == 'A') {
            discountRate = 50;
            lastPrice = price * (1 - discountRate / 100);
        } else if (grade =='B'){
            discountRate = 30;
            lastPrice = price * (1 - discountRate / 100);
        } else if (grade == 'C'){
            discountRate = 10;
            lastPrice = price * (1 - discountRate / 100);
        } else if (grade == 'D'){
            discountRate = 0;
            lastPrice = price * (1 - discountRate / 100);
        }

        System.out.println("회원님은 "+grade+ "등급이므로 정상가 "+price+ "원에서 "
                +discountRate+ "% 할인된 가격 " +lastPrice+ "원입니다.");
    }
}
