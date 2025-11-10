package mid1.nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outStanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print (){
            // 자신의 멤버에 접근
            System.out.println("nestedInstanceValue = " + nestedInstanceValue);

            //바깥 클래스 인스턴스 멤버에는 접근 불가능
            //System.out.println("outStanceValue = " + outStanceValue);

            //바깐 클래스의 멤버에는 접근 가능 private도 가능
            System.out.println("outClassValue = " + outClassValue);
            System.out.println("NestedOuter.outClassValue = " + NestedOuter.outClassValue);
        }
    }
}
