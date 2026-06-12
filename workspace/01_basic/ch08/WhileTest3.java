package ch08;

// 6이 나올 때까지 주사위를 던진다.
public class WhileTest3 {
    public static void main(String[] args) {
        int testCount = 0;
        while (testCount < 100) {
            int num = 0;
            int count = 0;
//        // Math.random(): 0이상 1미만의 무작위 double 타입의 숫자를 반환
//        num = (int)(Math.random()*6) + 1; // 0이상 6미만의 수
//        System.out.println(num);
            while (num != 600) {
                //주사위 던지기
                num = (int) (Math.random() * 600) + 1;
                //System.out.println(num);
                count++;
            }

            System.out.println("반복 횟수: " + count);
            testCount++;
        }
    }
}
