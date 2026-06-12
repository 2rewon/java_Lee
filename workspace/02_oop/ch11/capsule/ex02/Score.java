package ch11.capsule.ex02;

// 시험 결과를 관리하는 클래스
public class Score {
    private int kor;
    private int eng;
    private int math;

    public Score(int kor) {
        this.kor = kor;
    }

    Score(int kor, int eng, int math){
        if(100 > kor || 0 > kor){
            System.out.println("점수는 0~100 사이여야 합니다.");
        }
        else{
            this.kor = kor;

        }
        if(100 > eng || 0 > eng){
            System.out.println("점수는 0~100 사이여야 합니다.");
        }
        else{
            this.eng = eng;

        }
        if(100 > math || 0 > math){
            System.out.println("점수는 0~100 사이여야 합니다.");
        }
        else{
            this.math = math;
        }
    }

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
