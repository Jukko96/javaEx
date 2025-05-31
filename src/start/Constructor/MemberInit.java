package start.Constructor;

public class MemberInit {
    public static void main(String[] args) {
        MemberConstructor member1 = new MemberConstructor("학생1",20,90);
        MemberConstructor member2 = new MemberConstructor("학생2",22,88);

        MemberConstructor member3 = new MemberConstructor("학생2",22);
    }
}
