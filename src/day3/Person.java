package day3;

public class Person {
    String name;
    static int age = 20; // 함수가 공유하는 변수 -> 클래스 변수
    String home;


    public static void introduce() {
//        int age = 20; // 지역변수
        System.out.println("안녕하세요 저는 " + age + "살입니다.");
    }

    public static void addAge() {
//        int age = 20; // 지역변수
        age++;
    }

}
