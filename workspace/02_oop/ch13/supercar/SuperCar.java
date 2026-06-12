package ch13.supercar;

public class SuperCar {
    int zero100;

    SuperCar(int zero100){
        this.zero100 = zero100;
    }
    void move(){
        System.out.println("슈퍼카가 시속 100km/h를 달성하는데에 " + zero100 + "초 걸렸다.");
    }
}
