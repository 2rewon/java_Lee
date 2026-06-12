package ch11;

public class MemberTest {
    String id;

    MemberTest(String id){
        this.id = id;
    }
    // 생성자 정의: 리턴 타입 없음, 이름은 클래스명과 동일해야함.
    public static void main(String[] args){
        MemberTest member = new MemberTest("Lee");
        System.out.println("회원 아이디: " + member.id);
    }
}
