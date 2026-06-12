package ch08;

import java.util.Scanner;

public class ForTest4 {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in); // 사용자가 입력한 데이터를 받을 때 사용
        int dan = s.nextInt(); // 입력한 값을 int로 호출
        System.out.println("입력한 값" + dan);
        int i=1;
        int multipl = 1;
        for(i=1;i<10;i++)
        {
            multipl = dan*i;
            System.out.println(dan+"x"+i+"=" + multipl);
        }
    }
}
