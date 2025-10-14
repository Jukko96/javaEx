package mid1.enumeration.test;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        //AuthGrade 의 내용을 출력
        AuthGrade[] authGrades = AuthGrade.values();


        for (AuthGrade authGrade : authGrades) {
            System.out.println( authGrade.name() + "의 레벨 : "+ authGrade.getLevel() + ", 설명 : "+ authGrade.getDescription());
        }
    }
}
