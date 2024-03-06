package day3;

public class LocalVariable {
    public static int test() {
        int num = 10;

        return num;
    }


    public static void main(String[] args) {
        int num = test();
        System.out.println(num);

        Person.introduce(); // 안녕하세요 저는 20살입니다.
        Person.addAge(); // 나이 1 증가
        Person.introduce(); // 안녕하세요 저는 21살입니다.


    }
}
