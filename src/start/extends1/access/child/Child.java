package start.extends1.access.child;

import start.extends1.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue = 1;
        protectedValue = 2; //상속관계 or 다른 패키지
//        defaultValue = 3; //다른 패키지 접근 불가
//        privateValue = 4; //접근불가 컴파일 오류

        publicMethod();
        protectedMethod(); //상속관계 or 다른 패키지
//        defaultMethod(); //다른 패키지 접근 불가
//        privateMethod(); //접근불가 컴파일 오류
        printParent();
    }
}
