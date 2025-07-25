package mid1.lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");
        MemberV2 memberA = new MemberV2("회원A",address);
        MemberV2 memberB = new MemberV2("회원B",address);

        //회원A,회원B 의 주소는 모두 서울
        System.out.println("MemberA = " + memberA);
        System.out.println("MemberB = " + memberB);

        //회원B의 주소를 부산으로 변경해야함
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("memberB.address -> 부산");
        System.out.println("MemberA = " + memberA);
        System.out.println("MemberB = " + memberB);

    }
}
