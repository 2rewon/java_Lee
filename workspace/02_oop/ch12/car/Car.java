package ch12.car;

// 필드와 메서드를 정의한 클래스
// 생성자 추가
public class Car {
    // 필드
    String model;
    int speed; // 필드를 초기화 하지 않으면 기본값으로 초기화 됨
    int gear;

    // 생성자: 인스턴스가 생성될 때 자동으로 호출되는 메서드
    // 기본 생성자: 매개변수가 없음.
//    Car(){
//        System.out.println("Car() 생성자 호출됨.");
//    }

    Car(String name){
        System.out.println("Car(String name) 생성자 호출됨.");
        this.model = name;
    }

    // 10km/h 가속한다.
    void speedUp() {
        speed += 10;
        System.out.println("가속합니다. 현재 속도는 " + speed + "Km/h 입니다.");
    }

    // 10km/h 감속한다.
    void speedDown(){
        speed -= 10;
        System.out.println("감속합니다. 현재 속도는 " + speed + "Km/h 입니다.");
    }
     // 기어를 1단 올린다.
    void gearUp(){
        gear ++;
        System.out.println("기어를 1단 올려서 " + gear + "단이 되었습니다.");
    }

    // 기어를 1단 내린다.
    void gearDown(){
        gear --;
        System.out.println("기어를 1단 내려서 " + gear + "단이 되었습니다.");
    }

    // 출발한다.
    void start(){
        System.out.println(model + "출발합니다.");
        gearUp();
        speedUp();
    }

    // 멈춘다.
    void stop(){
        System.out.println("멈춥니다.");
        gear = 0;
        while(speed > 0){
            speedDown();
        }
    }
}
