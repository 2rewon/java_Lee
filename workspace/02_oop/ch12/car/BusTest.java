package ch12.car;

public class BusTest {
    void main(){
//        // Car 인스턴스를 생성한다.
//        // 인스턴스를 생성할 때 사용한 클래스가 생성한 인스턴스의 타입이 된다.
//        Car mycar = new Car();
//        // 인스턴스의 필드나 메서드를 접근할때 . 연산자를 사용한다.
//        mycar.model = "아우디 ";

        Bus mycar = new Bus("BMW ", "10-2", "마을 버스",
                new String[]{"우리 집", "김포 고등학교", "김포 시청"}, 1300, 15);

        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();

        mycar.stop();
        mycar.ride();
        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.stop();
        mycar.ride();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.ride();
        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.stop();
        mycar.leave();
        mycar.leave();
        mycar.ride();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();
        mycar.leave();


        System.out.println(mycar.getBusInfo());
    }
}
