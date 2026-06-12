package ch12.animal;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal haru = new Dog(); // 자식 인스턴스를 부모의 타입으로 선언 가능함.
//        haru.eat(); // 부모에게 물려받은 메서드
//        haru.bark(); // 추가한 메서드
//        animalCare(haru);

        // is a 관계가 성립되지 않는 잘못된 상속
//        Notebook book = new Notebook();
//        animalCare(book);

        Cat c = new Cat();
        animalCare(haru);
        animalCare(dog);
        animalCare(c);
    }

    // 동물 관리 서비스
    static void animalCare(Animal a){
        // Animal.eat()를 호출하는 동일한 코드지만
        // 실제 생성된 객체의 오버라이딩 된 메서드가 호출됨.
        a.eat();
        a.move();
        a.sleep();
    }

    // 강아지 관리 서비스
    static void animalCare(Dog a){
        a.eat();
        a.sleep();
        a.move();
        a.bark(); // Animal에는 정의되어 있지 않음.
    }

    static void animalCare(Cat a){
        a.eat();
        a.move();
        a.sleep();
        a.liquefy();
    }
}