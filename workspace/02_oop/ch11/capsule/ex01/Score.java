package ch11.capsule.ex01;

// 시험 결과를 관리하는 클래스
public class Score {
    int kor;
    int eng;
    int math;

    // 총점을 계산해서 반환하는 메서드
    int sum(){
        return kor+eng+math;
    }
    // 평균을 계산해서 반환하는 메서드(소수 셋째자리에서 반올림)
    double avg(){
//        return sum() /3.0;
        double result = Math.round(100*sum() / 30.0)/100;
        return result;
    }
}
