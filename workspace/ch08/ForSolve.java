package ch08;

public class ForSolve {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        
        // 1~100 합계
        for(i=1; i<=100; i++)
        {
            sum = i+sum;
        }
        System.out.println("1~100의 합계: " + sum);

        // 1~100 홀수 합계
        for(i=1, sum=0; i<=100; i+=2)
        {
            sum += i;
        }
        System.out.println("1~100의 홀수의 합계: " + sum);

        // 1~100 짝수 합계
        for(i=2, sum=0; i<=100; i+=2)
        {
            sum += i;
        }
        System.out.println("1~100의 짝수의 합계: " + sum);
    }
}
