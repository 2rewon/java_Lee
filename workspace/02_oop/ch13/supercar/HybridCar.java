package ch13.supercar;

public class HybridCar extends SuperCar{
    HybridCar(int zero100){
        super(zero100);
    }
    @Override
    void move() {
        super.move();
        System.out.println("하이브리드입니다.");
    }
}
