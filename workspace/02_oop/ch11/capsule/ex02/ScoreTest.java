package ch11.capsule.ex02;

public class ScoreTest {
    public static void main(String[]args){
        Score haru = new Score(100,90,85);
//        haru.kor = 100; //private을 써서 필드의 직접 접근이 제한됐음.
//        haru.eng = 90;
//        haru.math = 85;
        int haruSum = haru.sum();
        double haruAvg = haruSum / 3;
        System.out.println("하루의 총점: " + haruSum);
        System.out.println("하루의 평균: " + haruAvg);
    }
}