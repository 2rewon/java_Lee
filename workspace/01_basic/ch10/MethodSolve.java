package ch10;

public class MethodSolve {

    // 총점을 계산해서 반환하는 메서드
    int sum(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }

    // 평균을 계산해서 반환하는 메서드
    double avg(int[] scores) {
        int sum = sum(scores);
        double scoreAvg = (double) sum / scores.length;
        return scoreAvg;
    }

    //int[] 점수 배열을 전달 받아서 총점, 평균을 출력하는 메서드
    void printScore(int[] scores) {
        int total = sum(scores);
        double scoreAvg = avg(scores);
        System.out.println("총점: " + total + ", 평균: " + scoreAvg);
    }

    void main() {
        // haru는 국어, 영어, 수학 점수가 각각 80, 70, 56이다.
        // namu는 90, 77, 80
        // brong은 100, 99, 88

        // 이 셋의 총점과 평균을 구해서 출력하세요.
        int[] haruScore = {80, 70, 56};
        int[] namuScore = {90, 77, 80};
        int[] brongScore = {100, 99, 88};

        printScore(haruScore);
        printScore(namuScore);
        printScore(brongScore);
    }
}