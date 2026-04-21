package collection.test.ex4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private Map<String, Member> memberList = new HashMap<>();

    public void save(Member member) {
        memberList.putIfAbsent(member.getId(), member);
    }

    public Member findById(String id) {
        return memberList.get(id);
    }

    public Member findByName(String name) {
        for (Member member : memberList.values()) {
            if(member.getName().equals(name)){
                return member;
            }
        }
        return null;
    }

    public void remove(String id) {
        memberList.remove(id);
    }
}
