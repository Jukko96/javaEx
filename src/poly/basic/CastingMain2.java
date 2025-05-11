package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        //부모 변수가 자식 인ㅅ턴스 참조(다형적 참조)
        Parent poly = new Child();
        //자식의 기능은 호출 불가능(컴파일 에러)
//        poly.childMethod();

        //다운 캐스팅 (부모타입 -> 자식타입)
        Child child = (Child) poly;
        child.childMethod();

        //일시적 다운 캐스팅 - 해당 메소드를 호출하는 순감만 캐스팅
        ((Child) poly).childMethod();
    }
}
