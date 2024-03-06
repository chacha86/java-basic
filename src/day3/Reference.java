package day3;

public class Reference {
    public static void main(String[] args) {
        Person p1 = new Person(); // 객체가 힙 메모리에 생성
        Person p2 = new Person();

        System.out.println(p1);
        System.out.println(p2);

        p1.name = "홍길동";
        p1.age = 20;
        p1.home = "서울";

        System.out.println(p1.name);

        // 사람 복사
        Person p3 = p1; // 홍길동 정보를 p3에 복사
        System.out.println(p3.name);

        // 홍길동은 2명이 된걸까? X
        // 홍길동 객체가 복사된 것이 아니라 참조값이 복사된 것이기 때문에
        // 홍길동 객체는 여전히 1개이며 p1과 p3는 같은 객체를 참조하고 있다.

        p3.name = "이순신";

        System.out.println(p3.name);
        System.out.println(p1.name);

        // 손흥민을 2명 만들어주세요.(단 코드의 중복은 없어야 합니다.)


    }
}

class Person {
    String name;
    int age;
    String home;
}

