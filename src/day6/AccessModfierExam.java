package day6;

public class AccessModfierExam {
    public static void main(String[] args) {
        // 출력 : 제 번호는 20 입니다.
        Person p1 = new Person();
//        p1.id = 20;
        p1.setId(20);

//        p1.age = 20;
        System.out.println("제 번호는 " + p1.getId() + " 입니다.");

//        p1.printAge();

//        p1.age = -20;// 나이가 음수인 것은 이상하다. 하지만 -20이 들어오는 것을 막을 수 없다.
        p1.setAge(-20);
//        p1.printAge();
    }
}

class Person {
    private int id;
    private int age;
    private String name;
    private String address;

    // 힌트 : 여기에 메소드 2개 추가해야 합니다.

    // 카멜표기법 : 단어 여러개 조합해서 명명할 때 의미가 바뀌는 부분에서 대문자를 넣어주는 방식


    // alt + insert => getter, setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}