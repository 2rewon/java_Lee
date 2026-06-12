package ch08;

public class ForTest6 {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++)
        {
            for(int k=2; k<=9; k++)
            {
                System.out.print(k + "x" + i + "=" + (k*i) + "\t");
            }
            System.out.println();
        }
    }
}
