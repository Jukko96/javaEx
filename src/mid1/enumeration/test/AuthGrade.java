package mid1.enumeration.test;

public enum AuthGrade {
    GUEST(1,"게스트"),LOGIN(2,"회원"),ADMIN(3,"관리자");
    private final String description;
    private final int level;

    AuthGrade(int level, String description){
        this.level = level;
        this.description = description;
    }

//    public void getLevel (){
//        System.out.println(this.name() + " 의 레벨 : "+ this.level);
//    }
//
//    public void getDescription (){
//        System.out.println(this.name() + " 의 설명 : "+ this.description);
//    }

    public String getDescription() {
        return description;
    }

    public int getLevel() {
        return level;
    }
}
