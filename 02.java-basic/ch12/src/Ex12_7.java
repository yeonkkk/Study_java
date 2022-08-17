class Parent {
    void parentMethod() {}
}

class Child extends Parent {
    @Override
    void parentMethod() {}
//    void parentmethod() {} // 이름을 잘못적었다.
}

public class Ex12_7 {
    public static void main(String[] args) {
        Child test = new Child();
//        test.parentmethod();
        test.parentMethod();
    }
}
