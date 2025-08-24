package mid1.lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        Class clazz = String.class; //1.클래스에서 조회
//        Class clazz = new String().getClass(); //2. 인스턴스에서 조회
//        Class clazz = Class.forName("java.lang.String"); //3.문자열로 조회


        //모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field : " + field);
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method :  "+ method);
        }

        //상위 클래스
        System.out.println("SuperClass : " + clazz.getSuperclass().getName());

        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("interface ; "+ anInterface);
        }
    }
}
