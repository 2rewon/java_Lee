package ch09;

//국어, 영어, 수학 점수를 이용해서 총점과 평균을 계산
public class ScoreArrayTest {
    public static void main(String[]args) {
//        int[] haruScore; // 배열 선언
//        haruScore = new int[3]; // 배열 생성(개수 지정), int 3개 = 12byte의 메모리(힙) 할당하고 그 주소를 반환

//        int[] haruScore = new int[3]; //배열 선언과 생성을 동시에

        int[] haruScore = new int[]{100, 90, 85}; //배열 선언, 생성, 초기화를 동시에

//        haruScore[0] = 100; // 배열 요소 값 할당(index를 이용해서 배열에 접근)
//        haruScore[1] = 90;
//        haruScore[2] = 85;

        System.out.println("국어 점수: " + haruScore[0]);
        System.out.println("영어 점수: " + haruScore[1]);
        System.out.println("수학 점수: " + haruScore[2]);

        int sum = haruScore[0] + haruScore[1] + haruScore[2];
        double avg = sum / 3.0; //평균, 반올림
//        avg = Math.round(avg); //소수 첫째자리 반올림, 92
        avg = Math.round(avg * 10.) / 10.0; //소수 둘째자리 반올림, 91.7

        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);
    }
}
