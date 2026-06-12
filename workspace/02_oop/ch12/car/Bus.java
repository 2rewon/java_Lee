package ch12.car;

public class Bus extends Car{
    // 컴파일러에 의해서 자동으로 생성되는 기본 생성자 모습
//    Bus(){
//        super();
//    }
    private int passengerCount; // 승객 수
    private String no;  // 버스 번호
    private String type;    // 광역 버스, 마을 버스 ...
    private String[] stations;  // 노션
    private int station; // 현재 위치
    private int price;  // 승차비
    private int maxPassenger;   // 최대 승객 수
    private int money;  // 현재까지의 수익
    private int totalMoney; // 운영하는 모든 버스의 수익

    public Bus(String model, String no, String type, String[] stations, int price, int maxPassenger) {
        super(model);
        this.no = no;
        this.type = type;
        this.stations = stations;
        this.price = price;
        this.maxPassenger = maxPassenger;
    }

    // 승차
    void ride(){
        if(passengerCount < maxPassenger) {
            passengerCount++;
            System.out.println("1명이 승차하였습니다.");
        }
        else{
            System.out.println("승차 인원이 초과되었습니다. 다음 버스를 타세요.");
        }
    }

    // 하차
    void leave(){
        if(passengerCount > 0) {
            passengerCount--;
            System.out.println("1명이 하차하였습니다.");
        }
        else{
            System.out.println("승객이 없습니다.");
        }
    }

    // 부모 메서드를 자식이 재정의 (오버라이딩)
    void stop(){
        super.stop(); // suepr.stop()을 통해서 부모의 stop() 메서드를 호출
        station++;
        if(station == stations.length){
            station = 0;
        }
        System.out.println("이번 역은 " + stations[station] + "역입니다. This stop is " + stations[station] + " station");
    }

    // 버스의 현재 상태를 출력
    String getBusInfo(){
        return "버스 번호" + no
                + ", 종류: " + type
                + ", 현재 위치: " + stations[station]
                + ", 남은 좌석: " + (maxPassenger - passengerCount)
                + ", 요금: " + price;
    }
}
