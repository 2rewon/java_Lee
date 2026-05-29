package ch07;

 // 입력한 숫자가 3의 배수일 경우 "3의 배수입니다."를 출력하고 그렇지 않을 경우 출력X

public class IfTest {
   public static void main(String[] args) {
    int num = 14;

    if(num % 3 == 0) {
        System.out.println(num + "는 3의 배수입니다.");
    }
    else{
        System.out.println(num + "는 3의 배수가 아닙니다.");
    }
    }
}
