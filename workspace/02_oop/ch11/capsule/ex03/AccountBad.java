package ch11.capsule.ex03;

public class AccountBad {
    // 잔고
    public int balance;

    // 입금
    public void deposit(int amount){
        if(amount > 0) {
            this.balance += amount;
            System.out.println(amount + "원이 입금되었습니다. 잔고는" + balance + " 원입니다.");
        }
        else{
            System.out.println("입금액이 잘못되었습니다.");
        }
    }

    // 출금
    public void withdraw(int amount){
        if(balance >= amount) {
            this.balance -= amount;
            System.out.println(amount + "원이 출금되었습니다. 잔고는" + balance + "원입니다.");
        }
        else{
            System.out.println("잔고가 부족합니다.");
        }
    }
}
