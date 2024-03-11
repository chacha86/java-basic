package day6;

public class AccessModfierExam {
    public static void main(String[] args) {
        // 출력 : 제 번호는 20 입니다.
        Person p1 =  new Person();
//        p1.id = 20;
        p1.setId(20);

//        p1.age = 20;
        System.out.println("제 번호는 " + p1.getId() + " 입니다.");

        p1.printAge();

//        p1.age = -20;// 나이가 음수인 것은 이상하다. 하지만 -20이 들어오는 것을 막을 수 없다.
        p1.setAge(-20);
        p1.printAge();
    }
}

class Person {
   private int id;
   private int age;

    // 힌트 : 여기에 메소드 2개 추가해야 합니다.
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setAge(int age) {
        if(age < 0) {
            System.out.println("나이는 음수가 될 수 없습니다.");
            return;
        }
        this.age = age;
    }
    public void printAge() {
        System.out.println("제 나이는 " + this.age + " 입니다.");
    }

}