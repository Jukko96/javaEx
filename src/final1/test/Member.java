package final1.test;

public class Member {
    final String id;
    String name;
    public Member(String id,String name) {
        this.id = id;
        this.name = name;
    }
    public void changeValue(String id,String name){
//        this.id = id; //final은 변경 불가
        this.name = name;
    }
    public void print(){
        System.out.println("id :" + this.id);
        System.out.println("name :" + this.name);
    }
}
