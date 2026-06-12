package ch07;

//나이에 따른 입장료 할인을 계산하는 프로그램을 작성하세요.
// 7세 이하: 영유아 100% 할인
// 8 ~ 13: 어린이 50%
// 14 ~ 19: 청소년 30%
// 65세 이상: 경로 우대 70% 할인

public class IfSwitchTest {
    public static void main(String[] args) {

        int age = 65;

        int price = 20000;
        double discountRate = 0;
        double lastPrice = price;

        switch(age) {
            case 1,2,3,4,5,6,7:
                discountRate = 100;
                break;

            case 8,9,10,11,12,13:
                discountRate = 50;
                break;
            case 14,15,16,17,18,19:
                discountRate = 30;break;
            case 20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64:
                discountRate = 0;
                break;

            default:
                discountRate = 70;
                break;
        }
        lastPrice = price * (1 - discountRate / 100);

        System.out.println("나이가 " + age + "세 이므로 할인율" + discountRate +
                "%가 적용되어 요금은" +lastPrice+ "원 입니다.");
    }
}
