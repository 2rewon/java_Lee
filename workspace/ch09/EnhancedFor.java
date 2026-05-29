package ch09;

public class EnhancedFor {
    public static void main(String[]args) {
//        int[] scores = {90, 80, 75}; // 3과목
        int[] scores = {100, 80, 70, 88}; // 4과목

        int sum = 0; // 총점
        double avg = 0; // 평균

        // 과목 수와 상관없이 총점과 평균을 계산하세요.
//        sum += scores[0];
//        sum += scores[1];
//        sum += scores[2];
//        sum += scores[3];
//
//        avg = sum / 4;

        // 일반 for문
//        for(int i=0; i<scores.length; i++)
//        {
//            sum += scores[i];
//        }

        //Enhanced for loop(향상된 for문)
        for(int score : scores) // int score = scores[i];
        {
            sum += score;
        }

        avg = (double)sum / scores.length;

        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);
    }
}