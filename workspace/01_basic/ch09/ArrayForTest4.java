 package ch09;

import java.util.Scanner;

    public class ArrayForTest4 {
            public static void main(String[]args) {
                Scanner s = new Scanner(System.in); // 사용자가 입력한 데이터를 받을 때 사용
                int dan = s.nextInt(); // 입력한 값을 int로 호출
                System.out.println("입력한 값" + dan);

                int[] result = new int[9];

                for(int i =0;i<result.length;i++)
                {
                    result[i] = dan * (i+1); // dan=3 i=0 result[0] = 3*1,  i=1 result[1]=3*2, i=2 result[2]=3*3
                }
                System.out.println(dan + "단 학습 완료!");

                System.out.println("곱할 숫자를 입력하세요. 0을 입력하면 종료됩니다.");
                int num = s.nextInt();
                System.out.println(dan + " x " + num + " = " + result[num-1]);
            }
    }
