package start.poly.basic;

public class CastingMain {
    public static void main(String[] args) {
        //부모 변수가 자식 인ㅅ턴스 참조(다형적 참조)
        Parent poly = new Child();
        //자식의 기능은 호출 불가능(컴파일 에러)
//        start.poly.childMethod();

        //다운 캐스팅 (부모타입 -> 자식타입)
        Child child = (Child) poly;
        child.childMethod();
    }
}
