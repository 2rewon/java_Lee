package ch09;

public class ArrayBasic {
    public static void main(String[]args) {
        int[] Scores = new int[3]; // scores int 배열을 선언하고 생성 (크기3)

        String[] names = new String[3]; // names String 배열을 선언하고 생성 (크기3)

        Scores[0] = 1; // scores 배열의 각 요소에 값을 할당
        Scores[1] = 5;
        Scores[2] = 10;

        names[0] = "A"; // names 배열의 각 요소에 값을 할당
        names[1] = "B";
        names[2] = "C";

        System.out.println("Scores 두번째 요소: " + Scores[1]); // scores 배열의 두번째 요소값을 출력

        System.out.println("names의 요소: " + names[0] + names[1] + names[2]);// names 배열의 모든 요소값을 출력
    }
}
